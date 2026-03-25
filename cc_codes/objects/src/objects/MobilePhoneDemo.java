package objects;

public class MobilePhoneDemo {

	public static void main(String[] args) {
		
		MobilePhone mP = new MobilePhone();
		
		mP.brand = " Samsung";
		mP.model = "Galaxy S23 Ultra ";
		mP.screenSize = "6.8 inches";
		mP.batteryCapacity = "5000 mAh " ;
		mP.operatingSystem = " Android 14  " ;
		mP.storage = " 256GB" ;
		
		System.out.println("Brand = " +mP.brand);
		System.out.println("Model = " +mP.model);
		System.out.println("Screen Size = " +mP.screenSize);
		System.out.println("Battery Capacity = " +mP.batteryCapacity);
		System.out.println("Operating System = " +mP.operatingSystem);
		System.out.println("Storage = " +mP.storage);
		
		System.out.println("---------Methods Call--------");

		mP.makeCall();
		mP.sendMessage();
		mP.installApp();
		mP.chargeBattery();
	}
}




/*
Brand =  Samsung
Model = Galaxy S23 Ultra 
Screen Size = 6.8 inches
Battery Capacity = 5000 mAh 
Operating System =  Android 14  
Storage =  256GB
---------Methods Call--------
We can make calls using mobiles from any location
Mobile is also used for sending messages or text to others
From the Google Play Store we can installed the multiple apps
 plugged in the charger for Charging the battery
 
 */