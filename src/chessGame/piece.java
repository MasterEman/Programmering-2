package chessGame;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public abstract class piece extends Group{

	public String color;
	private Color pieceColor;
	
	public piece(Image imageWhite, Image imageBlack, String color){
		
		this.color = color;
		
		ImageView iw;
		
		if (color.equals("White")) {
	        iw = new ImageView(imageWhite);
		}
		else {
			iw = new ImageView(imageBlack);
		}
		
        iw.setFitWidth(100);
        iw.setFitHeight(100);
		
		this.getChildren().add(iw);	
	}
		
	public abstract void move();
	
	public Color getColor() {
		return pieceColor;
	}
	
}
