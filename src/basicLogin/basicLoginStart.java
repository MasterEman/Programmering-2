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
		
		Group root = new Group();
		scene = new Scene(root, 245, 150, Color.LIGHTGREY);
		
		window = primaryStage;
		
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(10, 10, 10, 10));
		
		TextField userInput = new TextField("Username...");
		TextField passInput = new TextField("Password...");
		
		button = new Button("Submit");
		button.setOnAction( e -> System.out.println("------------------------------------------" 
																						+ "\n"
																						+ "Username: " + userInput.getText() 
																						+ "\n" 
																						+ "Password: " + passInput.getText()
																						+ "\n"
																						+"------------------------------------------"));
		
		root.getChildren().addAll(userInput);
        root.getChildren().addAll(passInput);
        root.getChildren().addAll(button);
        userInput.relocate(55, 10);
        passInput.relocate(55, 50);
        button.relocate(100, 90);
		
		window.getIcons().add(new Image("file:icon.jpg"));
		window.setResizable(false);
		window.setScene(scene);
		window.setTitle("Login");
		window.show();
	}
}
