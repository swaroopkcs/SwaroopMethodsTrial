package Arrays;

public class DeclaringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and Initialize
		int[] populationInMillion = {15,5,8,9,7,10};
		String[] citiesShortName = {"TOR", "OTT", "SUD", "BWR", "CAL", "YAR"};
		//Declare the array with the length
		
		int[] avgSalaryPerHour = new int[5];
		avgSalaryPerHour[0] = 20;
		avgSalaryPerHour[1] = 19;
		avgSalaryPerHour[2] = 15;
		avgSalaryPerHour[3] = 14;
		avgSalaryPerHour[4] = 13;
		
		System.out.println("Toronto is usually written as "+citiesShortName[0]);
		System.out.println("population in "+citiesShortName[1]+" is "+populationInMillion[1]);
		System.out.println("The average salary in "+citiesShortName[4]+" is "+avgSalaryPerHour[4]);
		

	}

}
