package com.example.counter;

public class Counter {
private static Integer count;
private final int MAX;
static {
	count = 0;
}
Counter()
{
 super();
 MAX=100;	
}
Counter(String temp)
{
	super();
	count++;
 MAX = 1000;		
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return Integer.toString(MAX)+"\n"+count;
}

}
