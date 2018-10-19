package chessGame;

import javafx.scene.Group;

public class chessBoard  extends Group {
	
	public chessBoard() {
		
		boolean alternate = false;
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
				if (alternate) {
					this.getChildren().add(new blackSquare());
					alternate = false;
				}
				else {	
					this.getChildren().add(new whiteSquare());
					alternate = true;
				}
				
				this.getChildren().get(this.getChildren().size()-1).setTranslateX(j * square.SIZE);
				this.getChildren().get(this.getChildren().size()-1).setTranslateY(i * square.SIZE);
			}
			
			if (alternate) {
				alternate = false;
			}
			else {
				alternate = true;
			}
		}
	}
}
