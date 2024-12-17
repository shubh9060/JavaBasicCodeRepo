package Feb.March.June.MachineTest11102024;

public class QQQ4 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 1, 5, 20, 2, 12, 10 };
		// int uniqueArray[]=new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			if (count < 2 && arr[i] != -1)
				System.out.println("Unique Elements :" + arr[i]);
		}

		int a1[] = { 1, 2, 3, 4, 5 }, a2[] = { 6, 7, 8, 9, 10 };
		
		
		
		

	}

}
