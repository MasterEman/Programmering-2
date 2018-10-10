package mazeSolver;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MapInterpreter {

	public static Map interpretMap(File f) {
		Map m = new Map();
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(f);

			int y = 0;
			while (sc.hasNextLine()) {

				String line = sc.nextLine();

				for (int x = 0; x < line.length(); x++) {
					char c = line.charAt(x);

					Block b;
					if (c == '*') {
						b = new FullBlock();
					}
					else if (c == 'S') {
						b = new StartBlock();
					}
					else if (c == 'G') {
						b = new GoalBlock();
					}
					else {
						b = new OpenBlock();
					}

					b.setTranslateX(x * Block.SIZE);
					b.setTranslateY(y * Block.SIZE);
					m.addBlock(b,y);

				}
				y++;
			}

		} catch (FileNotFoundException e) {

		}

		return m;
	}
}
