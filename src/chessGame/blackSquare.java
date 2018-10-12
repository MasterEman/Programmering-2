package chessGame;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class blackSquare extends Group {
	
	public blackSquare() {
		Rectangle bg = new Rectangle(square.SIZE, square.SIZE);
		bg.setFill(Color.BLACK);
		this.getChildren().add(bg);
	}
}
