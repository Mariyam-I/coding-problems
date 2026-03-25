package com.cc._multi_level_inheritance;


public class WhatsAppBusiness extends WhatsApp {
	
	private String businessName;
	private String businessCategory;
	private boolean isVarified;
	
	//Getter Setter for businessName
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	//Getter Setter for businessCategory
	public String getBusinessCategory() {
		return businessCategory;
	}
	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}
	//Getter Setter for verified
	public boolean isVarified() {
		return isVarified;
	}
	public void setVarified(boolean isVarified) {
		this.isVarified = isVarified;
	}
	
	
	//Behaviors
	public void showBusinessHour() {
		System.out.println("=====>9am to 6pm");
	}
	public void sendingMessage() {
		System.out.println("=====>Message Send successfully");
	}
	
	
}
