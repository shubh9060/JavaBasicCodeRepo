package Feb.March.June.MachineTest.tenBatchMachineTest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 
 	Write a Program to create Generic Method that takes a list of any Type and prints
 	Palindroms from list.
 	
 */
import java.util.*;

public class Q107 {

	// Generic method to check for palindromes
	public static <T> void printPalindromes(List<T> list) {
		for (T element : list) {
			if (isPalindrome(element.toString())) {
				System.out.println(element);
			}
		}
	}

	
//	private static boolean isPalindrome(Integer no) {
//		
//		int temp = no,rev=0;
//		while(temp!=0)
//		{
//			int rem = temp%10;
//			rev = rev*10+rem;
//			temp/=10;
//		}
//		System.out.println("REverse:"+rev);
//		return no==rev?true:false;
//	}
	
	// Method to check if a string is a palindrome
	private static boolean isPalindrome(String str) {
		int n = str.length();
		for (int i = 0; i < n / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// Create a list of mixed types (Strings, Integers, etc.)
		List<Object> list = Arrays.asList("madam", 121, "hello", "racecar", 12321, 45654, "world");

		// Print palindromes from the list
		System.out.println("Palindromes in the list:");
		printPalindromes(list);
	}
}
