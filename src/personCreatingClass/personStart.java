package personCreatingClass;

public class personStart {
	
	public static void main (String[] args) {
	
		person p = new person(17,"Emanuel",70,185);
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.getWeight());
		System.out.println(p.getLength());		
	}
}
