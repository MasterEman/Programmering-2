package chessGame;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class whiteSquare extends Group {

	public whiteSquare(){
		Rectangle bg = new Rectangle(square.SIZE, square.SIZE);
		bg.setFill(Color.TRANSPARENT);
		this.getChildren().add(bg);
	}	
}
