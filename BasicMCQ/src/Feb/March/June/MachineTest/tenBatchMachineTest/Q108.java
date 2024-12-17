package Feb.March.June.MachineTest.tenBatchMachineTest;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Birds {
	int bId;
	String name, habits;

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

	public Birds(int bId, String name, String habits) {
		super();
		this.bId = bId;
		this.name = name;
		this.habits = habits;
	}

	public Birds() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class Q108 {

	public static void main(String[] args) {
		
		LinkedList<Birds>  lBirds = new LinkedList<Birds>();
		lBirds.add(new Birds(301, "mno", "ooo"));
		lBirds.add(new Birds(300, "xyz", "iii"));
		lBirds.add(new Birds(303, "stv", "YYY"));
		lBirds.add(new Birds(304, "rto", "KKK"));
		System.out.println("Before UnSorted Data:");
		for(Birds b:lBirds)
		{
			System.out.println("Id:"+b.getbId()+"\tName:"+b.getName()+"\tHabit:"+b.getHabits());
		}
		Collections.sort(lBirds,new Comparator<Birds>(){

			@Override
			public int compare(Birds o1, Birds o2) {
				// TODO Auto-generated method stub
				return o1.getbId()-o2.getbId();
			}
		});
		System.out.println("=======================Sort By Id DATA =================================");
		System.out.println("After Sort By Id:");
		for(Birds b:lBirds)
		{
			System.out.println("Id:"+b.getbId()+"\tName:"+b.getName()+"\tHabit:"+b.getHabits());
		}
		
		Collections.sort(lBirds,new Comparator<Birds>(){

			@Override
			public int compare(Birds o1, Birds o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("=========================Sort By Name Data===============================");
		System.out.println("After Sort By Id:");
		for(Birds b:lBirds)
		{
			System.out.println("Id:"+b.getbId()+"\tName:"+b.getName()+"\tHabit:"+b.getHabits());
		}
		
		
		
		
	}
}
