package com.cc.tree_object_sorting;

import java.util.Comparator;

public class EmpSalaryDescendingSorting implements Comparator<Employee>{

	@Override
	public int compare(Employee empSalary1, Employee empSalary2) {
		
//		Changine only signs
		if(empSalary1.getEmpSalary() > empSalary2.getEmpSalary()) {
			return -1;
		} else if(empSalary1.getEmpSalary() < empSalary2.getEmpSalary()) {
			return 1;
		} else {
			return 0;
		}
	}

}
