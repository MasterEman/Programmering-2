package uppgifterV35;

public class stringReverse {

	public static void main(String[] args) {

        String str = new String("a, b, c, d, e, f, g, h, i, j");

        for (int i = str.length() - 1; i >= 0; i--) {
            str = str + str.charAt(i);
        }
        
        System.out.println(str);
    }	
}
