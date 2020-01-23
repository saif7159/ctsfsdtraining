package com.multiple.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentDetail> {

	@Override
	public int compare(StudentDetail o1, StudentDetail o2) {
		// TODO Auto-generated method stub
		
		return o1.getName().compareTo(o2.getName());
		
	}


}
