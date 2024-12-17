package org.ArrayProgramms;
class Test implements Cloneable{
	int no;
	void setValue(int no)
	{
		this.no=no;
	}
	Test getInstance() throws CloneNotSupportedException{
		return (Test)this.clone();
	}
}
public class ObjectCloneing {

		public static void main(String[] args) {
			
			Test t1 = new Test();
			t1.setValue(10000);
			System.out.println("Number Varibale Values is:"+t1.no);//10000
			
			try {
				Test t2 = t1.getInstance();//2010
				t2.setValue(6000);//2012
				System.out.println("After Object Share Number Value is:"+t1.no);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error Genrated When we Create Clone Of Object:"+e);//6000
			}
			
//			Test t1 = new Test();
//			t1.setValue(500);
//			System.out.println("Number Varibale Values is:"+t1.no);
//			Test t2 = new Test();
//			t2=t1;
//			t2.setValue(10000);
//			System.out.println("After Object Share Number Value is:"+t1.no);
			
		}
}
