package loops;

import java.util.Scanner;

public class Name5Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name = sc.next();
		int counter = 1;
		System.out.println("Enter the number of times you want to print your name");
		int askedCount = sc.nextInt();
		while (counter<=askedCount)
		{
			System.out.println("Your name is: "+name);
			counter++;
		}

	}

}
