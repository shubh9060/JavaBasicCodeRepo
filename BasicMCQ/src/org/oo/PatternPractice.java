package org.oo;

public class PatternPractice{
	
		public static void main(String[] args) {
			
			boolean b=true;
			for(int i=1;i<=6;i++) // rows
			{
				for(int j=1;j<=11;j++) // columns
				{
					if(j<=5+i && j>=7-i && b) {
						System.out.print("*");
						b=false;
					}else{
						System.out.print(" ");
						b=true;
					}
				}
				System.out.println();
			}
			
			
		}
	
}
/*
for(int i=1;i<=5;i++) // rows
			{
				for(int j=1;j<=5;j++) // columns
				{
					System.out.print("*");// * * * * *	
				}
				System.out.println();
			}
output
*****
*****
*****
*****
*****

for(int i=1;i<=5;i++) // rows
			{
				for(int j=1;j<=5;j++) // columns
				{
					if(i==1 || j==5 || j==1 || i==5) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
output
*****
*   *
*   *
*   *
*****

for(int i=1;i<=5;i++) // rows
			{
				for(int j=1;j<=5;j++) // columns
				{
					if(j<=i) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
output

*    
**   
***  
**** 
*****

for(int i=1;i<=5;i++) // rows
			{
				for(int j=1;j<=5;j++) // columns
				{
					if(j==i || j==1 || i==5 || i==1 || j==5 || j==6-i) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
output
*****
** **
* * *
** **
*****


for(int i=1;i<=5;i++) // rows
			{
				for(int j=1;j<=5;j++) // columns
				{
					if(j<=6-i) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}

output
*****
**** 
***  
**   
*    
for(int i=1;i<=5;i++) // rows
			{
				for(int j=1;j<=5;j++) // columns
				{
					if(j>=6-i) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}

output


    *
   **
  ***
 ****
*****

for(int i=1;i<=6;i++) // rows
			{
				for(int j=1;j<=11;j++) // columns
				{
					if(j<=5+i && j>=7-i) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
output

     6     
    567    
   45678   
  3456789  
 2345678910 
1234567891011



boolean b=true;
			for(int i=1;i<=6;i++) // rows
			{
				for(int j=1;j<=11;j++) // columns
				{
					if(j<=5+i && j>=7-i && b) {
						System.out.print("*");
						b=false;
					}else{
						System.out.print(" ");
						b=true;
					}
				}
				System.out.println();
			}

output 
     *     
    * *    
   * * *   
  * * * *  
 * * * * * 
* * * * * *

*/