package week1.day2;

public class SwitchOperator {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	double mult(int a, int b) {
		return a*b;
		}
	public static void main(String[] args) {
		SwitchOperator oper = new SwitchOperator();
		int input =1;
		switch(input) {
		case 1: int add=oper.add(2,3);
		System.out.println(add);
		break;
		case 2: int sub=oper.sub(2,3);
		System.out.println(sub);
		break;
		case 3: double mult=oper.mult(4, 5);
		System.out.println(mult);
		break;
		default:System.out.println("none");
		break;
		}

	}

}
