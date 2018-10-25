package chessGame;

import javafx.scene.image.Image;

public class bishop extends piece {

	static Image White = new Image("file:images/chessPieces/tile003.png");
	static Image Black = new Image("file:images/chessPieces/tile009.png");
	
	public bishop(String color) {
			super(White, Black, color);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
