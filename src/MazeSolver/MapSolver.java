package MazeSolver;

import MazeSolver.Block;
import MazeSolver.FullBlock;
import MazeSolver.GoalBlock;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

	public class MapSolver {
		
		private Map map;
		//private int steps = 0;
		private boolean solution = false;
	
		public MapSolver(Map map ){
			this.map = map;
			
			
			int x = map.startX();
			int y = map.startY();
			
			solve (x, y, 1); //right
			solve (x, y, 2); //up
			solve (x, y, 3); //left
			solve (x, y, 4); //down
			}
		
			public void solve(int x, int y, int dir){
	
				
				Block b = map.getBlock(x,y);
				if (b == null || b instanceof FullBlock){
					return;
				}
				if (b instanceof GoalBlock) {
					solution = true;
				}
				
				Circle cir = new Circle(Block.SIZE/2,Block.SIZE/2,Block.SIZE/3,Color.YELLOW);
				
				b.getChildren().add(cir);
				
				if (solution == true){
					return;
				}
				
				
				if (dir == 1){ //right
					
					solve (x+1, y, 1); 
					solve (x+1, y, 2); 
					//solve (x, y, 3); 
					solve (x+1, y, 4); 
				}
				
				if (dir == 2){ //up
					
					solve (x, y-1, 1); 
					solve (x, y-1, 2); 
					solve (x, y-1, 3); 
					//solve (x+1, y, 4); 
				}
				
				if (dir == 3){ //left
					
					//solve (x+1, y, 1); 
					solve (x-1, y, 2); 
					solve (x-1, y, 3); 
					solve (x-1, y, 4); 
				}
				
				if(dir == 4){ //down
					
					solve (x, y+1, 1); 
					//solve (x, y+1, 2); 
					solve (x, y+1, 3); 
					solve (x, y+1, 4); 
				}
				
				if (!solution){
					b.getChildren().remove(cir);
				}		
			}				
		}