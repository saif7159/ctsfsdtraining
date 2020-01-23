package com.example.invalidpass;

public class PasswordChecker {
	String password;
    char[] passarray;
    char[] validchars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1',
    		'2','3','4','5','6','7','8','9'};
	public PasswordChecker(String password) {
		super();
		this.password = password.toLowerCase();
	}
	
	public boolean checkPassword() throws InvalidPasswordException
	{	//conversion to character array
		passarray = new char[password.length()];
		//result array final result is true if each element in this is true
		boolean[] result = new boolean[passarray.length];
		boolean finalresult = true;
		if(password.length()<8||password.length()>15)
		{
			finalresult = false;
		}else {
		for(int i=0;i<password.length();i++)
		{   result[i] = false;
			passarray[i] = password.charAt(i);
			for(int j=0 ;j<validchars.length; j++)
			{
				if(passarray[i]==validchars[j])
				{
					result[i] = true;
				}
				
			}
			
		}}
		for(int x=0;x<result.length;x++)
		{
			//System.out.println(result[x]);
			if(result[x]==false)
			{
				finalresult = false;
			}
		}
		if(finalresult==false)
		{
			throw new InvalidPasswordException("Password contains special character valid characters are [A-Z] [a-z] [0-9]");
		}
		return finalresult;
	}

}
