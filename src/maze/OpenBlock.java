package maze;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class OpenBlock extends Block {
	
	public OpenBlock(){
		Rectangle bg = new Rectangle(Block.SIZE,Block.SIZE);
		bg.setFill(Color.TRANSPARENT);
		this.getChildren().add(bg);
	}

}
