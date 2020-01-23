package com.example.exceptiontest;

import java.io.IOException;

public class ExceptionTest {
void generateException(int i) throws IOException,NullPointerException
{
 if (i==1)
 {
	 throw new IOException();
 }
 if(i==2)
 {
	 throw new NullPointerException();
 }
}
public static void main(String[] args)
{
	
 ExceptionTest et = new ExceptionTest();
 try {
	 et.generateException(1);
	 et.generateException(2);
} catch (NullPointerException e) {
	e.printStackTrace();
	System.err.println("Null Pointer Exception");
} catch (IOException e) {
	e.printStackTrace();
	System.err.println("IO Exception");
}
 finally
 {
	 System.out.println("Still alive");
 }
 
}
}
