package com.cc.tree_object_sorting;

import java.util.Comparator;

public class EmpNameAsendingSorting implements Comparator<Employee>{

	@Override
	public int compare(Employee empName1, Employee empName2) {
		
		return empName1.getEmpName().compareTo(empName2.getEmpName());
	}

}
