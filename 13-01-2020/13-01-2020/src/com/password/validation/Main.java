package com.password.validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException
{
boolean valid = false;
UserMainCode umc = new UserMainCode();	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
System.out.println("Enter the password: ");
String password = br.readLine();
try {
	valid = umc.checkPassword(password);
} catch (InvalidPasswordException e) {
	// TODO Auto-generated catch block
	System.err.println("Password not valid try again");
	e.printStackTrace();
}
System.out.println("Password Validation: "+valid);
}
}
