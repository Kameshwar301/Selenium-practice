package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=0, x2=1,count=8;
		int i;
			System.out.println(x1+" "+x2);
		for(i=2;i<count;i++)
		{
			int x3 = x1+x2;
			System.out.println(" "+x3);
			x1=x2;
			x2=x3;
			
		}
	}

}
