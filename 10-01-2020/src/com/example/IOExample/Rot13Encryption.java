package com.example.IOExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Rot13Encryption {
static int shift = 13;
public void encrypt(String source, String dest) throws IOException
{
	FileReader fr = new FileReader(source);
	FileWriter fw = new FileWriter(dest);
	BufferedReader br = new BufferedReader(fr);
	BufferedWriter bw = new BufferedWriter(fw);
	String message = br.readLine();
	char[] encrypted = new char[message.length()];
	for(int i =0;i<message.length();i++)
	{
		char c = message.charAt(i);
		if       (c >= 'a' && c <= 'm') shift= 13;
        else if  (c >= 'A' && c <= 'M') shift= 13;
        else if  (c >= 'n' && c <= 'z') shift = -13;
        else if  (c >= 'N' && c <= 'Z') shift = -13;
		encrypted[i] = (char) (message.charAt(i)+shift);
		System.out.println(encrypted[i]);
	}
	
	bw.write(encrypted);
	br.close();
	bw.close();
}
}
