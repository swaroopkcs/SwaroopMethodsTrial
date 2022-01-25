package loops;

import java.util.Scanner;

public class WallPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of coats that you want to apply");
		int coats = sc.nextInt();
		int counter = 1;
		do {
			System.out.println("Paint coat applied "+counter+" times");
			counter++;
		} while (counter<=coats);

	}

}
