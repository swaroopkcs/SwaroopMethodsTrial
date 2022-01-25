package loops;

import java.util.Scanner;

public class AtmPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int pin = 1234;
		System.out.println("Please enter your PIN: ");
		int pinEntered = sc.nextInt();
		for (int counter =1; counter<=5; counter++) {
		if (pinEntered==pin) {
			System.out.println("The PIN Entered is correect. Please enter the amount that you want to take");
			break;
		} else {
				System.out.println("Your PIN is incorrect. Please enter PIN again: ");
				pinEntered = sc.nextInt();
			}
		}

	}

}
