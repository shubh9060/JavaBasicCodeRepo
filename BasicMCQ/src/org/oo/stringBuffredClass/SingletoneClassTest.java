package org.oo.stringBuffredClass;
class EmployeeInfo {
	private static EmployeeInfo e = null;
	private EmployeeInfo(){} // this is a Private Constructor
	public static EmployeeInfo getInstance()
	{
		if(e==null) // 1651191114 == null
		{
			e = new EmployeeInfo(); // e = 1651191114
		}
			return e; //1651191114	
	}
}
public class SingletoneClassTest {
	public static void main(String[] args){
		
		EmployeeInfo e1 = EmployeeInfo.getInstance();
		System.out.println("EmployeeInfo First Object :"+e1.hashCode());//1651191114
		
		EmployeeInfo e2 = EmployeeInfo.getInstance();
		System.out.println("EmployeeInfo Second Object :"+e2.hashCode());//1651191114
	}
}
