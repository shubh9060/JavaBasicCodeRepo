package Exception_Program;



public class UserExp {
	public static void main(String[] args)  throws ClassNotFoundException {
		
		
		Class c;
		Class.forName("Exception_Program.Demo");
		System.out.println("logic 1");
		System.out.println("logic 2");
	}
}
