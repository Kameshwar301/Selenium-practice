package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b,rem;
		int n = 153;
		b=n;
		while (n>0) {
			rem = n % 10;
			n =  n / 10;
			a = a + (rem*rem*rem);
		}
			if(b == a) {
				System.out.println("is an Armstrongnumber");
			
			}else {
				System.out.println("is not an Armstrongnumber");
				
			}
	}
}
