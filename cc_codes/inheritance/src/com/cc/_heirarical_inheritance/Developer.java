package com.cc._heirarical_inheritance;

public class Developer extends Employee {

	private String programmingLanguage;
	private String projects;
	
	//Getter Setter for programming language
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	
	//Getter Setter for projects
	public String getProjects() {
		return projects;
	}
	public void setProjects(String projects) {
		this.projects = projects;
	}
	
	//Behaviors
	public void writeCode() {
		System.out.println("*****Code is written in Java language");
	}
	public void fixBugs() {
		System.out.println("*****Bugs fixing");
	}
}
