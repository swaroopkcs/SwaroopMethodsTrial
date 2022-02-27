package accessModifiers;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Person obj = new Person();
		// System.out.println(obj.sin);

		// obj.name="Kate";

		Scanner sc = new Scanner(System.in);

		boolean isEligibletoAccessSin = true;

//		System.out.println("Enter you insitution name");
//		
//		String instName = sc.next();
//		
//		if(instName.equals("Bank")|| instName.equals("Employer")|| instName.equals("Mortgage")) {
//			isEligibletoAccessSin = true;
//		}

		// System.out.println(obj.getSin(isEligibletoAccessSin));

		// objects representing information of each person in this class.
		// Store personal information of each person in this class.

		Person customer1 = new Person("Swaroop", 7867868, 286868767);

		// Access name of customer
		System.out.println("Name : " + customer1.getName());

		// Access sin of customer

		System.out.println("Sin : " + customer1.getSin(isEligibletoAccessSin));

		// Access phone number

		System.out.println("Phone : " + customer1.getPhone());

		System.out.println("Do you want to update your phone number");

		String changeInfo = sc.next();

		if (changeInfo.equals("Yes")) {
			System.out.println("Enter phone number");
			long phNo = sc.nextLong();
			if (phNo != customer1.getPhone()) {
				customer1.setPhone(phNo);
				System.out.println("Phone number updated to  : " + customer1.getPhone());
			} else {
				System.out.println("The phone number entered is same");

			}
		}

		// Person priyanka = new Person();

		// obj.personalStuff();

//		SocialMedia socialMedia = new SocialMedia();
//		
//		System.out.println(socialMedia.post);

		// abc@gmail.com -
	}

}
