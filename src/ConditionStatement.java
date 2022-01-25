
public class ConditionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 100;
		boolean isGreater = num1>num2;
		boolean isEqual = num1==num2;
		if(isGreater) {
			System.out.println(num1+" is greater than "+num2);
		}else if(isEqual) {
			System.out.println(num2+" is equal to "+num1);
		}else {
			System.out.println(num1+" is less than "+num2);
		}

	}

}
