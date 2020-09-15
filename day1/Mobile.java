package week1.day1;

public class Mobile {
	String mobColor = "Gold";
	double mobWeightInGrams = 150D;
	long mobNumber = 1234567890L;
	boolean isRefurbished = false;
	public void makeCall() {
		System.out.println("call is connecting");
	}
	public void sendMessage() {
		System.out.println("message is send");
	}

	public void takePhoto() {
		System.out.println("photo is taken");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMessage();
		myMobile.takePhoto();
		System.out.println(myMobile.mobColor);
		System.out.println(myMobile.mobWeightInGrams);
		System.out.println(myMobile.mobNumber);
		System.out.println(myMobile.isRefurbished);
	}

}
