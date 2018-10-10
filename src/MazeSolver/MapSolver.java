package mazeSolver;

import java.util.ArrayList;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import mazeSolver.Block;
import mazeSolver.FullBlock;
import mazeSolver.GoalBlock;

	public class MapSolver {
		
		private Map map;
		public ArrayList<Block> path = new ArrayList<Block>();
		private boolean solution = false;
	
		public MapSolver(Map map) {
			this.map = map;
			
			int x = map.startX();
			int y = map.startY();
			
			solve (x, y, 1); //right
			solve (x, y, 2); //up
			solve (x, y, 3); //left
			solve (x, y, 4); //down
			}
		
			public void showNextPath() {
				
				if (path.size() == 0){
					return;
				}
				
				Block b = path.get(0);
				Circle cir = new Circle(Block.SIZE/2,Block.SIZE/2,Block.SIZE/3,Color.GREEN);
				b.getChildren().add(cir);
				path.remove(0);
			}
		
			public void solve(int x, int y, int dir) {
				
				Block b = map.getBlock(x,y);
				if (b == null || b instanceof FullBlock) {
					return;
				}
				if (b instanceof GoalBlock) {
					solution = true;
				}
				
				path.add(b);
				
				if (solution == true) {
					return;
				}
				
				if (dir == 1) { //right
					
					solve (x+1, y, 1); 
					solve (x+1, y, 2); 
					//solve (x, y, 3); 
					solve (x+1, y, 4); 
				}
				
				if (dir == 2) { //up
					
					solve (x, y-1, 1); 
					solve (x, y-1, 2); 
					solve (x, y-1, 3); 
					//solve (x+1, y, 4); 
				}
				
				if (dir == 3) { //left
					
					//solve (x+1, y, 1); 
					solve (x-1, y, 2); 
					solve (x-1, y, 3); 
					solve (x-1, y, 4); 
				}
				
				if(dir == 4) { //down
					
					solve (x, y+1, 1); 
					//solve (x, y+1, 2); 
					solve (x, y+1, 3); 
					solve (x, y+1, 4); 
				}
			}				
		}