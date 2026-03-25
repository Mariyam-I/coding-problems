package objects;

public class MobilePhone {
	
	String brand ;
	String model ;
	String screenSize ;
	String batteryCapacity ;
	String operatingSystem ;
	String storage ;
	
	
	public void makeCall() {
		System.out.println("We can make calls using mobiles from any location");
	}
	public void sendMessage() {
		System.out.println("Mobile is also used for sending messages or text to others");
	}
	public void installApp() {
		System.out.println("From the Google Play Store we can installed the multiple apps");
	}
	public void chargeBattery() {
		System.out.println(" plugged in the charger for Charging the battery");
	}
}