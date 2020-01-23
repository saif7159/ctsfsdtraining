package com.sorting.natural;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingTest {
List<String> names;
{
	names = new LinkedList<String>();
	names.add("Saif");
	names.add("Mannu");
	names.add("Arun");
}
public static void main(String[] args)
{
	SortingTest st = new SortingTest();
	Collections.sort(st.names);
	System.out.println(st.names);
	System.out.println(Collections.binarySearch(st.names, "Saif"));
	
	
}

}
