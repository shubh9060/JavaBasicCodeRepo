package JuneAssignmentPrograms100Programs;

import java.util.HashSet;

class Test extends java.lang.Object {
	int no;
	String name;
	Test(int x,String n) {
		no = x;
		name=n;
	}

	public boolean equals(Object object) {
		Test test = (Test) object;
		if (test.no == no && this.name.equals(test.name)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return no * 2;
	}

	@Override
	public String toString() {
		return "Test [no=" + no + ", name=" + name + "]";
	}

	

}

public class HowToCheckTwoObjectAreEquals {

	public static void main(String[] args) {

		HashSet set = new HashSet();
		set.add(new Test(1011,"c"));// 1254
		set.add(new Test(1001,"a"));// 2002
		set.add(new Test(1001,"a"));// 2002
		set.add(new Test(1001,"a"));// 2002
		set.add(new Test(1001,"a"));// 2002
	
		for (Object o : set) {
			Test t = (Test) o;
			System.out.println("Values:" + t);
		}

//			Test t1= new Test(100);
//			System.out.println("First Object Identity HashCode:"+System.identityHashCode(t1)+"\t"+t1.hashCode());
//			Test t2 = new Test(100);
//			System.out.println("Second Object Identity HashCode:"+System.identityHashCode(t2)+"\t"+t2.hashCode());
//			System.out.println("Result:"+(t1==t2));
	}
}
