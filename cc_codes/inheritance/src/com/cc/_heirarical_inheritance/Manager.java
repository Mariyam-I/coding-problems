package com.cc._heirarical_inheritance;

public class Manager extends Employee {

	private int teamSize;
	private String department;
	
	//Getter Setter for TeamSize
	public int getTeamSize() {
		return teamSize;
	}
	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	//Getter Setter for Department
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	//Behaviors
	public void conductMeeting() {
		System.out.println("----->Meeting will be conducted at 10am");
	}
	public void evaluvateTeamPerformance() {
		System.out.println("----->Team performance is evaluvated to best");
	}
}
