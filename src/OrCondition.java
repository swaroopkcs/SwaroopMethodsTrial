
public class OrCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I need a car
		boolean isCreditApproved = true;
		boolean isCashAvailable = false;
		if (isCreditApproved||isCashAvailable) {
			System.out.println("I can buy a car");
		}else {
			System.out.println("I cannot buy a car. Someone needs to gift it to me");
		}

	}

}
