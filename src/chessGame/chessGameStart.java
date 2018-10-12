package chessGame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class chessGameStart extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		chessBoard cb = new chessBoard();
		root.getChildren().addAll(cb);

		Scene scene = new Scene(root, square.SIZE * 8, square.SIZE * 8);

		primaryStage.getIcons().add(new Image("file:icon.jpg"));
		primaryStage.setTitle("Chess Game");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
