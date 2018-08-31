package uppgifterV35;

public class stringReverse {
	
			 String reverse = "hej, och, hejdå";
	
			 public String reverseString(String str) {
	
			 if (str.length() == 1) {
				 return str;
			 }
			 
			 else {
				 reverse += str.charAt(str.length()-1)
		
				 +reverseString(str.substring(0,str.length()-1));
		
				 return reverse;	
			 	}	
			 }
	
			 public static void main(String a[]) {
	
				 stringReverse srr = new stringReverse();
		
				 System.out.println(srr.reverseString(""));
			 }
		}
