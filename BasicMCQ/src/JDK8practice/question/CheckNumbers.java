package JDK8practice.question;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class CheckNumbers {

	public static void main(String[] args) {

		// check given number is perfect using jdk8 stream class methods
		int no = 6;

		int sum = IntStream.rangeClosed(1, no / 2).filter(x -> no % x == 0).sum();
		System.out.println("No :" + no + "\tSum:" + sum);
		if (sum == no) {
			System.out.println("Given Number is Perfect Perfect");
		} else {
			System.out.println("Given Number is Not Perfect");
		}
		
		IntStream s;
		DoubleStream ss;
		
		
		// check Given number is Prime Number
		
		int value = 6;
		System.out.println("Sqrt :" +(Math.sqrt(value)));
		boolean b = IntStream.rangeClosed(2,(int)Math.sqrt(value)).noneMatch(x -> value%x==0);
		if(b) {
			System.out.println("Number is Prime");
		}else{
			System.out.println("Number is Not Prime");
		}
		
		int example = 01234;
		
		String ex = String.valueOf(example);
		
		boolean result = ex.chars().anyMatch(x-> x == '0');
		
		if(result) {
			System.out.println("Given Number is Duck");
		}else {
			System.out.println("Given Number is Not Duck");
		}
		// check Given Number is ArmStrong or not
		
		int value1 = 153;
		String r1 = String.valueOf(value1);
		
		
		int lenght = r1.length();
		
		int b1 = r1.chars().map(Character::getNumericValue).map(digit->(int)Math.pow(digit, lenght)).sum();
		if(b1==value1) {
			System.out.println("Given Number is Armstrong");
		}else {
			System.out.println("Given Number is Not Armstrong");
		}
		
		
		Calendar cd;
	}
	
}
