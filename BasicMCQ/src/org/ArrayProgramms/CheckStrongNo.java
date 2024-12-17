package org.ArrayProgramms;

public class CheckStrongNo {

		public static void main(String[] args) {
			
			int no=145;
			
			// 1   4   5
			// 1*1=1;
			// 1*2*3*4=24;
			// 1*2*3*4*5=120
			// 1+24+120 = 145
			// 145==145 ? Strong:not Strong;
			
			int temp=no,sum=0;
			while(temp!=0)// 145!=0  14!=0  1!=0  0!=0
			{
				int rem = temp%10;//14 rem 5
				
				int fact=1,i=1;
				while(i<=rem)
				{
					fact = fact*i;
					i++;
				}
				
				sum=sum+fact;//120+24+1=145
				temp/=10; //  0  remove 1 remove 4 remove 5
			}
			System.out.println(no+" == "+sum);
			if(sum==no) {
				System.out.println("Given Number is Strong");
			}else {
				System.out.println("Given Number is Not Strong");
			}
			
			
		}
}
