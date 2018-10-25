package chessGame;

import javafx.scene.image.Image;

public class knight extends piece {

	static Image White = new Image("file:images/chessPieces/tile004.png");
	static Image Black = new Image("file:images/chessPieces/tile010.png");
	
	public knight(String color) {
			super(White, Black, color);		
	}

	@Override
	public void move() {
		
	}
}
