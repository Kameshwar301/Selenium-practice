package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {


	public static void main(String[] args) {
		int [] arr = {1,5,3,2,7,6};
		Arrays.sort(arr);
		int n= arr.length+1;
		int sum = (n*(n+1))/2;
		for (int i=0;i<arr.length;i++) {
			sum =sum - arr[i];
			
		}
		System.out.println("Missing Number is:" +sum);
		
	}

}
