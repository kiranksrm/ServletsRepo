package com.methodrefence.example;


interface Ex1
{
	void say();
}

public class MethodReference11 {

	
	public void saySomething()
	{
		System.out.println("Inside saySomething() method which is non-static method..");
	}
	
	public void printMsg()
	{
		System.out.println("Hello..");
	}
	public static void main(String[] args) {
		
		
		MethodReference11 m = new MethodReference11();
//		m.saySomething();
		
		Ex1 m1 =m::saySomething;
		m1.say();
		
		Ex1 m2= new MethodReference11()::saySomething;
		m2.say();
		
		
		Thread t = new Thread(new MethodReference11()::printMsg);
		t.start();
	}

}
