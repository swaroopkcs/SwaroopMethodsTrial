package SwitchClass;

import java.util.Scanner;

public class RoomSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the device that you want to turn on");
		int button = 1;
		System.out.println("Press 1 to turn on the fan");
		System.out.println("Press 2 to switch on the light");
		System.out.println("Press 3 to switch on the TV");
		System.out.println("Press 4 to.. Please don't press 4");
		Scanner sc = new Scanner (System.in);
		button=sc.nextInt();
		switch(button){
			case 1: {
				System.out.println("The fan is turned on.");
				break;
			}
			case 2: {
				System.out.println("The light is turned on.");
				break;
			}
			case 3: {
				System.out.println("The TV is turned on.");
				break;
			}
			case 4: {
				System.out.println("Booomm. I told you not to press 4");
			}
		}
		

	}

}
