package org.ArrayProgramms;

public class CalculateSumApp {

	public static void main(String[] args)
	{
			String example = "abcd77jjd7255";;
						    // 1+2+3+8+2+8+4 = 28
			char c[]=example.toCharArray();
			calculateSum(c);
			
	}

	public static void calculateSum(char ch[])
	{
		int sum=0;
		
		for(int i=0;i<ch.length;i++)
		{
				if(ch[i]>='0' && ch[i]<='9'){
					
					System.out.println("Digits :"+(ch[i]-48));
					sum = sum+ch[i]-48;//1+2+3+8+2+8+4
				}
		}
		System.out.println("Sum :"+sum);
		
	}

}
