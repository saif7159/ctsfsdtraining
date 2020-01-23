package com.example.finallytest;

public class FinallyTest {
	static int count = 0;
	public static void main(String[] args) 
	{
	while (true)
	{
		try {
		if(count++==0)
		{
			throw new MyException("New My Exception");	
		}}
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		finally {
			System.out.print("inside finally ");
			if(count ==2);
					break;
		}
	}
	
	}

}
