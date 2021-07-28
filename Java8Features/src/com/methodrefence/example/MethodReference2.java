package com.methodrefence.example;

public class MethodReference2 {

	
	public static void threadStatus()
	{
		System.out.println("Thread is running...");
	}
	
	public static void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Thread t = new Thread(MethodReference2.class).start();
//		t.gets
		
		Runnable r=MethodReference2::threadStatus;
		r.run();
		
		Runnable r1 = MethodReference2::run;
		r1.run();
		
		
		Thread t = new Thread (MethodReference2::threadStatus);
		t.start();
		
	}

}
