package MethodTrial;

import java.util.Scanner;

public class InterestCalc {
	void interest(double balance) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of months that you want to calculate interest for: ");
		int months = sc.nextInt();
		double interest = balance*2.5*months/12;
		System.out.println("The interest accumulated will be: "+interest);
	}

}
