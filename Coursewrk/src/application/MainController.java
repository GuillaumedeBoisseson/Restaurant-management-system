

/**
* This is the Controller Class of the Coursework program.
*
* @author  Guillaume de Boisséson
* @last modification   26-12-2016
* 
* This class is is made of various methods, including those that launch each .fxml
* file (which effectively are the pages of the app), and deals with all the functionalities
* of this software. 
* 
*/

package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Predicate;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainController {
	
	@FXML private VBox fields;
	@FXML private VBox VLogin;
	@FXML private Label lblStatus;
	@FXML private TextField txtUserName;
	@FXML private TextField txtPassword;
	@FXML private TextField txtUserNameAdmin;
	@FXML private TextField txtPasswordAdmin;
	@FXML private Button LoginAdmin;
	@FXML private Label lblStatusAdmin;
	@FXML private Button Login;
	@FXML private TextField EmployeeName;
	@FXML private TextField Starter1;
	@FXML private TextField Starter2;
	@FXML private TextField Starter3;
	@FXML private TextField Main1;
	@FXML private TextField Main2;
	@FXML private TextField Main3;
	@FXML private TextField Pudding1;
	@FXML private TextField Pudding2;
	@FXML private TextField Pudding3;
	@FXML private TextField TableNumber;
	@FXML private TextField SpecialRequest;
	@FXML private Button Add;
	@FXML private Button Add1;
	@FXML private TextField NewUsername;
	@FXML private TextField NewPassword;
	@FXML private Button AddNewUser;
	@FXML private Button DeleteUserAccount;
	@FXML private TextField IDelete;
	@FXML private TableView<User> accountList;
	@FXML private TableColumn <User, String>UsernameColumn;
	@FXML private Button ShowListEmployee;
	@FXML private Button CreateNewOrder;
	@FXML private Label label;
	@FXML private TableView<orderList> DataAnalysis;
	@FXML private TableColumn <orderList, String>Time;
	@FXML private TableColumn <orderList, String>Date;
	@FXML private TableColumn <orderList, String>DataTableNumber;
	@FXML private TableColumn <orderList, String>QuStarter1;
	@FXML private TableColumn <orderList, String>QuStarter2;
	@FXML private TableColumn <orderList, String>QuStarter3;
	@FXML private TableColumn <orderList, String>QuMain1;
	@FXML private TableColumn <orderList, String>QuMain2;
	@FXML private TableColumn <orderList, String>QuMain3;
	@FXML private TableColumn <orderList, String>QuPudding1;
	@FXML private TableColumn <orderList, String>QuPudding2;
	@FXML private TableColumn <orderList, String>QuPudding3;
	@FXML private TableColumn <orderList, String>DataSpecialRequest;
	@FXML private TableColumn <orderList, String>DataEmployee;
	@FXML TextField searchBox;
	@FXML private Button Export; 
	@FXML private Button Import; 
	
	Connection conn= SQLConnection.DbConnector();
	PreparedStatement pst= null;
	ResultSet rs = null;

	ObservableList<User> data=FXCollections.observableArrayList();
	ObservableList<orderList> data1=FXCollections.observableArrayList();
	FilteredList<orderList> filteredData=new FilteredList<>(data1,e->true);


	// Launches Login Page with back button from inside the program
	public void LoginBack(ActionEvent event) throws IOException{
		conn = SQLConnection.DbConnector();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene2 = new Scene(root,750,600);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene2);
	}
	// Checks if the Login data matches or not the database in LoginData
	public void Login(ActionEvent event) throws Exception{

		try{
			conn = SQLConnection.DbConnector();
			String query = "select * from main.LoginData where Username=? and Password=?";
			System.out.println("Query accepted");
			pst = conn.prepareStatement(query);
			pst.setString(1, txtUserName.getText());
			pst.setString(2, txtPassword.getText());
			rs = pst.executeQuery();
			
			if(rs.next()){
				lblStatus.setText("Login Successfull");
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Menu.fxml"));
				Scene scene1 = new Scene(root,750,600);
				scene1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene1);
				pst.close();
			} else{
				lblStatus.setText("Login Failed");
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("SQL Error");
			System.err.println(e);
		};
	}
	
	// Launches the Login Admin Page
	public void LoginAdminPage(ActionEvent event) throws IOException{
		conn = SQLConnection.DbConnector();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginAdmin.fxml"));
			Scene scene2 = new Scene(root,750,600);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene2);
	}
	
	//Login verification of Username and Password for ADMIN
		public void Loginadmin(ActionEvent event) throws Exception{
			
			try{
				conn = SQLConnection.DbConnector();
				String query = "select * from main.LoginDataAdmin where Username=? and Password=?";
				System.out.println("Query accepted");
				pst = conn.prepareStatement(query);
				pst.setString(1, txtUserNameAdmin.getText());
				pst.setString(2, txtPasswordAdmin.getText());
				rs = pst.executeQuery();
				
				if(rs.next()){
					lblStatusAdmin.setText("Login Successfull");
					AnchorPane root1 = (AnchorPane)FXMLLoader.load(getClass().getResource("MenuAdmin.fxml"));
					Scene scene2 = new Scene(root1,750,600);
					scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					Main.primaryStage.setScene(scene2);
					pst.close();			
				} else{
					lblStatusAdmin.setText("Login Failed");
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("SQL Error");
				System.err.println(e);
			};
		}

	//Launches the Admin Menu
	public void AdminMenu(ActionEvent event) throws IOException{
		conn = SQLConnection.DbConnector();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
			Scene scene2 = new Scene(root,750,600);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene2);
	}
	
	//Launches the menu after login page
	public void Menu(ActionEvent event) throws IOException{
		conn = SQLConnection.DbConnector();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Menu.fxml"));
			Scene scene3 = new Scene(root,750,600);
			scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene3);
	}
	
	// Launches the LoginData page
	public void AddUserPage(ActionEvent event) throws IOException{
		conn = SQLConnection.DbConnector();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("LoginData.fxml"));
			Scene scene3 = new Scene(root,750,600);
			scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.primaryStage.setScene(scene3);	
	}
				
	//Launches the TableChoice page
		public void TableChoice(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("TableChoice.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}

		//Launches the Data Analysis page
		public void DataAnalysisPage(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DataPage.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}
		
		// Launches the cook page
		public void CookPage(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("CookPage.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}

		// Loads the database of the LoginData Page into the table
		public void loaddDatabaseData(){
			data.removeAll(data);
			UsernameColumn.setCellValueFactory(new PropertyValueFactory <> ("Username"));
			
			
			String query ="select *  from main.LoginData";
			
			try{
				
				pst=conn.prepareStatement (query);
				rs= pst.executeQuery();
				
				while(rs.next()){
					data.add(new User(
							
							rs.getString("Username")
					));
					accountList.setItems(data);
				}
				pst.close();
				rs.close();
				
			} catch (Exception e) {
				System.err.print(e);
			}
			
		}
		
		
		//Loads the data from Orders3 (i.e. all the orders) into the table
		public void loaddDatabaseOrders(){
			Time.setCellValueFactory(new PropertyValueFactory <> ("Time"));
			Date.setCellValueFactory(new PropertyValueFactory <> ("Date"));
			DataTableNumber.setCellValueFactory(new PropertyValueFactory <> ("DataTableNumber"));
			QuStarter1.setCellValueFactory(new PropertyValueFactory <> ("QuStarter1"));
			QuStarter2.setCellValueFactory(new PropertyValueFactory <> ("QuStarter2"));
			QuStarter3.setCellValueFactory(new PropertyValueFactory <> ("QuStarter3"));
			QuMain1.setCellValueFactory(new PropertyValueFactory <> ("QuMain1"));
			QuMain2.setCellValueFactory(new PropertyValueFactory <> ("QuMain2"));
			QuMain3.setCellValueFactory(new PropertyValueFactory <> ("QuMain3"));
			QuPudding1.setCellValueFactory(new PropertyValueFactory <> ("QuPudding1"));
			QuPudding2.setCellValueFactory(new PropertyValueFactory <> ("QuPudding2"));
			QuPudding3.setCellValueFactory(new PropertyValueFactory <> ("QuPudding3"));
			DataSpecialRequest.setCellValueFactory(new PropertyValueFactory <> ("DataSpecialRequest"));
			DataEmployee.setCellValueFactory(new PropertyValueFactory <> ("DataEmployee"));
			
			String query ="select *  from main.Orders3";
			
			try{
				
				pst=conn.prepareStatement (query);
				rs= pst.executeQuery();
				
				while(rs.next()){
					
					data1.add(new orderList(
							
					rs.getString("Time"),
					rs.getString("Date"),
					rs.getString("TableNumber"),
					rs.getString("QuStarter1"),
					rs.getString("QuStarter2"),
					rs.getString("QuStarter3"),
					rs.getString("QuMain1"),
					rs.getString("QuMain2"),
					rs.getString("QuMain3"),
					rs.getString("QuPudding1"),
					rs.getString("QuPudding2"),
					rs.getString("QuPudding3"),
					rs.getString("SpecialRequest"),
					rs.getString("EmployeeName")							
							
					));
					DataAnalysis.setItems(data1);
				}
				
				pst.close();
				rs.close();
				
			} catch (Exception e) {
				System.err.print(e);
			}
			
		}
		// loads the data from Orders4 (i.e. for the current orders) in th table
		public void loaddDatabaseOrdersCook(){

			Time.setCellValueFactory(new PropertyValueFactory <> ("Time"));
			Date.setCellValueFactory(new PropertyValueFactory <> ("Date"));
			DataTableNumber.setCellValueFactory(new PropertyValueFactory <> ("DataTableNumber"));
			QuStarter1.setCellValueFactory(new PropertyValueFactory <> ("QuStarter1"));
			QuStarter2.setCellValueFactory(new PropertyValueFactory <> ("QuStarter2"));
			QuStarter3.setCellValueFactory(new PropertyValueFactory <> ("QuStarter3"));
			QuMain1.setCellValueFactory(new PropertyValueFactory <> ("QuMain1"));
			QuMain2.setCellValueFactory(new PropertyValueFactory <> ("QuMain2"));
			QuMain3.setCellValueFactory(new PropertyValueFactory <> ("QuMain3"));
			QuPudding1.setCellValueFactory(new PropertyValueFactory <> ("QuPudding1"));
			QuPudding2.setCellValueFactory(new PropertyValueFactory <> ("QuPudding2"));
			QuPudding3.setCellValueFactory(new PropertyValueFactory <> ("QuPudding3"));
			DataSpecialRequest.setCellValueFactory(new PropertyValueFactory <> ("DataSpecialRequest"));
			DataEmployee.setCellValueFactory(new PropertyValueFactory <> ("DataEmployee"));
			
			String query ="select *  from main.Orders4";
			
			try{
				
				pst=conn.prepareStatement (query);
				rs= pst.executeQuery();
				
				while(rs.next()){
					
					data1.add(new orderList(
							
					rs.getString("Time"),
					rs.getString("Date"),
					rs.getString("TableNumber"),
					rs.getString("QuStarter1"),
					rs.getString("QuStarter2"),
					rs.getString("QuStarter3"),
					rs.getString("QuMain1"),
					rs.getString("QuMain2"),
					rs.getString("QuMain3"),
					rs.getString("QuPudding1"),
					rs.getString("QuPudding2"),
					rs.getString("QuPudding3"),
					rs.getString("SpecialRequest"),
					rs.getString("EmployeeName")							
							
					));
					DataAnalysis.setItems(data1);
				}
				
				pst.close();
				rs.close();
				
			} catch (Exception e) {
				System.err.print(e);
			}
			
		}

		//Adds one Employee/ Password pair to the database
			public void LogindataAdd(ActionEvent event) {
				conn = SQLConnection.DbConnector();
							try{
								String query = "INSERT INTO main.LoginData (Username, Password) VALUES (?,?)";
								
								pst = conn.prepareStatement(query);
								pst.setString(1, NewUsername.getText());
								pst.setString(2, NewPassword.getText());

								pst.execute();
								pst.close();
								fields.getChildren().addAll(NewUsername, NewPassword, AddNewUser);

							} catch (Exception e) {
								System.out.println("Error Loading the page");
							};			
			}

			//Deletes one Employee/ Password pair from the database
			public void LogindataDelete(ActionEvent event) {
				conn = SQLConnection.DbConnector();
							try{
								String query = "delete from main.LoginData where Username=?";
								pst = conn.prepareStatement(query);
								pst.setString(1, IDelete.getText());
								pst.executeUpdate();

								pst.close();
								
							} catch (Exception e) {
								System.out.println("Error Loading the page");
							};
			}
			
			//Allows to search on the tables Orders3 and Orders4, when shown on tables
			@FXML
			public void searchUser()
			{
				searchBox.textProperty().addListener((observableValue,oldValue,newValue)->{
					filteredData.setPredicate((Predicate<? super orderList>)orderList->{
						if(newValue==null||newValue.isEmpty()){
							return true;
						}
						String lowerCaseFilter=newValue.toLowerCase();
						if(orderList.getDataTableNumber().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getTime().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getDate().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuStarter1().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuStarter2().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuStarter3().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuMain1().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuMain2().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuMain3().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuPudding1().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuPudding2().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getQuPudding3().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getDataSpecialRequest().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						else if(orderList.getDataEmployee().toLowerCase().contains(lowerCaseFilter)){
							return true;
						}
						return false;
					});
				});
				SortedList<orderList> sortedData=new SortedList<>(filteredData);
				sortedData.comparatorProperty().bind(DataAnalysis.comparatorProperty());
				DataAnalysis.setItems(sortedData);
			}

			//Creates an Excel file called Orders and
			//exports the data from the current table in an Excel file 
			public void Export(ActionEvent event) throws Exception{
				
				try {
				
				String query = "Select * from main.Orders3";
				pst = conn.prepareStatement(query);
				rs = pst.executeQuery();
				
				XSSFWorkbook wb = new XSSFWorkbook();
				XSSFSheet sheet = wb.createSheet("Orders");
				XSSFRow Header = sheet.createRow(0);
				Header.createCell(0).setCellValue("Time");
				Header.createCell(1).setCellValue("Date");
				Header.createCell(2).setCellValue("TableNumber");
				Header.createCell(3).setCellValue("QuStarter1");
				Header.createCell(4).setCellValue("QuStarter2");
				Header.createCell(5).setCellValue("QuStarter3");
				Header.createCell(6).setCellValue("QuMain1");
				Header.createCell(7).setCellValue("QuMain2");
				Header.createCell(8).setCellValue("QuMain3");
				Header.createCell(9).setCellValue("QuPudding1");
				Header.createCell(10).setCellValue("QuPudding2");
				Header.createCell(11).setCellValue("QuPudding3");
				Header.createCell(12).setCellValue("SpecialRequest");
				Header.createCell(13).setCellValue("EmployeeName");
				
				int index = 1; 
				while (rs.next()){
					XSSFRow row = sheet.createRow(index);
					row.createCell(0).setCellValue(rs.getString("Time"));
					row.createCell(1).setCellValue(rs.getString("Date"));
					row.createCell(2).setCellValue(rs.getString("TableNumber"));
					row.createCell(3).setCellValue(rs.getString("QuStarter1"));
					row.createCell(4).setCellValue(rs.getString("QuStarter2"));
					row.createCell(5).setCellValue(rs.getString("QuStarter3"));
					row.createCell(6).setCellValue(rs.getString("QuMain1"));
					row.createCell(7).setCellValue(rs.getString("QuMain2"));
					row.createCell(8).setCellValue(rs.getString("QuMain3"));
					row.createCell(9).setCellValue(rs.getString("QuPudding1"));
					row.createCell(10).setCellValue(rs.getString("QuPudding2"));
					row.createCell(11).setCellValue(rs.getString("QuPudding3"));
					row.createCell(12).setCellValue(rs.getString("SpecialRequest"));
					row.createCell(13).setCellValue(rs.getString("EmployeeName"));
					index++;
				}
				try {
				FileOutputStream fileOut = new FileOutputStream("C:\\Users\\jean\\workspace\\Coursewrk\\Orders.xlsx");
				wb.write(fileOut);
				fileOut.close();
				wb.close();
				
				}catch (IOException e){
					System.out.print("Error exporting 1");
				}
				} catch (SQLException ex ) {
					System.out.print("Error exporting 2");
				}
				
			}
			//Imports the data of The file OrdersImport.xlsx into the table and Orders3
			public void Import(ActionEvent event) throws Exception{
				
				try {
				String query = "INSERT INTO main.Orders3 (Time, Date, TableNumber,QuStarter1,QuStarter2,QuStarter3,QuMain1,QuMain2,QuMain3,QuPudding1,QuPudding2,QuPudding3,SpecialRequest, EmployeeName) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				pst = conn.prepareStatement(query);

				FileInputStream fileIn = new FileInputStream(new File("OrdersImport.xlsx"));
			
				XSSFWorkbook wb =  new XSSFWorkbook(fileIn);
				XSSFSheet sheet = wb.getSheetAt(0);
				Row row;
				
				for(int i=1; i<=sheet.getLastRowNum(); i++){
					row = sheet.getRow(i);
					pst.setInt(1, (int) row.getCell(0).getNumericCellValue());
					pst.setString(2, row.getCell(1).getStringCellValue());
					pst.setString(3, row.getCell(2).getStringCellValue());
					pst.setString(4, row.getCell(3).getStringCellValue());
					pst.setString(5, row.getCell(4).getStringCellValue());
					pst.setString(6, row.getCell(5).getStringCellValue());
					pst.setString(7, row.getCell(6).getStringCellValue());
					pst.setString(8, row.getCell(7).getStringCellValue());
					pst.setString(9, row.getCell(8).getStringCellValue());
					pst.setString(10, row.getCell(9).getStringCellValue());
					pst.setString(11, row.getCell(10).getStringCellValue());
					pst.setString(12, row.getCell(11).getStringCellValue());
					pst.setString(13, row.getCell(12).getStringCellValue());
					pst.setString(14, row.getCell(13).getStringCellValue());
					pst.executeQuery();
				}
				
				wb.close();
				fileIn.close();
				pst.close();
				rs.close();
				
				} catch ( SQLException ex ) {
					System.out.print("Error importing");
				}
			}
			
		/** we have in the following code the code corresponding to tables 1 to 6
		 The codes methods are numbered from 1 to 6. Except for the number, the name of the methods are the
		 same
		 
		TABLE 1*/
		
		public void Table1(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Table1.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}
		
		//launch the table to modify the order
		public void ChangeTable1Page(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ChangeTable1.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}
		
		// Launches the delete order page
		public void DeleteOrder1(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DeleteOrder1.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}
		
		// Send order to Kitchen in "Orders1"
		public void OrderTable1(ActionEvent event) {
			conn = SQLConnection.DbConnector();
			try{

				String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
				
				pst = conn.prepareStatement(query);
				pst.setString(1, TableNumber.getText());
				pst.setString(2, Starter1.getText());
				pst.setString(3, Starter2.getText());
				pst.setString(4, Starter3.getText());
				pst.setString(5, Main1.getText());
				pst.setString(6, Main2.getText());
				pst.setString(7, Main3.getText());
				pst.setString(8, Pudding1.getText());
				pst.setString(9, Pudding2.getText());
				pst.setString(10, Pudding3.getText());
				pst.setString(11, SpecialRequest.getText());
				pst.setString(12, EmployeeName.getText());
				
				
				pst.execute();
				pst.close();
				fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

			} catch (Exception e) {
				System.out.println("Error Loading the page");
			};
			SaveTable1(event);
			
		}
		//Send orders to database for data analysis
		public void SaveTable1(ActionEvent event) {
			conn = SQLConnection.DbConnector();
			try{

				String query = "INSERT INTO main.Orders3 (TableNumber,QuStarter1,QuStarter2,QuStarter3,QuMain1,QuMain2,QuMain3,QuPudding1,QuPudding2,QuPudding3,SpecialRequest, EmployeeName) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
				
				pst = conn.prepareStatement(query);
				pst.setString(1, TableNumber.getText());
				pst.setString(2, Starter1.getText());
				pst.setString(3, Starter2.getText());
				pst.setString(4, Starter3.getText());
				pst.setString(5, Main1.getText());
				pst.setString(6, Main2.getText());
				pst.setString(7, Main3.getText());
				pst.setString(8, Pudding1.getText());
				pst.setString(9, Pudding2.getText());
				pst.setString(10, Pudding3.getText());
				pst.setString(11, SpecialRequest.getText());
				pst.setString(12, EmployeeName.getText());
				
				
				pst.execute();
				pst.close();
				fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

			} catch (Exception e) {
				System.out.println("Error Loading the page");
			};		
		}
		
		//Delete Order from Kitchen
		public void Delete1(ActionEvent event) {
			conn = SQLConnection.DbConnector();
			try{

				String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
				
				pst = conn.prepareStatement(query);
				pst.setString(1, TableNumber.getText());
				pst.setString(2, null);
				pst.setString(3, null);
				pst.setString(4, null);
				pst.setString(5, null);
				pst.setString(6, null);
				pst.setString(7, null);
				pst.setString(8, null);
				pst.setString(9, null);
				pst.setString(10, null);
				pst.setString(11, null);
				pst.setString(12, null);
				
				
				pst.execute();
				pst.close();
				fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

			} catch (Exception e) {
				System.out.println("Error Loading the page");
			};
	
		}
		
		//TABLE 2//
		public void Table2(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Table2.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}
		

		public void ChangeTable2Page(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ChangeTable2.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}
		
		public void DeleteOrder2(ActionEvent event) throws IOException{
			conn = SQLConnection.DbConnector();
				AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DeleteOrder2.fxml"));
				Scene scene3 = new Scene(root,750,600);
				scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Main.primaryStage.setScene(scene3);
		}
		
		//modify to table one if it works
		public void OrderTable2(ActionEvent event) {
			conn = SQLConnection.DbConnector();
			try{

				String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";

				pst = conn.prepareStatement(query);
				pst.setString(1, TableNumber.getText());
				pst.setString(2, Starter1.getText());
				pst.setString(3, Starter2.getText());
				pst.setString(4, Starter3.getText());
				pst.setString(5, Main1.getText());
				pst.setString(6, Main2.getText());
				pst.setString(7, Main3.getText());
				pst.setString(8, Pudding1.getText());
				pst.setString(9, Pudding2.getText());
				pst.setString(10, Pudding3.getText());
				pst.setString(11, SpecialRequest.getText());
				pst.setString(12, EmployeeName.getText());
				
				
				pst.execute();
				pst.close();
				fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

			} catch (Exception e) {
				System.out.println("Error Loading the page");
			};
			SaveTable2(event);
		}
		
		public void SaveTable2(ActionEvent event) {
			conn = SQLConnection.DbConnector();
			try{

				String query = "INSERT INTO main.Orders3 (TableNumber,QuStarter1,QuStarter2,QuStarter3,QuMain1,QuMain2,QuMain3,QuPudding1,QuPudding2,QuPudding3,SpecialRequest, EmployeeName) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
				
				pst = conn.prepareStatement(query);
				pst.setString(1, TableNumber.getText());
				pst.setString(2, Starter1.getText());
				pst.setString(3, Starter2.getText());
				pst.setString(4, Starter3.getText());
				pst.setString(5, Main1.getText());
				pst.setString(6, Main2.getText());
				pst.setString(7, Main3.getText());
				pst.setString(8, Pudding1.getText());
				pst.setString(9, Pudding2.getText());
				pst.setString(10, Pudding3.getText());
				pst.setString(11, SpecialRequest.getText());
				pst.setString(12, EmployeeName.getText());
				
				
				pst.execute();
				pst.close();
				fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

			} catch (Exception e) {
				System.out.println("Error Loading the page");
			};		
		}
		
		public void Delete2(ActionEvent event) {
			conn = SQLConnection.DbConnector();
			try{

				String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
				
				pst = conn.prepareStatement(query);
				pst.setString(1, TableNumber.getText());
				pst.setString(2, null);
				pst.setString(3, null);
				pst.setString(4, null);
				pst.setString(5, null);
				pst.setString(6, null);
				pst.setString(7, null);
				pst.setString(8, null);
				pst.setString(9, null);
				pst.setString(10, null);
				pst.setString(11, null);
				pst.setString(12, null);
				
				
				pst.execute();
				pst.close();
				fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

			} catch (Exception e) {
				System.out.println("Error Loading the page");
			};
	
		}

		//TABLE 3//
		
				public void Table3(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Table3.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				

				public void ChangeTable3Page(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ChangeTable3.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				public void DeleteOrder3(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DeleteOrder3.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				//modify to table one if it works
				public void OrderTable3(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
					SaveTable3(event);
				}
				
				public void SaveTable3(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "INSERT INTO main.Orders3 (TableNumber,QuStarter1,QuStarter2,QuStarter3,QuMain1,QuMain2,QuMain3,QuPudding1,QuPudding2,QuPudding3,SpecialRequest, EmployeeName) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};		
				}
				
				public void Delete3(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, null);
						pst.setString(3, null);
						pst.setString(4, null);
						pst.setString(5, null);
						pst.setString(6, null);
						pst.setString(7, null);
						pst.setString(8, null);
						pst.setString(9, null);
						pst.setString(10, null);
						pst.setString(11, null);
						pst.setString(12, null);
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
			
				}
				
				//TABLE 4//
				
				public void Table4(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Table4.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				

				public void ChangeTable4Page(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ChangeTable4.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				public void DeleteOrder4(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DeleteOrder4.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				
				public void OrderTable4(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
					SaveTable4(event);
			
				}
				
				public void SaveTable4(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "INSERT INTO main.Orders3 (TableNumber,QuStarter1,QuStarter2,QuStarter3,QuMain1,QuMain2,QuMain3,QuPudding1,QuPudding2,QuPudding3,SpecialRequest, EmployeeName) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};		
				}
				
				public void Delete4(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, null);
						pst.setString(3, null);
						pst.setString(4, null);
						pst.setString(5, null);
						pst.setString(6, null);
						pst.setString(7, null);
						pst.setString(8, null);
						pst.setString(9, null);
						pst.setString(10, null);
						pst.setString(11, null);
						pst.setString(12, null);
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
			
				}
				
				//TABLE 5//
				
				public void Table5(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Table5.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				

				public void ChangeTable5Page(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ChangeTable5.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				public void DeleteOrder5(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DeleteOrder5.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				//modify to table one if it works
				public void OrderTable5(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
					SaveTable5(event);
				}
				
				public void SaveTable5(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "INSERT INTO main.Orders3 (TableNumber,QuStarter1,QuStarter2,QuStarter3,QuMain1,QuMain2,QuMain3,QuPudding1,QuPudding2,QuPudding3,SpecialRequest, EmployeeName) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};		
				}
				
				public void Delete5(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, null);
						pst.setString(3, null);
						pst.setString(4, null);
						pst.setString(5, null);
						pst.setString(6, null);
						pst.setString(7, null);
						pst.setString(8, null);
						pst.setString(9, null);
						pst.setString(10, null);
						pst.setString(11, null);
						pst.setString(12, null);
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
			
				}
				
				//TABLE 6//
				
				public void Table6(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Table6.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				

				public void ChangeTable6Page(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ChangeTable6.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				public void DeleteOrder6(ActionEvent event) throws IOException{
					conn = SQLConnection.DbConnector();
						AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("DeleteOrder6.fxml"));
						Scene scene3 = new Scene(root,750,600);
						scene3.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						Main.primaryStage.setScene(scene3);
				}
				
				//modify to table one if it works
				public void OrderTable6(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
					SaveTable6(event);
				}
				
				public void SaveTable6(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "INSERT INTO main.Orders3 (TableNumber,QuStarter1,QuStarter2,QuStarter3,QuMain1,QuMain2,QuMain3,QuPudding1,QuPudding2,QuPudding3,SpecialRequest, EmployeeName) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, Starter1.getText());
						pst.setString(3, Starter2.getText());
						pst.setString(4, Starter3.getText());
						pst.setString(5, Main1.getText());
						pst.setString(6, Main2.getText());
						pst.setString(7, Main3.getText());
						pst.setString(8, Pudding1.getText());
						pst.setString(9, Pudding2.getText());
						pst.setString(10, Pudding3.getText());
						pst.setString(11, SpecialRequest.getText());
						pst.setString(12, EmployeeName.getText());
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};		
				}
				
				public void Delete6(ActionEvent event) {
					conn = SQLConnection.DbConnector();
					try{

						String query = "update main.Orders4 set TableNumber=?,QuStarter1=?,QuStarter2=?,QuStarter3=?,QuMain1=?,QuMain2=?,QuMain3=?,QuPudding1=?,QuPudding2=?,QuPudding3=?,SpecialRequest=?, EmployeeName=? where TableNumber="+TableNumber.getText()+" ";
						
						pst = conn.prepareStatement(query);
						pst.setString(1, TableNumber.getText());
						pst.setString(2, null);
						pst.setString(3, null);
						pst.setString(4, null);
						pst.setString(5, null);
						pst.setString(6, null);
						pst.setString(7, null);
						pst.setString(8, null);
						pst.setString(9, null);
						pst.setString(10, null);
						pst.setString(11, null);
						pst.setString(12, null);
						
						
						pst.execute();
						pst.close();
						fields.getChildren().addAll(TableNumber, Starter1, Starter2, Starter3, Main1, Main2, Main3, Pudding1, Pudding2, Pudding3, SpecialRequest, EmployeeName, Add);

					} catch (Exception e) {
						System.out.println("Error Loading the page");
					};
			
				}
			
	}
