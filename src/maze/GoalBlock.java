package maze;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GoalBlock extends Block {

	public GoalBlock(){
		Rectangle bg = new Rectangle(Block.SIZE,Block.SIZE);
		bg.setFill(Color.RED);
		this.getChildren().add(bg);
	}
	
}
