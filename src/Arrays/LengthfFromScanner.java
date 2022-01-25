package Arrays;

import java.util.Scanner;

public class LengthfFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of students in the class");
		int i = sc.nextInt();
		String[] name = new String[i];
		for (i=0; i<name.length; i++) {
			System.out.println("Please enter the name of student"+(i+1));
			name[i] = sc.next();
		}
		for (i=0; i<name.length;i++) {
			System.out.println("The name of student "+(i+1)+" is "+name[i]);
		}
			
	}

}
