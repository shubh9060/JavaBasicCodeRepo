package Exception_Program;

import java.util.*;
class D{
	
	void show(int no) {
			System.out.println("result :"+(no/0));
	}
	void show(String s)
	{
		this.show(5);
		System.out.println("Value :"+s);
	}
}
public class FindMinAndMax {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
	
		D d = new D();
		d.show("ajay");
		
		
		
		
		
		
		
		List<Integer> sl = Arrays.asList(55,3,4,32,25,1,4,2,1,767);
				Integer minValue = sl.stream().min((c1,c2) -> (c1<c2)?-1:(c2==c1)?0:1).get();
				Integer maxValue = sl.stream().max((c1,c2) -> (c1<c2)?-1:(c2==c1)?0:1).get();
				//sl.forEach(x->System.out.println(x));
				System.out.println("Min Value :"+minValue);
				System.out.println("Max Value :"+maxValue);
	}
}
