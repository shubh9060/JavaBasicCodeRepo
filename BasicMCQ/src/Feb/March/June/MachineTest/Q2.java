package Feb.March.June.MachineTest;

public class Q2 {

		public static void main(String[] args) {
			
			for(int i=1;i<=5;i++)
			{
				char ch=64;
				for(int j=1;j<=9;j++)
				{
					
					if(j<=4+i && j>=6-i)
					{
						if(j<=5) {
							ch++;
						}else {
							ch--;
						}
						System.out.printf("%c",ch);
					}
//					}else {
//						System.out.printf(" ");
//					}
				}
				System.out.println();
			}
		}
}
