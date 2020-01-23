package com.example.threading;

public class PriorityTesterMain {
public static void main(String[] main)
{
	/*Thread t1 = new ThreadPriorityTest("Thread 1",Thread.MIN_PRIORITY);
	Thread t2 = new ThreadPriorityTest("Thread 2", Thread.NORM_PRIORITY);
	Thread t3 = new ThreadPriorityTest("Thread 3", Thread.MAX_PRIORITY);*/
	Thread t1 = new ThreadPriorityTest("Thread 1");
	Thread t2 = new ThreadPriorityTest("Thread 2");
	Thread t3 = new ThreadPriorityTest("Thread 3");
	//t1.setName("Thread 1");
	//t2.setName("Thread 2");
	//t3.setName("Thread 3");
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.NORM_PRIORITY);
	t3.setPriority(Thread.MAX_PRIORITY);
	t1.start();
	t2.start();
	t3.start();
	
}
}
