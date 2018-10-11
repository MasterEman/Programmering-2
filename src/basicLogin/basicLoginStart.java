package basicLogin;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class basicLoginStart extends Application {
	
	Stage window;
	Scene scene;
	Button button;
	
	public static void main(String[] args) {
		launch();
	}

	public void start(Stage primaryStage) throws Exception {
		
		scene = new Scene(new Group(), 400, 400, Color.LIGHTGREY);
		Group root = new Group();
		
		window = primaryStage;
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		
		TextField userInput = new TextField();
		TextField passInput = new TextField();
		
		button = new Button("Submit");
		button.setOnAction( e -> System.out.println("Username: " + userInput.getText() + " " + "Password: " + passInput.getText()));
		
		root.getChildren().addAll(userInput);
		root.getChildren().addAll(passInput);
		root.getChildren().addAll(button);
		
		window.getIcons().add(new Image("file:icon.jpg"));
		window.setResizable(false);
		window.setScene(scene);
		window.setTitle("Login");
		window.show();
	}
}
