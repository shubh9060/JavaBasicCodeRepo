package JDK8practice.question;

import java.util.*;
import java.util.function.Consumer;
class DoubleColoneUser{
	
	public static void printTable(Integer no)
	{
		
			System.out.println("Tables :"+no*no);
		
	}
}

public class DoubleColon {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);

		// with Consumer anonymous approch
		
		al.forEach(new Consumer<Integer>() {

			public void accept(Integer i) {
				System.out.println("values :"+i*5);
			}
		
		});
		
		System.out.println("====================");
		
		// with Lambda Expresion approch
		
		//al.forEach(x->System.out.println(x));
		al.forEach(DoubleColoneUser::printTable);
		
		//al.forEach(DoubleColoneUser::printTable(5));
		
		
	}
}
