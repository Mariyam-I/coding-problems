package com.cc.tree_object_sorting;

import java.util.Comparator;

public class EmpExperienceDescendingSorting implements Comparator<Employee> {

	@Override
	public int compare(Employee empExperience1, Employee empExperience2) {

//		Changinr only signs
		if (empExperience1.getExperience() > empExperience2.getExperience()) {
			return -1;
		} else if (empExperience1.getExperience() < empExperience2.getExperience()) {
			return 1;
		} else {
			return 0;
		}
	}

}
