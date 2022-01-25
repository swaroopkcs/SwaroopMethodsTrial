package Arrays;

import java.util.Scanner;

public class PropertyPriceChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] propertyType = { "Condominium", "Town House", "Semi Detatched", "Detached" };
		double[] propertyPriceinMillion = new double[4];
		propertyPriceinMillion[0] = 0.58;
		propertyPriceinMillion[1] = 0.81;
		propertyPriceinMillion[2] = 1.12;
		propertyPriceinMillion[3] = 1.46;
		System.out.println("Property Proces in Brampton");
		System.out.println("Please enter the type of property that you want to check for average price");
		System.out.println("Press 1 for Condominium");
		System.out.println("Press 2 for Town House");
		System.out.println("Press 3 for Semi Detached");
		System.out.println("Press 4 for Detatched");
		Scanner sc = new Scanner(System.in);
		int typeOfProperty = sc.nextInt();
		switch (typeOfProperty) {
		case 1:
			propertyPriceinMillion[0] = 0.7;
			System.out.println(
					"The average price of a " + propertyType[0] + " in Brampton is " + propertyPriceinMillion[0]);
			break;
		case 2:
			System.out.println(
					"The average price of a " + propertyType[1] + " in Brampton is " + propertyPriceinMillion[1]);
			break;
		case 3:
			System.out.println(
					"The average price of a " + propertyType[2] + " in Brampton is " + propertyPriceinMillion[2]);
			break;
		case 4:
			System.out.println(
					"The average price of a " + propertyType[3] + " in Brampton is " + propertyPriceinMillion[3]);
			break;
		default:
			System.out.println("Please enter a valid number");
		}

	}

}
