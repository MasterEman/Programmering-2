package chessGame;

import javafx.scene.image.Image;

public class rook extends piece {

	static Image White = new Image("file:images/chessPieces/tile005.png");
	static Image Black = new Image("file:images/chessPieces/tile011.png");
	
	public rook (String color) {
			super (White, Black, color);		
	}

	@Override
	public void move() {
		
	}
}
