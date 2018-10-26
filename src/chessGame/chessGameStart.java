package chessGame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class chessGameStart extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		chessBoard cb = new chessBoard();
		
		Scene scene = new Scene(cb, square.SIZE  * 8 - 10, square.SIZE  * 8 - 10);
		
		playerBlack blackP = new playerBlack();
		blackP.setTranslateY(600);
		playerWhite whiteP = new playerWhite();
		
		cb.getChildren().add(blackP);
		cb.getChildren().add(whiteP);
		
		primaryStage.getIcons().add(new Image("file:images/chessPieces/tile001.png"));
		primaryStage.setTitle("Chess Game");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
