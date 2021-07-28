package com.streams.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamExample1 {
	
	public static void main(String args[]) {
		List<Product1> list = new ArrayList<Product1>();
		list.add(new Product1(1, "HP", 25000f));
		list.add(new Product1(2, "Lenovo", 30000f));
		list.add(new Product1(3, "Dell", 40000f));
		list.add(new Product1(1, "Sony", 28000f));
		list.add(new Product1(2, "Apple", 60000f));
		list.add(new Product1(3, "Asus", 28000f));
		
		Set<Product1> s = new HashSet<Product1>();
		s.addAll(list);
		
		List<Float> list1 = new ArrayList<Float>();
		float sum=0;
		for(Product1 p: list)
		{
			sum= sum+p.price;
			//filter the data of list
			if(p.price<30000)
			{
				
			   list1.add(p.price);//collect all price<30000	
			}
		}
		
		//print
		System.out.println(list1);
		
		System.out.println("-----------------");
		
		List<Float> prodList=list.stream()
				.filter((Product1 p1) -> p1.price<30000) //Filter the data
				.map(p1->p1.price) //fetch the price
				.collect(Collectors.toList()); //collect the list
		System.out.println(prodList);
		
		
		
		
		list.stream().filter( product -> (product.price<30000) ).forEach(product -> {System.out.println(product.price);});
		
		System.out.println("+++++++++++++++++++");
		System.out.println("Sum Value: "+sum);
		
		
		// Summarize or Accumulate the data
		Float total=list.stream().map((Product1 k) -> k.price).reduce(0.0f, (sum1, price)-> sum1+price);
		System.out.println(total);
		
		Float total1= list.stream().map(p2->p2.price).reduce(0.0f, Float::sum);
		System.out.println(total1);
		
		
		double total2=list.stream().collect(Collectors.summingDouble(p->p.price));
		System.out.println(total2);
		
		//count()
		list.stream().count();
		list.stream().filter(p->p.price<30000).count();
		
		
		//list to set
		Map<Integer,String> map=list.stream().collect(Collectors.toMap(p->p.id, p->p.name));
	}

}
