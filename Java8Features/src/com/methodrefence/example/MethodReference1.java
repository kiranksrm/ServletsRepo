package com.methodrefence.example;


interface Ex
{
	void say();
}

public class MethodReference1 {

	
	public static void saySomething()
	{
		System.out.println("Inside saySomething() method..");
	}
	
	public static void main(String[] args) {
		
		//saySomething(); // j.16
		//referring Static method
		Ex m =MethodReference1::saySomething;
		
		m.say();
	}

}
