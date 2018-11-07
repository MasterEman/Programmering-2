package chessGame;

//import javafx.event.EventHandler;
import javafx.scene.Group;
//import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class whiteSquare extends Group {

	public whiteSquare(){
		Rectangle bg = new Rectangle(square.SIZE, square.SIZE);
		bg.setFill(Color.TRANSPARENT);
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
                bg.setFill(Color.WHITE);
            }
        });  */
	}	
}
