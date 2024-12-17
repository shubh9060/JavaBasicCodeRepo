package Exception_Program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	private int sid, fees;
	private String name;

	public Student(int sid, int fees, String name) {
		super();
		this.sid = sid;
		this.fees = fees;
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public int getFees() {
		return fees;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fees=" + fees + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sid;
	}

	@Override
	public boolean equals(Object obj) {

		Student s = (Student) obj;
		if (s.getSid() == this.sid) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.sid < this.sid ? -1 : (o.sid == this.sid) ? 0 : 1;
	}
}

public class FindUniqueElementFromPojoObject {

	public static void main(String[] args) {

		List<Student> sList = Arrays.asList(new Student(101, 25000, "Ajay"), new Student(102, 35000, "Sanjay"),
				new Student(100, 65000, "Vijay"), new Student(101, 85000, "Dinesh"), new Student(102, 5000, "Ram"));

		Stream<Student> stream = sList.stream();
		// stream.distinct().forEach(st->System.out.println(st));
		
		
		System.out.println("Count of List:" + sList.size());
		long dublicatedCount = sList.size() - sList.stream().distinct().count();
		long uniqueCount = sList.stream().distinct().count();
		System.out.println("Unique Records :" + uniqueCount);
		System.out.println("Count of dublicate Recourds :" + dublicatedCount);
	
		stream.distinct().sorted().forEach(x->System.out.println(x));
		//stream.distinct().forEach(st -> System.out.println(st));

		
	}
}
