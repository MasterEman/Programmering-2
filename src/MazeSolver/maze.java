package MazeSolver;
import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class maze extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		Map map = MapInterpreter.interpretMap(new File("src/maze/map.txt"));
		Scene scene = new Scene(map,map.getWidth(),map.getHeight());
		
		primaryStage.setTitle("Maze");
		primaryStage.setResizable(true);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
