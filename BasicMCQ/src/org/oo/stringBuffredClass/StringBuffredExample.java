package org.oo.stringBuffredClass;

import java.io.FileReader;
import java.util.*;

class Employee {

	int id, price;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", price=" + price + ", name=" + name + "]";
	}

	public Employee(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
}

class PerformOperation {

	Employee eee[];

	void setEmployee(Employee ...eee) {
		this.eee = eee;
	}
	Employee []getEmployee(){
		Employee emp[]=new Employee[eee.length];
		int max = eee[0].getPrice();
		int smax=0;
		for(int i=0;i<eee.length;i++)
		{
			if(max<eee[i].getPrice())
			{
				smax = max;
				max = eee[i].getPrice();
				
			}else if(eee[i].getPrice()!=max && smax<eee[i].getPrice())
			{
				smax = eee[i].getPrice();
			}
		}
		System.out.println("Smax value:"+smax+"\tMax Value:"+max);
		int index=0;
		for(int i=0;i<eee.length;i++)
		{
//			if(eee[i].getPrice()==smax) {
//				emp[index++]=eee[i];
//			}
			if(eee[i].getPrice()==smax)
				System.out.println(eee[i].getId()+"\t"+eee[i].getName()+"\t"+eee[i].getPrice());
		}
		
		
		return emp;
	}
}


public class StringBuffredExample {

	public static void main(String[] args) {

	
		
		
		Employee e1 = new Employee(1010, 4500, "AAA");
		Employee e2 = new Employee(2010, 1500, "BBB");
		Employee e3 = new Employee(1340, 2500, "CCC");
		Employee e4 = new Employee(1950, 2500, "DDD");
		PerformOperation pObject = new PerformOperation();
		pObject.setEmployee(e1,e2,e3,e4);
		Employee temp[]=pObject.getEmployee();
		System.out.println("Second Highest Price :");
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i].getId()+"\t"+temp[i].getName()+"\t"+temp[i].getPrice());
		}
	}
}
