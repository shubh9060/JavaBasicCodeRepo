package Feb.March.June.MachineTest;

public class Q1 {

		public static void main(String[] args) {
			
			int limit=50000;
			
			for(int i=1;i<limit;i++)
			{
				int temp = i;
				int sum=0;
				while(temp!=0)
				{
					int rem = temp%10;
					int fact=1;
					int j=1;
					while(j<=rem)
					{
						fact = fact*j;
						j++;
					}
					sum = sum+fact;
					temp/=10;
				}
				if(sum==i)
				{
					System.out.println("Strong No:"+i);
				}
			}
			
		}
}
