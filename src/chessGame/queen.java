package chessGame;

import javafx.scene.image.Image;

public class queen extends piece {

	static Image White = new Image("file:images/chessPieces/tile002.png");
	static Image Black = new Image("file:images/chessPieces/tile008.png");
	
	public queen (String color) {
			super (White, Black, color);		
	}

	@Override
	public void move() {
		
	}
}
