package chessGame;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import chessGame.piece;

public class square extends Group {
	
	public static final int SIZE = 100;
	
	public static square active;
	
	private Rectangle bg;
	private Color originalColor;
	private piece piece;
	
	public square (Color c) {
		originalColor = c;
		bg = new Rectangle(SIZE, SIZE, c);
		this.getChildren().add(bg);
		
		this.setOnMouseClicked(event -> {
			if (active != null) {
				if (this == active) {
					active.reset();
					active = null;
					return;
				}
				active.reset();
				this.piece.move();
			}
		});
	}
	
	public void reset() {
		bg.setFill(originalColor);
	}
	
	public void addPiece(piece p) {
		this.piece = p;
		this.getChildren().add(p);
	}
	
	public boolean hasPiece() {
		return this.piece != null;
	}
	
	public Rectangle getBackground() {
		return this.bg;
	}
	
	public void moveMark() {
		Circle moveMark = new Circle (SIZE / 2, SIZE / 2, SIZE / 10, Color.LIGHTGREY);
		this.getChildren().add(moveMark);
	}	
}






