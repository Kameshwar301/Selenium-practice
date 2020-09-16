package week1.day2;

public class PrintDuplicate {
	
	
	public static void main(String[] args) {
		int [] arr = {10,14,13,16,18,14,12,10,50,16,17};
		int values = arr.length+1;
		System.out.println("the duplicate value is ");
		for (int i=0;i<arr.length+1;i++) {
			
			for(int j = i+1; j<arr.length-1;j++) {
				if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
				}
			}
			
		}
	}

}
