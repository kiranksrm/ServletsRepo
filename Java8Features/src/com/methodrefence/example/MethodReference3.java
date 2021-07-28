package com.methodrefence.example;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

class Arithmetic
{
	public static int add(int i, int j) {
		return i + j;
	}
	public static void sum(int i, int j) {
		System.out.println(i + j);
	}
	
	public static void display(int i)
	{
		System.out.println(i);
	}
}

public class MethodReference3 {

	public static void main(String[] args) {
		
				
		//java 1.8
		BiFunction<Integer, Integer, Integer> addVar=  Arithmetic::add;
		
		int sum=addVar.apply(200, 200);
		System.out.println(sum);
		
		
		
		//java 1.8
				BiConsumer<Integer, Integer> addVar1=  Arithmetic::sum;
				
				addVar1.accept(200, 200);
				
				
				Consumer<Integer> c= Arithmetic::display;
				c.accept(500);
				
	}

}
