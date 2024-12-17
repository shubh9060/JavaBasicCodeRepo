package Feb.March.June.MachineTest.tenBatchMachineTest;
// Write a Program to Print Pattern
public class Q101
{
	public static void main(String x[])
	{
		int num=0,n=1,temp=11,z=0;
		for(int i=1;i<=11;i++)
		{	num = n++;
			z=temp--;
			for(int j=1;j<=11;j++)
			{
				if(i<7)
				{
					if(i%2!=0 && j%2!=0 && j>=i && j<=13-i)
					{
						System.out.print(num++);
					}
					else if(i%2==0 && j%2==0 && j>=i && j<=13-i)
					{
						System.out.print(num++);
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					
					if(i%2!=0 && j%2!=0 && j>=12-i && j<=i)
					{
						System.out.print(z++);
					}
					else if(i%2==0 && j%2==0 && j>=12-i && j<=i)
					{
						System.out.print(z++);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}