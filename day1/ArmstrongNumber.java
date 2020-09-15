package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int org=153;
		int input = 153;
		int sum = 0;
		int rem;
		while(input >0) {
			rem=input%10;
			sum=sum + (rem*rem*rem);
			rem=input/10;
		}
		if(input==org)
		{
			System.out.println("is Armstrong Number");
		}
		else {
			System.out.println("not an Armstrong number");
		}
	}
}
