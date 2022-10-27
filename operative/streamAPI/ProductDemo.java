package com.operative.streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
}

public class ProductDemo {

	public static void main(String[] args) {
		
		ArrayList<Product> al = new ArrayList<>();
		
		al.add(new Product("iPad",75000));
		al.add(new Product("android",25000));
		al.add(new Product("iphone",50000));
		
		//Product p = al.stream().max((p1,p2) -> p1.price>p2.price? 1:-1).get();
		//likewise for finding the minimum of the price
		
		
		System.out.println(al.stream().filter(s -> (s.price>30000)).map(p -> p.price)
		.reduce(0, (a,b) -> a+b));
	}
}
