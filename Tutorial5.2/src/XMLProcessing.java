import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.plaf.IconUIResource;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.StringReader;

public class XMLProcessing extends JPanel implements ActionListener {

	static public final String newline = "\n";
	JButton openButton, saveButton,verifyButton;
	JTextArea log;
	JFileChooser fc;
	protected Shell shell;

	public XMLProcessing() {
		super(new BorderLayout());

		// Create the log first, because the action listeners
		// need to refer to it.
		log = new JTextArea(30, 40);
		log.setForeground(Color.BLUE);
		log.setMargin(new Insets(5, 5, 5, 5));
		log.setEditable(true);
		
		JScrollPane logScrollPane = new JScrollPane(log);

		// Create a file chooser
		fc = new JFileChooser();

		// fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

		openButton = new JButton("Open File");
		openButton.addActionListener(this);

		saveButton = new JButton("Save File");
		saveButton.addActionListener(this);

		verifyButton = new JButton("Verify");
		verifyButton.addActionListener(this);
		
		
		
		// For layout purposes, put the buttons in a separate panel
		JPanel buttonPanel = new JPanel(); // use FlowLayout
		buttonPanel.add(openButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(verifyButton);
		

		// Add the buttons and the log to this panel.
		add(buttonPanel, BorderLayout.PAGE_START);
		add(logScrollPane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		try {
			XMLProcessing window = new XMLProcessing();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {



		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		JFrame frame = new JFrame("XML Processing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add content to the window.
		frame.add(new XMLProcessing());

		// Display the window.
		frame.pack();
		frame.setVisible(true);

	}
	
	public int VerifyXMLString(String strXMLString){

		final DocumentBuilder db;
		
		final org.w3c.dom.Document doc;
		
	        try {
				db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				InputSource is = new InputSource();
				is.setCharacterStream(new StringReader(strXMLString));

				doc =  db.parse(is);
				return 0;
				
			} catch (ParserConfigurationException | SAXException | IOException e) {
				
				e.printStackTrace();
				return 1;
			} 
		
	}
	
	
	
	

	
	public void VerifyXML (String FilePath ) throws FileNotFoundException {
		

		ScanXML temp = new ScanXML(FilePath); 
		
		if (temp.testXML() == 0) {
			log.setForeground(Color.BLUE);
			log.append(temp.displayXML());

		}
		else {
			log.setForeground(Color.RED);

		}
		
		
	}
	
	public void DisplayFile (String FilePath ) throws FileNotFoundException {
		Scanner in = new Scanner (new File(FilePath));

		
		while (in.hasNext()) {
			log.append(in.nextLine() + newline);		
		}
		
		in.close();

		
	}
	
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		
		
		// Handle open button action.
		if (e.getSource() == openButton) {
			int returnVal = fc.showOpenDialog(XMLProcessing.this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
			
				log.setText("");
				
				try {
					
					DisplayFile(file.getAbsolutePath());
					
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				}
			} else {
				log.append("Open command cancelled by user." + newline);
			}
			log.setCaretPosition(log.getDocument().getLength());

			// Handle save button action.
		} else if (e.getSource() == saveButton) {
			String strXMLOK = log.getText();
			
			
		    if (VerifyXMLString(strXMLOK) == 1 ) {
		    	log.append(newline + "XML Not Valid" + newline);
				log.setForeground(Color.RED);

		    }
			

			else {
			    int returnVal = fc.showSaveDialog(XMLProcessing.this);

			   	if (returnVal == JFileChooser.APPROVE_OPTION) {
			    	log.append("XML OK" + newline);
			    	String filename=fc.getSelectedFile().getAbsolutePath() ;
			    	
			    	try {
			    		
			    	    BufferedWriter out = new BufferedWriter(new FileWriter(filename));
			    	    out.write(strXMLOK);  
			    	    out.close();
			    	    
			    	    log.append("Now saved as " + filename + newline);
			    	}
			    	catch (IOException e1)
			    	{
			    	    System.out.println("Exception ");
			    	    log.append("Unable to write file " + filename + newline);

			    	}
			    	
			   	}
	
			   	else {
			   		log.append("Save command cancelled by user." + newline);
			   	}
			 
			   	log.setCaretPosition(log.getDocument().getLength());
			
			}
			
		} else if (e.getSource() == verifyButton) {
				File file = fc.getSelectedFile();
				log.append("Verifying: " + file.getName() + "." + newline);
				try {
					
					VerifyXML(file.getAbsolutePath());
					
				} catch (FileNotFoundException e1) {
					
					e1.printStackTrace();
				}
				
				
		}
	}

}

