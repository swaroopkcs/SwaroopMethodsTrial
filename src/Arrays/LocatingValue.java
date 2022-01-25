package Arrays;

import java.util.Scanner;

public class LocatingValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find at what index Brampton is present in this array ?
		 String[] Cities = {"Kingston","Toronto","London","Brampton","Ottawa","Mississauga"}; 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please enter the numner of cities that you want to enter."); 
		  int i=sc.nextInt(); 
		  String []cities = new String[i];
		  for(i=0;i<cities.length;i++) { 
			  System.out.println("Please enter the city name "+(i+1));
			  cities[i] = sc.next();
			  }
		 System.out.println("Please enter the city name that you want to check");
		 String cityCheck = sc.next();
		for (i = 0; i < cities.length; i++) {
			if (Cities[i].equals(cityCheck)) {
				System.out.println("The city "+cityCheck+" is entered at the location " + (i + 1) + " which is index " + i);
				break;
			}
		}

	}

}
