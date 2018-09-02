package uppgifterV35;

import java.util.ArrayList;

public class unknownObjectsStorage <T>  {
	
	ArrayList<T> storage = new ArrayList<T>();

	public <T> void input(T... get) {
		
		for (T objects : get) {
			
			storage.add(objects);
			
		}	
	}
}
