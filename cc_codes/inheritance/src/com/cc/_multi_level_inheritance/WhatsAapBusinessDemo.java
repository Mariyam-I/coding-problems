package com.cc._multi_level_inheritance;

public class WhatsAapBusinessDemo {
	public static void main(String[] args) {

		//Parent Class SocialMedia Object
		SocialMedia sm = new  SocialMedia();
		
		sm.setPlatformName( "FaceBook");
		sm.setLaunchYear(2004);
		sm.setActive(true);
		
		System.out.println("Platform Name : " +sm.getPlatformName());
		System.out.println("Launch Year : " +sm.getLaunchYear());
		System.out.println("Active Status : " +sm.isActive());
		
		sm.platformStatus();
		sm.checkStatus();
		sm.updateUserAccount();	
		
		System.out.println("----------------------------------------------");
		
		//Child Class WhatsApp Object
		WhatsApp wa = new WhatsApp();
		
		wa.setPlatformName("WhatsApp");
		wa.setLaunchYear(2009);
		wa.setActive(true);
		wa.setDailyMessage(1000);
		wa.setGroupCount(20);
		
		System.out.println("Platform Name : " +wa.getPlatformName());
		System.out.println("Launch Year : " +wa.getLaunchYear());
		System.out.println("Active Status : " +wa.isActive());
		System.out.println("Daily message = "+wa.getDailyMessage());
		System.out.println("Group count = "+wa.getGroupCount());
		
		wa.platformStatus();
		wa.checkStatus();
		wa.updateUserAccount();
		wa.createGroup();
		wa.startVideoCall();
		
		System.out.println("================================================");
		
		//GrandChild Class WhatsAppBusiness Object
		
		WhatsAppBusiness wb = new WhatsAppBusiness();
		
		wb.setPlatformName("WhatsApp");
		wb.setLaunchYear(2009);
		wb.setActive(true);
		wb.setDailyMessage(1000);
		wb.setGroupCount(20);
		wb.setBusinessName("WhatsAppBusiness");
		wb.setBusinessCategory("IT Service");
		wb.setVarified(true);
		
		System.out.println("Platform Name : " +wb.getPlatformName());
		System.out.println("Launch Year : " +wb.getLaunchYear());
		System.out.println("Active Status : " +wb.isActive());
		System.out.println("Daily message = "+wb.getDailyMessage());
		System.out.println("Group count = "+wb.getGroupCount());
		System.out.println("Business Name = "+wb.getBusinessName());
		System.out.println("Business Category = "+wb.getBusinessCategory());
		System.out.println("Varified Status = "+wb.isVarified());
		
		wb.platformStatus();
		wb.checkStatus();
		wb.updateUserAccount();
		wb.createGroup();
		wb.startVideoCall();
		wb.showBusinessHour();
		wb.sendingMessage();
	}

}





/*
Platform Name : FaceBook
Launch Year : 2004
Active Status : true
----->Platform is trending world wide
----->Currently running smoothly
----->Account updated
----------------------------------------------
Platform Name : WhatsApp
Launch Year : 2009
Active Status : true
Daily message = 1000
Group count = 20
----->Platform is trending world wide
----->Currently running smoothly
----->Account updated
~~~~~>Group is created
~~~~~>Video call started successfully
================================================
Platform Name : WhatsApp
Launch Year : 2009
Active Status : true
Daily message = 1000
Group count = 20
Business Name = WhatsAppBusiness
Business Category = IT Service
Verified Status = true
----->Platform is trending world wide
----->Currently running smoothly
----->Account updated
~~~~~>Group is created
~~~~~>Video call started successfully
=====>9am to 6pm
=====>Message Send successfully

*/