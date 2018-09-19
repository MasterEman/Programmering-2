package maze;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class StartBlock extends Block {
	
	public StartBlock(){
		Rectangle bg = new Rectangle(Block.SIZE,Block.SIZE);
		bg.setFill(Color.GREEN);
		this.getChildren().add(bg);
	}

}
