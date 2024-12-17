package org.ArrayProgramms;

import java.util.*;

public class StringWithMap {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int size = 6;
		System.out.println("Enter the heights Number");
		int h = sc.nextInt();
		int a[] = new int[size + 1];

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] == a[j]) {

					for (int k = j; k < size; k++) {
						a[k] = a[k + 1];
					}
					size--;
					j--;
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println("values :"+a[i]);
		}
		System.out.println("******");
		// for(int i=0;i<size;i++)
		System.out.println("---->" + a[h]);

	}

}