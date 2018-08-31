package uppgifterV35;

public class stringReverse {
	
		public static void main(String[] args) {
				
				System.out.println(reverse("Hej JaoK"));	
			}
			
			public static String reverse(String input) {
				
				if (input.length() == 1) {
					
					return input;
				}
				
				else {
					return reverse(input.substring(1))+ input.charAt(0);
				}
			}
		}