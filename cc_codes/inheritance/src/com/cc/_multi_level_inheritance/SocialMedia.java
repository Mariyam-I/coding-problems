package com.cc._multi_level_inheritance;

public class SocialMedia {
	private String platformName;
	private int launchYear;
	private boolean isActive;
	
	//Getter Setter for PlatformName
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	//Getter Setter for LaunchYear
	public int getLaunchYear() {
		return launchYear;
	}
	public void setLaunchYear(int launchYear) {
		this.launchYear = launchYear;
	}

	//Getter Setter for isActive
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	//Behaviors
	public void platformStatus() {
		System.out.println("----->Platform is trending world wide");
	}
	public void checkStatus() {
		System.out.println("----->Currently running smoothly");
	}
	public void updateUserAccount() {
		System.out.println("----->Account updated");
	}
}
