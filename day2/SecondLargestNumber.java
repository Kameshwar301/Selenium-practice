package week1.day2;

import java.util.Arrays;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 13, 11, 12, 14};
		Arrays.sort(arr);
		int lastIndex = arr.length-1;
		System.out.println(arr[lastIndex-1]);
	}

}
