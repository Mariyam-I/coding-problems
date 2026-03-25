package com.cc.tree_object_sorting;

import java.util.Comparator;

public class EmpIdDescendingSort implements Comparator<Employee>{

	@Override
	public int compare(Employee empId1, Employee empId2) {
		
//		Changing the signs
		if(empId1.getEpmId() > empId2.getEpmId()) {
			return -1;
		} else if(empId1.getEpmId() < empId2.getEpmId()) {
			return 1;
		} else {
			return 0;
		}
	}

}
