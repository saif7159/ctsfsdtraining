package com.example.threading;

public class ThreadPriorityTest extends Thread {
String Name;
public ThreadPriorityTest(String name) {
	super(name);
	
}
@Override
public void run()
{
	for(int i= 0;i<5;i++)
	{
		System.out.println("Thread ID: "+Thread.currentThread().getId()+"	Thread Name: "+Thread.currentThread().getName()+"	Thread Priority: "+Thread.currentThread().getPriority());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
}
}}
