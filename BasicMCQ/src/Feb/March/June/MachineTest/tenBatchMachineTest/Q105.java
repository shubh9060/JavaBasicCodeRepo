package Feb.March.June.MachineTest.tenBatchMachineTest;

import java.util.*;
import java.util.Map.Entry;

/*
 write a program to create following Structure for Biscuit manufacturing Company
 Using LinkedHashMap and Generics.
 
 Parle-G ->  PG001 : Id=1,Name="Parle-g",Price=5
 			 PG002 : Id=2,Name="Parle-g Gold",Price=10
 			 PG003 : Id=3,Name="Parle-g Chota Bheem",Price=15
 			.
 			.
 			.
 			. N number of Keys and Values Store into the Map  
 
 */
class Company {

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

	public Company(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

}

public class Q105 {

	public static void main(String[] args) {

		LinkedHashMap<String, LinkedHashMap<String, Company>> outerMap = new LinkedHashMap<String, LinkedHashMap<String, Company>>();
		LinkedHashMap<String, Company> innerMap = new LinkedHashMap<String, Company>();

		String companyName1 = "Parle-G";
		String companyName2 = "Britania";
		String companyName3 = "Oreo";
		// Company products[] = new Company[3];

		innerMap.put("PG001", new Company(101, 25, "Parle-G"));
		innerMap.put("PG002", new Company(102, 45, "Parle-G Gold"));
		innerMap.put("PG003", new Company(103, 15, "Parle-G Chota Bheem"));
		outerMap.put(companyName1, innerMap);

		for (Entry<String, LinkedHashMap<String, Company>> fMap : outerMap.entrySet()) {

			String keys = fMap.getKey();

			System.out.println("Company Name:" + keys);

			LinkedHashMap<String, Company> temp = fMap.getValue();

			for (Map.Entry<String, Company> ff : temp.entrySet()) {
				String productName = ff.getKey();
				System.out.print("ProductName:" + productName);

				Company c = ff.getValue();

				System.out.print(" Id:" + c.getId() + "\tName:" + c.getName() + "\tPrice:" + c.getPrice());
				System.out.println();
			}

		}

	}
}
