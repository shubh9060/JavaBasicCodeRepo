package org.oo;

public class MCCQ {

	{
		System.out.println("One.........!");
	}

	static {
		System.out.println("Third..........!");
	}

	public static void main(String args[]) {
		
		MCCQ mcc = new MCCQ();
		System.out.println("Second...........!");
	}

}

/*
 * Integer num1 = 100; Integer num2 = 100; // -128 to 127
 * 
 * 
 * Integer num3 = 500; Integer num4 = 500;
 * 
 * 
 * if (num1 == num2) { System.out.println("Num1==Num2"); } else
 * System.out.println("Not Equal");
 * 
 * if (num4 == num3) System.out.println("num3==num4"); else
 * System.out.println("num3 != num4");
 * 
 * //Not Equal //num3 != num4
 * 
 */