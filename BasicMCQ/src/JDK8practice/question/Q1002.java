package JDK8practice.question;

import java.util.*;
import java.util.stream.Collectors;

//2.Find the sum of all numbers greater than 50 from a list
//Given a list of numbers, use streams to find the sum of all numbers greater than 50.

public class Q1002 {

	public static void main(String[] args) {

		List<Integer> alist = Arrays.asList(5, 3, 4, 6, 7, 8, 8, 91, 2, 2, 4);

		// List<Integer> even1 =
		// alist.stream().filter(x->x%2==0).collect(Collectors.toList());
		alist.stream().filter(x -> x > 5).mapToInt(Integer::intValue).forEach(x -> System.out.println(x));
		Integer sum = alist.stream().filter(x -> x > 5).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all Greater Than 50 Values :" + sum);

		/*
		 * Explanation:- in above code we have one ArrayList i.e
		 * Arrays.asList(5,3,4,6,7,8,8,91,2,2,4) if we want to perform some operation on
		 * it so first one we convert above list into the stream after that we use
		 * stream severals methods i.e filter etc.
		 * 
		 * 
		 * 
		 * 
		 */
	}

}
