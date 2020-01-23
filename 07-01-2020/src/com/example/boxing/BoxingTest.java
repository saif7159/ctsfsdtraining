package com.example.boxing;

public class BoxingTest {
public static void main(String[] args)
{
 int pint = 420; //primitive
 Integer wint;   //Wrapper
 wint = pint;    //primitive to wrapper AutoBoxing
 int p3 = wint;  //AutoUnboxing wrapper to primitive
 System.out.println(pint+"\n"+wint+"\n"+p3);
}
}
