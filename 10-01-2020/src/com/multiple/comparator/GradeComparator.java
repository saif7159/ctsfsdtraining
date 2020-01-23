package com.multiple.comparator;

import java.util.Comparator;

public class GradeComparator implements Comparator<StudentDetail> {

	@Override
	public int compare(StudentDetail o1, StudentDetail o2) {
		int result=0;
		if(o1.cgpa>o2.cgpa)
		{
			result = -1;
		}
		else if(o1.cgpa<o2.cgpa)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}

}
