package org.oo;

import java.util.Arrays;

public class MinusShiftingAttheStartIndex {

	public static void shiftNegativeValues(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1;

		while (left <= right) {
			// If the left element is negative and right element is positive, move both
			// pointers
			if (arr[left] < 0 && arr[right] >= 0) {
				left++;
				right--;
			}
			// If the left element is positive and right element is negative, swap them
			else if (arr[left] >= 0 && arr[right] < 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
			// If both elements are negative, move the left pointer
			else if (arr[left] < 0 && arr[right] < 0) {
				left++;
			}
			// If both elements are positive, move the right pointer
			else {
				right--;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 12, -7, 5, -3, 4, -2, 9, -8 };
		shiftNegativeValues(arr);
		 System.out.println(Arrays.toString(arr));

	}
}
