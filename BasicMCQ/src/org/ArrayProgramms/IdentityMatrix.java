package org.ArrayProgramms;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int example[][]= {{0,0,0},
						      {0,0,0},
						      {0,0,0}};
			for(int  i=0;i<example.length;i++)
			{
				for(int j=0;j<example[i].length;j++) {
					
						if((example[i][j]==1) || (example[i][j]==0) && i==j) {
							System.out.println("Values :"+example[i][j]);
						}
				}
			}
	}

}
