package org.ArrayProgramms;
import java.util.*;
class Product{
	int pid,price;
	String name;
	public Product(int pid, int price, String name) {
		super();
		this.pid = pid;
		this.price = price;
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	@Override
	public int hashCode() {
		return this.pid*1000;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && pid == other.pid && price == other.price;
	}
	
}
public class ManuallySortCollectionData {

	public static void main(String[] args) {
		
		
			HashSet<Product> set = new HashSet();
			if(new Product(100,600,"vijay") == new Product(100,600,"vijay")) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
			
//			set.add(new Product(101,55,"Amul"));
//			set.add(new Product(101,66,"Parle-G"));
//			set.add(new Product(103,99,"Vipul"));
//			set.add(new Product(104,35,"Britania"));
//			for(Product p:set) {
//				System.out.println(p.getPid()+"\t"+p.getName()+"\t"+p.getPrice());
//			}
	}
}
/*
ArrayList al = new ArrayList();
		al.add(55);
		al.add(44);
		al.add(99);
		al.add(66);
		al.add(992);
		al.add(22);
		
		System.out.println("Before Sort:");
		for (Object object : al) {
			System.out.println(object);
		}
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				Object o1 = al.get(i);
				Object o2 = al.get(j);
				if((int)o1>(int)o2)
				{
					al.set(i, o2);
					al.set(j, o1);
				}
			}
		}
		List<Integer> all = Collections.unmodifiableList(al);
		all.add(555);
		System.out.println("After Sort:");
		for (Object object : al) {
			System.out.println(object);
		}
*/