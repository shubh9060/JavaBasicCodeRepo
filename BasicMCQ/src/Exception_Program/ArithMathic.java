package Exception_Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithMathic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;
		do {
			System.out.println("Case 1 : Arithmatic");
			System.out.println("Case 2 : Input Miss Match");
			System.out.println("Case 3 : Array Index Out Of Bonds");
			System.out.println("Case 4 : Null Pointer Exception");
			System.out.println("Case 5 : Class Not Found Exception");

			System.out.println("Enter Condition");
			int key = sc.nextInt();

			switch (key) {
			case 1:

				System.out.println("Enter A Value And B Value");
				a = sc.nextInt();
				b = sc.nextInt();

				try {
					c = a / b;

				} catch (ArithmeticException e) {

					System.out.println("Error is " + e);
				}

				break;

			case 2:

				System.out.println("Enter A Value And B Value");

				try {

					a = sc.nextInt();
					b = sc.nextInt();
					c = a / b;

				} catch (InputMismatchException e1) {

					System.out.println("Error is InputMismatch " + e1);
				}

				break;

			case 3:

				try {

					int arr[] = new int[3];
					for (int i = 0; i < arr.length + 1; i++) {

						arr[i] = sc.nextInt();
					}
				} catch (ArrayIndexOutOfBoundsException e) {

					System.out.println("Error is ArrayIndexOutOfBounds " + e);
				}

				break;

			case 4:

				try {

					String s = getData(null);

					System.out.println(s.toUpperCase());
				} catch (NullPointerException e) {
					System.out.println("Error is NullPointer " + e);
				}

				break;
			default:
				break;
			}
		} while (true);

	}

	private static String getData(String s) {

		return s;
	}

}
