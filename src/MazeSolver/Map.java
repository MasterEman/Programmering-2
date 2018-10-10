package mazeSolver;
import java.util.ArrayList;

import javafx.scene.Group;

public class Map extends Group{

	ArrayList<ArrayList<Block>> map = new ArrayList<ArrayList<Block>>();
	int startX;
	int startY;
	
	public void addBlock(Block b, int y) {
		try {
			map.get(y).add(b);
		} catch (Exception e) {
			map.add(new ArrayList<Block>());
			map.get(y).add(b);
		}
		
		if (b instanceof StartBlock){
			startX = map.get(y).size()-1;
			startY = y;
		}
		
		this.getChildren().add(b);
	}
	
	public int startX(){
		return startX;
	}

	public int startY(){
		return startY;
	}

	
	
	public Block getBlock(int x,int y){
		return map.get(y).get(x);
	}
	
	public double getWidth(){
		return map.get(0).size()*Block.SIZE;
	}
	
	public double getHeight(){
		return map.size()*Block.SIZE;
	}
}

