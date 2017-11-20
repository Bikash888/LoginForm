package application;
	
import com.Interface.Login_Interface;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.service.login.Login_service;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	Login_Interface _interface=new Login_service();
	AlertMessage alert=new AlertMessage();
	
	 @FXML
	    private AnchorPane anchorpane;

    @FXML
    private JFXPasswordField password;

    @FXML
    private JFXButton loginbtn;

    @FXML
    private JFXTextField userText;

    @FXML
    private JFXButton create;
    
    
    @FXML
    void loginaction(ActionEvent event) {
    	boolean status=_interface.loginUser(userText.getText().trim().toString(),password.getText().trim().toString());
        if(status) {
        	
     	   DashBoard dashboard=new DashBoard();
     	  
     	   dashboard.dashDisplay();
     	 ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        else {
     	   alert.showAlert("E", "Invalid username or password");
        }

    }
    @FXML
    void createaccount(ActionEvent event) {
    	boolean status=_interface.loginUser(userText.getText().trim().toString(),password.getText().trim().toString());
        if(status) {
     	   DashBoard dashboard=new DashBoard();
     	   dashboard.dashDisplay();
     	  
     	   
     	   
        }
        else {
     	   alert.showAlert("E", "Invalid username or password");
        }
    }
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("/Login_Fxml/LoginFxml.fxml"));
		Scene scene=new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();		
	}

			
	
   
	 
}
