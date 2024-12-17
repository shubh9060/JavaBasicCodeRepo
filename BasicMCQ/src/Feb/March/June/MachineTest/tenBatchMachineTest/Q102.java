package Feb.March.June.MachineTest.tenBatchMachineTest;


/*
 Write a program to calculate sum of digits located in string.
 input: "10 Variables 53 keywords 123 literals 978 programs". 
 output: Calculated Sum of Numbers in String is = 1164
 * */
 

public class Q102 {
    public static void main(String[] args) {
        String s = "26 abcd 56 mno 150 pqr";
        char ch[]=s.toCharArray();
        int sum=0,num=0;
        boolean flag=false;
        for(int i=0;i<ch.length;i++)
        {
        	if(ch[i]>='0' && ch[i]<='9')
        	{	
        		num = num * 10 + (ch[i]-'0');
        		//System.out.println("num:"+num);
        		flag=true;
        	}else {
        		
        		if(flag)
        		{
        			sum+=num;
        			num=0;
        			flag=false;
        		}
        	}
        }
        System.out.println("Calculated Sum of Given String in Numbers:"+sum);
        
    }
}

/*
int sum = 0;
        int num = 0;
        boolean inNumber = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if the character is a digit
            if (c >= '0' && c <= '9') {
                // Convert the character to a digit and add it to the current number
                num = num * 10 + (c - '0');
                inNumber = true;
            } else {
                // If we are in a number and encounter a non-digit character, add the number to the sum
                if (inNumber) {
                    sum += num;
                    num = 0; // Reset num for the next number
                }
                inNumber = false;
            }
        }

        // Add the last number to the sum if the string ends with a number
        if (inNumber) {
            sum += num;
        }

        System.out.println("Sum of numbers: " + sum);


*/