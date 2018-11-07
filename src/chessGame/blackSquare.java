package chessGame;

//import javafx.event.EventHandler;
import javafx.scene.Group;
//import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class blackSquare extends Group {
	
	public blackSquare() {
		Rectangle bg = new Rectangle(square.SIZE, square.SIZE);
		bg.setFill(Color.DIMGREY);
		this.getChildren().add(bg);
		
/*		setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                bg.setFill(Color.GREEN);
            }
        });
		
		setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                bg.setFill(Color.DIMGREY);
            }
        }); */
	}
}
