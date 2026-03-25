package com.cc._heirarical_inheritance;

public class Intern extends Employee {

	private String university;
	private String branch;
	
	//Getter Setter for university
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	//Getter Setter for branch
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	//Behaviors
	public void attendTraining() {
		System.out.println("~~~~~>Students are attending training from 10am to 5pm");
	}
	public void submitReport() {
		System.out.println("~~~~~>Every one are submitting an internship progress report");
	}
}
