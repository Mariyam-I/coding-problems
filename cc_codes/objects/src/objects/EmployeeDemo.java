package objects;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee e = new Employee();

		e.employeeID  = 78965 ;
		e.name = "Priya Sharma" ;
		e.designation = " Software Engineer" ;
		e.department = "Development" ;
		e.salary = 1200000;
		e.yearsOfExperience = 5 ;
		
		System.out.println("Employee ID = " +e.employeeID);
		System.out.println("Name = " +e.name);
		System.out.println("Designation = " +e.designation);
		System.out.println("Department = " +e.department);
		System.out.println("Salary in Rupees = " +e.salary);
		System.out.println("Experieence in Years = " +e.yearsOfExperience);
		
		System.out.println("-------Methods Call-------");
		e.work();
		e.takeLeave();
		e.getPromotion();
		e.receiveSalary();
	}
}

/*
Employee ID = 78965
Name = Priya Sharma
Designation =  Software Engineer
Department = Development
Salary in Rupees = 1200000.0
Experieence in Years = 5
-------Methods Call-------
Priya developed a new feature for Infosys banking software.
She applied for three days of leave for a family function.
After five years, she was promoted to Senior Software Engineer.
Her salary of ?1,00,000 was credited to her account.

*/