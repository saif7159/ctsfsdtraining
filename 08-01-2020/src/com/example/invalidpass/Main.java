package com.example.invalidpass;

public class Main {
public static void main(String[] args) throws InvalidPasswordException
{
 PasswordChecker pc = new PasswordChecker("Saidasdas43");	
 System.out.println("Password validity: "+pc.checkPassword());
}
}
