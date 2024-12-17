package MACINETESTREVISE;

public class QQ2 {

		public static void main(String[] args) {
			
			String example= "bakjhdf534akskfd34asdf";
			
			int sum=0;
			int num=0;
			for(int i=0;i<example.length();i++)
			{
				if(example.charAt(i)>='0' && example.charAt(i)<='9' || i==example.length()-1)
				{
					num = num*10+((int)example.charAt(i)-48);
				}else {
					sum=sum+num;
					num=0;
				}
			}
			System.out.println("Final Sum of All Numbers:"+sum);
		}
}
