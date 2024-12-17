package Exception_Program;

class OuterClass{
	
	private int id;
	String userName,password;
	
	OuterClass(Inner inn)
	{
	
		this.id = inn.id;
		this.userName=inn.userName;
		this.password=inn.password;
		
	}
	
	public static class Inner {
		private int id;
		String userName,password;
		
		public Inner(int id, String userName, String password) {
			super();
			this.id = id;
			this.userName = userName;
			this.password = password;
		}
		
		

		@Override
		public String toString() {
			return "Inner [id=" + id + ", userName=" + userName + ", password=" + password + "]";
		}



		OuterClass build() {
			return new OuterClass(this);
		}
		
		
	}

	@Override
	public String toString() {
		return "OuterClass [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}

public class NumberFr {

	public static void main(String[] args) {
		
		 OuterClass outer = new OuterClass.Inner(101, "user","pass111").build();
		 System.out.println(outer);
	}
}
