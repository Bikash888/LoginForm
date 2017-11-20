package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertMessage {
	Alert infoAlert=new Alert(AlertType.INFORMATION);
	Alert errorAlert=new Alert(AlertType.ERROR);
	Alert warn=new Alert(AlertType.WARNING);
	
	/* public void successAlert(String message) {
		infoAlert.setTitle("Successfully Created");
		infoAlert.setContentText(message);
		infoAlert.showAndWait();
		
	}
	public void errorMessage(String message) {
		errorAlert.setTitle("Already Exist");
		errorAlert.setContentText(message);
		errorAlert.showAndWait();
	}
	*/
	public void showAlert(String type,String message) {
		if(type.equals("I")) {
			infoAlert.setTitle("Sucessfully Created");
			infoAlert.setContentText(message);
			infoAlert.showAndWait();
		}else if(type.equals("E")) {
			errorAlert.setTitle("Error");
			errorAlert.setContentText(message);
			errorAlert.showAndWait();
		}else {
			warn.setTitle("Are you sure?");
			warn.setContentText(message);
			warn.showAndWait();
			
		}
	}

}
