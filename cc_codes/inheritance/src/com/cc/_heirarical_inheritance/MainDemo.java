package com.cc._heirarical_inheritance;

public class MainDemo {

	public static void main(String[] args) {
	
		//Object for employee
		Employee e = new Employee();
		
		e.setName("Mariyam");
		e.setAge(21);
		e.setGender("Female");
		e.setSalary(100000);
		
		System.out.println("Name = "+e.getName());
		System.out.println("Age = "+e.getAge());
		System.out.println("Gender = "+e.getGender());
		System.out.println("Salary per month = "+e.getSalary());
		
		e.work();
		e.takeBreak();
		
		System.out.println("------------------------------------------------");
		
		//Object for manager
		Manager m = new Manager();
		
		m.setName("Mariyam");
		m.setAge(21);
		m.setGender("Female");
		m.setSalary(100000);
		m.setTeamSize(30);
		m.setDepartment("Tech");
		
		System.out.println("Name = "+m.getName());
		System.out.println("Age = "+m.getAge());
		System.out.println("Gender = "+m.getGender());
		System.out.println("Salary per month = "+m.getSalary());
		System.out.println("Team Size = "+m.getTeamSize());
		System.out.println("Department = "+m.getDepartment());
		
		m.work();
		m.takeBreak();
		m.conductMeeting();
		m.evaluvateTeamPerformance();
		
		System.out.println("------------------------------------------------");
		
		//Object for developer
		Developer d = new Developer();
		
		d.setName("Mariyam");
		d.setAge(21);
		d.setGender("Female");
		d.setSalary(100000);
		d.setProgrammingLanguage("Java");
		d.setProjects("Resume Builder");
		
		System.out.println("Name = "+d.getName());
		System.out.println("Age = "+d.getAge());
		System.out.println("Gender = "+d.getGender());
		System.out.println("Salary per month = "+d.getSalary());
		System.out.println("Programming Language = "+d.getProgrammingLanguage());
		System.out.println("Project = "+d.getProjects());
		
		d.work();
		d.takeBreak();
		d.writeCode();
		d.fixBugs();
		
		System.out.println("------------------------------------------------");
		
		//Object for intern
		Intern i = new Intern();
		
		i.setName("Mariyam");
		i.setAge(21);
		i.setGender("Female");
		i.setSalary(100000);
		i.setUniversity("Vtu");
		i.setBranch("CSE");
		
		System.out.println("Name = "+i.getName());
		System.out.println("Age = "+i.getAge());
		System.out.println("Gender = "+i.getGender());
		System.out.println("Salary per month = "+i.getSalary());
		System.out.println("University = "+i.getUniversity());
		System.out.println("Branch = "+i.getBranch());
		
		i.work();
		i.takeBreak();
		i.attendTraining();
		i.submitReport();
	}

}


/*
Name = Mariyam
Age = 21
Gender = Female
Salary per month = 100000.0
.....Doing work
.....Break time started
------------------------------------------------
Name = Mariyam
Age = 21
Gender = Female
Salary per month = 100000.0
Team Size = 30
Department = Tech
.....Doing work
.....Break time started
----->Meeting will be conducted at 10am
----->Team performance is evaluated to best
------------------------------------------------
Name = Mariyam
Age = 21
Gender = Female
Salary per month = 100000.0
Programming Language = Java
Project = Resume Builder
.....Doing work
.....Break time started
*****Code is written Java language
*****Bugs fixing
------------------------------------------------
Name = Mariyam
Age = 21
Gender = Female
Salary per month = 100000.0
University = Vtu
Branch = CSE
.....Doing work
.....Break time started
~~~~~>Students are attending training from 10am to 5pm
~~~~~>Every one are submitting an internship progress report
*/