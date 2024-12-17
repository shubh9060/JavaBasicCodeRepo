package org.ArrayProgramms;

public class CheckGivenMatrixEqualsOrNot {

	public static void main(String[] args) {

		int example1[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		int example2[][] = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
		boolean flag=false;
		for (int i = 0; i < example1.length; i++) {
			 flag = true;
			for (int j = 0; j < example1[i].length; j++) {

				if (example1[i][j] != example2[i][j]) {
					flag=false;
					break;
				}
			}
			if(flag==false) {
				break;
			}
		}
		if(flag==false) {
			System.out.println("Not Equals");
		}else {
			System.out.println("Equals");
		}

	}
}
