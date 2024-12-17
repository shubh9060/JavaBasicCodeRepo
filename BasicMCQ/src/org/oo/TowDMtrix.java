package org.oo;
import java.util.*;
class UserMatrix {
	int arr[][];

	int calculateSum(int arr[][]) {
		// this.arr=arr;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum = sum + arr[i][j];// [7 8 9] sum = 45
			}
		}
		return sum;
	}
}

public class TowDMtrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + " Enter " + arr.length + " Values at Rows");
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt(); // [1 2 3] [4 5 6] [7 8 9]
			}
		}
		UserMatrix uObject = new UserMatrix();

		int result = uObject.calculateSum(arr);
		System.out.println("Calcualted Sum:" + result);

	}
}
