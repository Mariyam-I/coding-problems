package com.cc.tree_object_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeedDemo {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(101, "Rida", 100000.0, 3));
		emp.add(new Employee(102, "Zikra", 5700283.0, 2));
		emp.add(new Employee(100, "Anam", 97000954.0, 5));
		emp.add(new Employee(106, "Ziya", 2000000.0, 7));
		emp.add(new Employee(105, "Mariya", 89000000.0, 9));
		emp.add(new Employee(107, "Rohan", 95784666.0, 8));
		emp.add(new Employee(103, "Suman", 300043000.0, 6));
		
		System.out.println("------> Before");
		System.out.println(emp +" \n");
		
		Collections.sort(emp, new EmpIdAscendingSorting());
		System.out.println("*** based on Emp Id  ---> Ascending order sording");
		System.out.println(emp +" \n");
		
		Collections.sort(emp, new EmpIdDescendingSort());
		
		System.out.println("*** based on Emp Id  ---> Descending order sording");
		System.out.println(emp +" \n");
		
		Collections.sort(emp, new EmpExperienceAscendingSorting());
		System.out.println("*** based on Emp Experience ---> Ascending order sorting");
		System.out.println(emp + " \n");

		Collections.sort(emp, new EmpExperienceDescendingSorting());
		System.out.println("*** based on Emp Experience ---> Descending order sorting");
		System.out.println(emp + " \n");
		
		Collections.sort(emp, new EmpSalaryAscendingSorting());
		System.out.println("*** based on Emp Salary ---> Ascending order sorting");
		System.out.println(emp +" \n");
		
		Collections.sort(emp, new EmpSalaryDescendingSorting());
		System.out.println("*** based on Emp Salary ---> Descending order sorting");
		System.out.println(emp +" \n");
		
		Collections.sort(emp, new EmpNameAsendingSorting());
		System.out.println("*** based on Emp Name ---> Ascending order sorting");
		System.out.println(emp +" \n");
		
		Collections.sort(emp, new EmpNameDescendingSorting());
		System.out.println("*** based on Emp Name ---> Descending order sorting");
		System.out.println(emp +" \n");
		
	}

}


/*
Many classes in the Java standard library implement the Comparable interface 
to provide a natural ordering for their instances. 
This allows objects of these classes to be sorted
using methods like Arrays.sort() or Collections.sort() 
without needing an external Comparator.
*/