package JDK8practice.question;

//3. Convert a list of strings to uppercase
//Use streams to convert a list of strings to uppercase.
import java.util.*;
import java.util.function.Function;

public class Q1003 {

	public static void main(String[] args) {

		List<String> al = Arrays.asList("abcd", "mno", "xyz", "rrr", "pqr");
		
		// if we want to convert String lower to upper case in jdk8 code we use some method
		// map(classname::methods) eg. map(String::toUpperCase)
		
		al.stream().map(String::toUpperCase).toList().forEach(x->System.out.println(x));
		
		
		/*
		 * in above we perform some operation on it i.e convert string lower to upper using some metods
		 * 
		 * step 1 ->  Store more than one values in Single List List<String> al = Arrays.asList("abcd", "mno", "xyz", "rrr", "pqr");
		 * step 2 ->  Before perform some operation on Elements we convert Collections type to Stream Type 
		 * step 3 ->  after convertion collection to stream we use method i.e map(Function<? super T, ? extends R> mapper) this
		 *  		  method are accept all type of values by using generics as well as we perform :: on it i.e map(String::toUpperCase)
		 * step 4 ->  after convert String lower to upper we store converted values in List using toList() method
		 * step 5 ->  after perform all operation we print elements using forEach(x->s.o.p(x)) method.
		 *
		 *  		  
		 * 
		 * 
		 */
		
	}
}
