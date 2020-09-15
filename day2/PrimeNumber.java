package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =13;
		
		for(int i=2; i<=input;++i) {
			if(input % i ==1) {
				System.out.println("13 is prime number");
				break;
			}else {
				System.out.println("13 is not prime number");
			}
		}

	}

}
