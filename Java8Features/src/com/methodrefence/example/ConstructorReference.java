package com.methodrefence.example;

interface MessageEx
{
  Message getMessage(String msg);	
}

class Message
{
	Message(String message) {
		System.out.println(message);
	}
}



public class ConstructorReference {

	public static void main(String[] args) {
		//Message m1 = new Message("Text");
		
		MessageEx m=Message::new;
		m.getMessage("Sample Message");

	}

}
