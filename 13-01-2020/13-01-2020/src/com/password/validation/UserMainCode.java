package com.password.validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserMainCode {
public boolean checkPassword(String password) throws InvalidPasswordException
{	
	boolean valid = false;
	if(password.length()<8)
	{
		valid = false;
		throw new InvalidPasswordException("Password is less than eight characters");
	}
	else
	{	
		Pattern	pupper = Pattern.compile("[A-Z]");
		Pattern	lower = Pattern.compile("[a-z]");
		Pattern special = Pattern.compile("[^a-z0-9]",Pattern.CASE_INSENSITIVE);
		Pattern number = Pattern.compile("[0-9]");
		boolean matchupper = pupper.matcher(password).find();
		boolean matchlower = lower.matcher(password).find();
		boolean matchspec = special.matcher(password).find();
		boolean matchnumber = number.matcher(password).find();
		if(!matchupper)
		{
			valid = false;
			throw new InvalidPasswordException("Does not contain upper case");
		}
		if(!matchlower)
		{
			valid = false;
			throw new InvalidPasswordException("Does not contain lower case");
		}
		if(!matchspec)
		{
			valid = false;
			throw new InvalidPasswordException("Does not contain special character");
		}
		if(!matchnumber)
		{
			valid = false;
			throw new InvalidPasswordException("Does not contain a number");
		}
		else
		{
			valid = true;
		}
		
		
	}
	return valid;
}
}
