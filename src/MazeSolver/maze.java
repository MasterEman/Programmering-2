package MazeSolver;

import java.io.File;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class maze extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Map map = MapInterpreter.interpretMap(new File("map.txt"));
		Scene scene = new Scene(map,map.getWidth(),map.getHeight());
		MapSolver solver = new MapSolver (map);
		
		AnimationTimer AT = new AnimationTimer() {
			
			long before = 0;
			
			public void handle(long now) {
				
				if (now - before >= 1_000_000_000/60) {
					solver.showNextPath();
					before = now;
				}
			}
		};
		
		AT.start();
		
		primaryStage.getIcons().add(new Image("file:icon.jpg"));
		primaryStage.setTitle("Maze Solving AI");
		primaryStage.setResizable(true);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
