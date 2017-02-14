import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;


public class ScanXML {
	static public final String newline = "\n";
	public String inpFileName = "";
	
	public ScanXML(String inpTextx) {
		this.inpFileName = inpTextx;
	}
	
	
	public String displayXML() {
		
	String stuff = "";

    try {	
        File inputFile = new File(this.inpFileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

        stuff += "Root element :"  + doc.getDocumentElement().getNodeName() + newline;
        NodeList nList = doc.getElementsByTagName("student");
        

        stuff += "---------------------------------------" + newline;
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
           Node nNode = nList.item(temp);
           stuff += "\nCurrent Element :"  + nNode.getNodeName() + newline;
            
           if (nNode.getNodeType() == Node.ELEMENT_NODE) {
              Element eElement = (Element) nNode;
              stuff += "Student roll no : " + eElement.getAttribute("rollno") + newline ;
                            
              stuff += "First Name : "  + eElement
                      .getElementsByTagName("firstname")
                      .item(0)
                      .getTextContent() + newline;
    
              stuff += "Last Name : " 
                      + eElement
                      .getElementsByTagName("lastname")
                      .item(0)
                      .getTextContent() + newline;
              
              stuff += "Nick Name : " 
                      + eElement
                      .getElementsByTagName("nickname")
                      .item(0)
                      .getTextContent() + newline;
              
              stuff += "Marks : " 
                      + eElement
                      .getElementsByTagName("marks")
                      .item(0)
                      .getTextContent() + newline;
              
              
           }
        }
        
        stuff += "That's good!";
        
     } catch (Exception e) {
        e.printStackTrace();
        stuff += "There is an error in the XML file!";
     }
	return stuff;
	
	}
	
	
	
	public Integer testXML() {
		
	Integer result = 0;

    try {	
        File inputFile = new File(this.inpFileName);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();

     } catch (Exception e) {
        e.printStackTrace();
        result = 1;
     }
	return result;
	
	}		
}
