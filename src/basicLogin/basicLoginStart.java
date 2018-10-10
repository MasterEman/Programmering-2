package basicLogin;

import java.awt.TextField;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class basicLoginStart extends Application {
	
	Stage window;
	Scene scene;
	Button button;
	
	public static void main(String[] args) {
		launch();
	}

	public void start(Stage primaryStage) throws Exception {
		
		scene = new Scene(new Group(), 400, 400);
		window = primaryStage;
	
		TextField usernameInput = new TextField();
		TextField passwordInput = new TextField();
		
		button = new Button("Submit");
		button.setOnAction( e -> System.out.println("Username: " + usernameInput.getText() + " " + "Password: " + passwordInput.getText()));
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		
		layout.getChildren().addAll();
		
		window.setResizable(false);
		window.setScene(scene);
		window.setTitle("Login");
		window.show();
	}
}



