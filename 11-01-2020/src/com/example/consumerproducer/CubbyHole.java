package com.example.consumerproducer;

public class CubbyHole {
private int content;
private boolean available = false;
private final static String PROD = "Batch";
MyStack ms = null;
int count = 0;
CubbyHole(int content)
{
	this.content = content;
	ms = new MyStack(content);
	
}
public synchronized String produce()
{	
	while(available==true)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	count++;
	String str = PROD+" "+count; 
	ms.push(str);
	available = true;
	System.out.println(str);
	notifyAll();
	return str;
	
}

public synchronized String consume()
{
	while(available==false)
	{
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	String str = ms.pop()+" "+" Consumed";
	available = false;
	System.out.println(str);
	notifyAll();
	return str;
}

}
