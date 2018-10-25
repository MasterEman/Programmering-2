package chessGame;

import javafx.scene.image.Image;

public class pawn extends piece {

	static Image White = new Image("file:images/chessPieces/tile006.png");
	static Image Black = new Image("file:images/chessPieces/tile012.png");

	public pawn(String color) {
		super(White, Black, color);
	}

	@Override
	public void move() {

	}
}
