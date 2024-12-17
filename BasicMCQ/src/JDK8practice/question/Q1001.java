package JDK8practice.question;

//Java 8 on Practice Questions 
//1. Filter even numbers from a list of integers
//  Write a program that filters even numbers from a list of integers using Java 8 Streams.
import java.util.*;
import java.util.stream.Collectors;

public class Q1001 {

		public static void main(String[] args) {
			
			List<Integer> arList = Arrays.asList(2,3,1,4,6,6,6,633,3,3,9);
			
			// before Remove Dublicate
			List<Integer> evenList = arList.stream().filter((x) -> x%2==0).collect(Collectors.toList());
			arList.stream().filter((x) -> x%2==0).collect(Collectors.toList()).forEach(r->System.out.println(r));
			System.out.println("Even List :"+evenList);
			
			// after Remove Dublicate
			/*
			 * Explanation:- in above code we have one ArrayList i.e
			 * Arrays.asList(2,3,1,4,6,6,6,633,3,3,9) if we want to perform some operation on
			 * it so first one we convert above list into the stream after that we use
			 * stream severals methods i.e filter etc.
			 * if we want to check given elements are even or not so we use filter method 
			 * filter method have parameter 'Predicate Interface' filter(Predicate<T>)
			 * Predicate Interface are functional interface they have test method this method are have boolean return type
			 * in above code we use lambda expresion of Predicate interface i.e filter((x)->x%2==0)
			 * after that we store even elements using collect() method collect method also have one parameter name as
			 * Collectiors class thoes class have severals methods i.e toList(),toSet() etc. in above code we use toList() method
			 * and collect all even elements in List and store in referencial varibale i.e evenList
			 * 
			 * 
			 */
			
			arList.stream().distinct().filter(x->x%2==0).collect(Collectors.toList()).forEach(y->System.out.println(y));
			
		}
}
