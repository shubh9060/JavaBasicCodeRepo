package org.oo;

class FunctionOverloading {

	void checkArray(int arr[]) {
		boolean b = false;

		int start = 0;
		int mid = arr.length / 2; // 5/2 = 2
		// [1 2 3 4 6]
		// [6 4 3 2 1]
		// 0 1 2 3 4
		int end = arr.length - 1; // end = 4 5-1

		while (start < mid) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}

		end = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++, end--) {

			if (arr[i] == arr[end]) {
				b = true;
			} else {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("Palid");
		} else {
			System.out.println("Not Palid  ");
		}

	}
	void show(int arr[][]) {
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
			}
		}
	}
}

public class Q2 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 1, 2, 1 };
		
		int arrr[][]= {{1,2,3,4},{4,3,2,34},{5,5,3,4,5}};
		FunctionOverloading ff = new FunctionOverloading();
		ff.show(arrr);
		// Palindrom Array
		FunctionOverloading f = new FunctionOverloading();
		f.checkArray(arr); // pass base address of array

	}

}
