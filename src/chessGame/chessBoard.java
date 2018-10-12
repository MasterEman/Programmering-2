package chessGame;

public class chessBoard {
	
	public chessBoard() {
		
		for (int i = 1; i < 8; i++) {
			for (int j = 1; j < 8; j++) {
				
				whiteSquare ws;
				blackSquare bs;
				
				ws = new whiteSquare();
				ws.setTranslateX(j);
				ws.setTranslateY(i);
				
				bs = new blackSquare();
				bs.setTranslateX(j);
				bs.setTranslateY(i);
			}
		}
	}
}
