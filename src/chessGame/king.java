package chessGame;


import javafx.scene.image.Image;

public class king extends piece {

	static Image White = new Image("file:images/chessPieces/tile001.png");
	static Image Black = new Image("file:images/chessPieces/tile007.png");
	
	public king (String color) {
			super (White, Black, color);		
	}

	@Override
	public void move() {
		
	}	
}
