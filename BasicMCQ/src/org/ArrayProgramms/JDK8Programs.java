package org.ArrayProgramms;
import java.util.*;

public class JDK8Programs {

		public static void main(String[] args) {
			
				HashSet<Integer> set = new HashSet();
				set.add(55);
				set.add(66);
				set.add(55);
				set.add(99);
				set.add(22);
				set.add(99);
				System.err.println("Orignal:"+set);
//				set.stream().filter(x->x%2==0).forEach(y->System.out.println(y));
				// we want to make clone copy of Hashset;
				
				HashSet new_Copy = new HashSet();
				new_Copy = (HashSet)new_Copy.clone();
				System.out.println("Clone:"+set);
				
		}
}
