package week1.day2;

public class Calculator {

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
		Calculator my = new Calculator();
		int add=my.add(10,20);
		System.out.println(add);
		int sub=my.sub(10,20);
		System.out.println(sub);
		double mult=my.mult(4, 5);
		System.out.println(mult);
	}
}
