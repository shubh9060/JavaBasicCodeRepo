package MACINETESTREVISE;

public class QQ1 {
	public static void main(String args[]) {
		int k = 0, l = 0;
		for (int i = 1; i <= 11; i++) {
			boolean b = true;
			if (i <= 5)
				k = i;
			else
				l = --k;

			for (int j = 1; j <= 11; j++) {
				if (j >= i && i <= 6 && j <= 12 - i && b || i >= 6 && j >= 7 - (i - 5) && j <= (i - 5) + 5 && b) {
					if (i < 6) {
						System.out.print(k++);
						b = false;
					} else {
						System.out.print(l++);
						b = false;
					}
				} else {
					System.out.print(" ");
					b = true;
				}
			}
			System.out.println();
		}
	}

}
