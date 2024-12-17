package JuneAssignmentPrograms100Programs;
class Power{

	int base,index;
		Power(int base,int index)
		{
			this.base=base;
			this.index=index;
		}
		int getPower() {
	
			int pow=1;
			for(int i=1;i<=index;i++)
			{
				pow = base*pow;
			}
			return pow;
			 
		}
}
public class Q2 {

		public static void main(String[] args) {
			
			Power power = new Power(5, 3);
			System.out.println(power.getPower());
			
		}
}
