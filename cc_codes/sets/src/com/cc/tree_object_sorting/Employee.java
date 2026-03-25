package com.cc.tree_object_sorting;

public class Employee {

	private int epmId;
	private String empName;
	private Double empSalary;
	private int experience;
	
	public Employee(int epmId, String empName, Double empSalary, int experience) {
		super();
		this.epmId = epmId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.experience = experience;
	}

	public int getEpmId() {
		return epmId;
	}
	public void setEpmId(int epmId) {
		this.epmId = epmId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [epmId=" + epmId + ", empName=" + empName + ", empSalary=" + empSalary + ", experience="
				+ experience + "]";
	}

	
	
}
