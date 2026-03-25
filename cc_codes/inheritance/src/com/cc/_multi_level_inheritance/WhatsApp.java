package com.cc._multi_level_inheritance;

public class WhatsApp extends SocialMedia{
	
	private int dailyMessage;
	private int groupCount;
	
	//Getter Setter for DailyMessage
	public int getDailyMessage() {
		return dailyMessage;
	}
	public void setDailyMessage(int dailyMessage) {
		this.dailyMessage = dailyMessage;
	}
	
	//Getter Setter for GroupCount
	public int getGroupCount() {
		return groupCount;
	}
	public void setGroupCount(int groupCount) {
		this.groupCount = groupCount;
	}
	
	
	//Behaviors
	public void createGroup() {
		System.out.println("~~~~~>Group is created");
	}
	public void startVideoCall() {
		System.out.println("~~~~~>Video call started successfully");
	}

}
