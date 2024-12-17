package JuneAssignmentPrograms100Programs;
import java.util.*;

public class CodeChefCapService {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int testCase=3;
			for(int i=1;i<=testCase && testCase<=100;i++)
			{
				System.out.print("Enter Rate of Cab Service first and Second:");
				int x = sc.nextInt();
				int y = sc.nextInt();
				if(x>=1 && y>=1 && x<=100 && y<=100)
				{
						if(x<y)
						{
							System.out.println("First Cab Service Are Cheper than Second .....!");
						}else if(x==y){
							System.out.println("Both Cab Service Are Equalse  .....!");
						}else {
						
							System.out.println("Second Cab Service Are Cheper than First .....!");
						}
				}else {
					System.out.println("Cab Service Are Not Available here.........!");
				}
			}
			
		}
}
