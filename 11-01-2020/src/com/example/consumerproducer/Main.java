package com.example.consumerproducer;

public class Main {
public static void main(String[] args)
{
	Thread t1 = new Consumer(10);
	Thread t2 = new Producer(15);
	t2.start();
	t1.start();
	
}
}
