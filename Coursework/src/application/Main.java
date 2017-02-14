
/**
* This program was made to comply with UCL's Msc module GC01 assessment.
* 
* It aims at helping manage restaurants and the orders from customers. 
* It answers the following questions:
* 1 - Fully
* 2 - Fully
* 3 - Fully
* 4 - Fully
* 5 - Fully
* 6 - Fully
* 7 - Fully
* 8 - Fully EXCEPT menu editing
* 9 - Fully
* 10 - Fully
* 
* @author  Guillaume de Boisséson
* @last modification   26-12-2016
* 
* Some of the code contained in this program was created with the help of two
* YouTube Channels:
* - https://www.youtube.com/channel/UCLBjrZ6FA9yoy6vOne8L2Iw 
* - https://www.youtube.com/channel/UCs6nmQViDpUw0nuIx9c_WvA
* 
* 
* I have created 4 tables stored in a SQLite database:
* - The table Orders3 has all the Orders that were made in this restaurant over time.
* - The table Orders4 represents the current orders, for the cooks to see and prepare the food
* - The table LoginData stores the Employee/password login pairs
* - The table LoginAdmin stores the admin Username/password pair
* 
* 
*/

package application;
	
import java.sql.Connection;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

/**
 * 
 * This class contains two methods:
 * Start - calls the first .fxml page and launches it
 * CheckConnection - Checks the connection with SQLite database
 *
 */

public class Main extends Application {
	
	static Stage primaryStage;
	Connection conn;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Main.primaryStage = primaryStage;
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene Login = new Scene(root,750,600);
			Login.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(Login);
			primaryStage.show();
			CheckConnection();
		} catch(Exception e) {
			System.out.println("Connection error");
			e.printStackTrace();
		}
	}

	//we check if the connection with SQLite database works
	public void CheckConnection(){
		conn = SQLConnection.DbConnector();
		if (conn == null){
			System.out.println("Connection is not succesfull");
			System.exit(1);
		} else {
			System.out.println("Connection succesfull");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
