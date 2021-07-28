package com.streams.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product1> list = new ArrayList<Product1>();
		list.add(new Product1(1, "HP", 25000f));
		list.add(new Product1(2, "Lenovo", 30000f));
		list.add(new Product1(3, "Dell", 40000f));
		list.add(new Product1(1, "Sony", 28000f));
		list.add(new Product1(2, "Apple", 60000f));
		list.add(new Product1(3, "Asus", 28000f));
		
		list.stream()
		.filter(p-> p.price>30000)  // filtering price --> intermediate stream result
		.map(pm->pm.price)  //fetch price
		.collect(Collectors.toList())
		
	}

}
