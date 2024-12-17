package JDK8practice.question;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ProductClass implements Comparable<ProductClass>{
	
	int id;
	String name;
	double price;
	public ProductClass(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "ProductClass [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		ProductClass prr = (ProductClass)obj;
		
		return prr.id==id?true:false;
	}
	@Override
	public int compareTo(ProductClass o) {
		// TODO Auto-generated method stub
		return price<o.price?1:price==o.price?0:-1;
	}
}
public class Jdk8Practice11 {

	public static void main(String[] args) {
	
		ProductClass p1 = new ProductClass(101,"xyz",65.00);
		ProductClass p2 = new ProductClass(100,"xyz",45.00);
		ProductClass p3 = new ProductClass(103,"xyz",50.00);
		ProductClass p4 = new ProductClass(100,"xyz",100.00);
		ProductClass p5 = new ProductClass(101,"xyz",400.00);
		
		List<ProductClass> prodList = Arrays.asList(p1,p2,p3,p4,p5);
		prodList.stream().forEach(x->System.out.println(x));
		DoubleSummaryStatistics collect = prodList.stream().collect(Collectors.summarizingDouble((x)->x.getPrice()));
		System.out.println("Sum of All Product :"+collect.getSum());
		System.out.println("Average of All Product :"+collect.getAverage());
		System.out.println("Minimum Value in All Product:"+collect.getMin());
		System.out.println("Maximum Value in All Product:"+collect.getMax());
		System.out.println("Count the Number of Products:"+collect.getCount());
		System.out.println("Sorted data in Decending Order :");
		prodList.stream().sorted().forEach(x->System.out.println(x));
		System.out.println("=================================limit() and skip()====================================");
		prodList.stream().limit(2).forEach(x->System.out.println(x));
		System.out.println("===========================find Second Highest===============================");
		prodList.stream().limit(2).skip(1).forEach(x->System.out.println(x));
		
		System.out.println("===================================All Data============================================");
		prodList.stream().forEach(x->System.out.println(x));
		System.out.println("================================after remove dublicate================================");
		prodList.stream().distinct().forEach(x->System.out.println(x));
		System.out.println("===================================find Second Highest==============================");
		prodList.stream().distinct().limit(2).skip(1).forEach(x->System.out.println(x));
		
	
		Boolean b = isPrimeCheck(6);	
	}
	
		static boolean isPrimeCheck(int no) 
		{
			if(no<=1) {
				return false;
			}
			
			long s = IntStream.rangeClosed(1, no/2).filter(x -> no%x==0).sum();
			System.out.println("Result :"+s);
			return true;
		}
}
