package com.example.threading;

public class BasicThreadCycle {
public static void main(String[] args)
{
Thread t = new Thread(new ThreadTest(),"Thread 1");
Thread t1 = new Thread(new ThreadTest(),"Thread 2");
t.start();
t1.start();
}
}
