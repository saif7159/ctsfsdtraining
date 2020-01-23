package com.example.threading;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		for(int i= 0;i<5;i++)
		{
			System.out.println("Thread ID: "+Thread.currentThread().getId()+"	Thread Name: "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

}
