package com.sorting.natural;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListImplementation {
	String [] str = {"Ronaldo","Messi","Benzema","Sergio Ramos","Jesse Lingard","Virgil van dijk"};
	public static void main(String[] args)
	{
		ArrayToListImplementation atli = new ArrayToListImplementation();
		List<String> list = Arrays.asList(atli.str);
		int index = Collections.binarySearch(list, "Virgil van dijk");
		System.out.println(list.get(index)+" "+index);
		Collections.shuffle(list);
		System.out.println("Shuffling players "+list);
	}
}
