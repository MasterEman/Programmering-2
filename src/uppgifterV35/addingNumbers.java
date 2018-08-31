package uppgifterV35;

public class addingNumbers {

	public static int sumInt(int... numbers) {
		int sum = 0;
	
		for (int number : numbers)
			sum = sum+number;
		return sum;
	}
}
