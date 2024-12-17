package org.ArrayProgramms;
interface MyGenrics<E>{
	void setValue(E e);
}
class Circle<E> implements MyGenrics<Integer>{
	Integer radius;
	@Override
	public void setValue(Integer e) {
		// TODO Auto-generated method stub
		radius=e;
	}
	public void calculate() {
		int areaOfCircule = radius*radius*(int)3.14f;
		System.out.println("Area of Circule:"+areaOfCircule);
	}
}
class Square<E> implements MyGenrics<Integer>{

	Integer i;

	@Override
	public void setValue(Integer e) {
		// TODO Auto-generated method stub
		i=e;
	}
	public void calculate() {
		Integer sq = i*i;
		System.out.println("Square is:"+sq);
	}
	
}
public class GenricsProgram1 {

		public static void main(String[] args)
		{
			Circle<Integer> mGenrics = new Circle();
			mGenrics.setValue(5);
			mGenrics.calculate();
			
			Square<Integer> square = new Square();
			square.setValue(5);
			square.calculate();
			
		}
}
