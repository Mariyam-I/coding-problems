package com.cc._single_inheritance;

public class WhatsApp extends SocialMedia {

	int dailyMessage;
	int groupCount;
	
	public void sendMessage() {
		System.out.println("----->Message sends successfully");
	}
	public void createGroup() {
		System.out.println("----->Group is created");
	}
	public void startVideoCall() {
		System.out.println("----->Veido call started successfully");
	}
}
