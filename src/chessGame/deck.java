package chessGame;

import java.util.ArrayList;
import javafx.scene.Group;

public abstract class deck extends Group{

	ArrayList<piece> pieces = new ArrayList<piece>();
	
	public deck(String color) {
		
		if (color.equals("Black")) {
			Pawns(color);
			SecRow(color);
		}
		
		if (color.equals("White")) {
			SecRow(color);
			Pawns(color);
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0 ; j < 8 ; j++) {
				pieces.get(i * 8 + j).setTranslateX((j) * 100);
				pieces.get(i * 8 + j).setTranslateY((i) * 100);
			}
		}
		
		for (piece p : pieces) {
			this.getChildren().add(p);
		}	
	}
	
	private void SecRow(String color) {
		
		pieces.add(new rook(color));
		pieces.add(new knight(color));
		pieces.add(new bishop(color));
		pieces.add(new queen(color));
		pieces.add(new king(color));
		pieces.add(new bishop(color));
		pieces.add(new knight(color));
		pieces.add(new rook(color));
	}
	
	private void Pawns(String color) {
		
		for (int i = 0; i < 8; i++) {
			
			pawn p = new pawn(color);
			p.setTranslateX(i * square.SIZE);
			pieces.add(p);
		}	
	}
}
