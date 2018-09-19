package maze;

public class MapSolver {

	public MapSolver(Map map) {
	
		int x = map.startX();
		int y = map.startY();
		
		solve(x, y, 1); // 1 = right
		solve(x, y, 2); // 2 = up
		solve(x, y, 3); // 3 = left
		solve(x, y, 4); // 4 = down	
	}
	
	public static void solve(int x, int y, int dir) {
		
	}
	
}
