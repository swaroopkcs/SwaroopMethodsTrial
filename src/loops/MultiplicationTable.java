package loops;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the multiplication table that you want to print");
		int multTable = sc.nextInt();
		System.out.println("Enter the number of multiples that you want to see");
		int multiplier = sc.nextInt();
		for (int forCounter = 1;forCounter<=multiplier;forCounter++) {
			int product = multTable*forCounter;
			System.out.println(multTable+" multiplied by "+forCounter+ " is "+product);
		}
	}

}
