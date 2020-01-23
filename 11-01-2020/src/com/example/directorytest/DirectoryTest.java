package com.example.directorytest;

import java.io.File;

public class DirectoryTest {
	public static void main(String[] args)
	{
		File file = new File("root");
		file.mkdir();
		File subdir1 = new File(file,"subdir1");
		subdir1.mkdir();
		File subdir2 = new File(subdir1,"subdir2");
		subdir2.mkdir();
		System.out.println(subdir2.isDirectory()?"Directory":"File");
		System.out.println(subdir2.getName());
		String[] content = subdir2.list();
		for(String s:content)
		{
			System.out.println(s);
		}
	
		System.out.println("Deleting subdir2");
		subdir2.delete();
		System.out.println(subdir2.exists());
	}
}
