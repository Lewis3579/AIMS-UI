package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;


public class MainController {
	
	@FXML
	private Scene scene;
	
	@FXML
	private Stage stage;
	
	@FXML
	private Parent root;
	
	@FXML public void switchToCart(MouseEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Cart.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	


	@FXML public void switchToMainScene(MouseEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML public void switchShippingScene(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Ship.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML public void switchInvoiceScene(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Invoice.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML public void BackToMainScene(ActionEvent e) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}