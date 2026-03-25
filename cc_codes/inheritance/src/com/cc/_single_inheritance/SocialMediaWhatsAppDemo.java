package com.cc._single_inheritance;

public class SocialMediaWhatsAppDemo {

	public static void main(String[] args) {

		SocialMedia sm = new  SocialMedia();
		
		sm.platformName = "FaceBook";
		sm.launchYear = 2004;
		sm.isActive = true;
		
		System.out.println("Platform Name : " +sm.platformName);
		System.out.println("Launch Year : " +sm.launchYear);
		System.out.println("Active Status : " +sm.isActive);
		
		sm.platformStatus();
		sm.checkStatus();
		sm.updateUserAccount();
		
		System.out.println("*********************************************");
		
		sm.platformName = "WhatsApp";
		sm.launchYear = 2009;
		sm.isActive = true;
		
		System.out.println("Platform Name : " +sm.platformName);
		System.out.println("Launch Year : " +sm.launchYear);
		System.out.println("Active Status : " +sm.isActive);
		
		sm.platformStatus();
		sm.checkStatus();
		sm.updateUserAccount();
		
		System.out.println("----------------------------------------------");
		
		WhatsApp wa = new WhatsApp();
		
		wa.dailyMessage =  1000;
		wa.groupCount = 20;
		
		System.out.println("Daily message = "+wa.dailyMessage);
		System.out.println("Group count = "+wa.groupCount);
		
		wa.sendMessage();
		wa.createGroup();
		wa.startVideoCall();
//		wa.checkStatus();
	}

}




/*
Platform Name : FaceBook
Launch Year : 2004
Active Status : true
----->Platform is trending world wide
----->Currently running smoothly
----->Account updated
*********************************************
Platform Name : WhatsApp
Launch Year : 2009
Active Status : true
----->Platform is trending world wide
----->Currently running smoothly
----->Account updated
----------------------------------------------
Daily message = 1000
Group count = 20
----->Message sends successfully
----->Group is created
----->Video call started successfully
*/