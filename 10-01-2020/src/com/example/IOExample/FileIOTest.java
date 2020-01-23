package com.example.IOExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOTest {
public static void main(String[] args) throws IOException
{
	File inputfile = new File("test");
	File outfile = new File("out");
	FileInputStream fi = new FileInputStream(inputfile);
	FileOutputStream fo = new FileOutputStream(outfile);
	int i = 0;
	while((i =fi.read())!=-1) {
	fo.write((char)i);
	System.out.println((char) i);	
	}
	fi.close();
	fo.close();
}
}
