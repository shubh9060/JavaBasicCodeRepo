package org.oo;

public class ShiftMinusValues {

	public static void main(String[] args) {

		int arr[] = { 1,-6, -3, 4, 5, -1 ,7};

		int rightPointer = arr.length - 1;
		int leftPointer = 0;
		while (leftPointer <= rightPointer) {

			if (arr[leftPointer] <0 && arr[rightPointer] >= 0) {
				leftPointer++;
				rightPointer++;

			} else if (arr[leftPointer] >= 0 && arr[rightPointer] < 0) {
				int temp = arr[leftPointer];
				arr[leftPointer] = arr[rightPointer];
				arr[rightPointer] = temp;

				leftPointer++;
				rightPointer--;

			} 
			else if (arr[leftPointer] < 0 && arr[rightPointer] < 0) {
				leftPointer++;

			}
			else {
				rightPointer--;
			}

		}
		for (Integer ii : arr) {
			System.out.print(ii + "\t");
		}

	}
}
