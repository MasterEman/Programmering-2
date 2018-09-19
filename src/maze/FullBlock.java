package maze;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FullBlock extends Block{
	
	public FullBlock(){
		Rectangle bg = new Rectangle(Block.SIZE,Block.SIZE);
		bg.setFill(Color.BLACK);
		this.getChildren().add(bg);
	}

}
