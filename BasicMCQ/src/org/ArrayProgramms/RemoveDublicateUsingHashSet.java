package org.ArrayProgramms;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveDublicateUsingHashSet {

		public static void main(String[] args) {
			
			HashSet<String> set = new HashSet();
			set.add("abc");
			set.add("mno");
			set.add("xyz");
			set.add("abc");
			set.add("abc");
			set.add("mno");
			String str[] = new String[set.size()];
			set.toArray(str);
			for (String string : str) {
				System.out.println(string);
			}
			
		}
}
