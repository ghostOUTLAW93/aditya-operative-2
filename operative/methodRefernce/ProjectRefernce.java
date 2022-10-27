package com.operative.methodRefernce;

import java.util.ArrayList;

interface ProductFetch{
	void fetch(ArrayList<Product> p);
}

public class ProjectRefernce {

	public static void main(String[] args) {
		Product p1 = new Product("leche",22);
		Product p2 = new Product("agua",10);
		Product p3 = new Product("pan",20);
		Product p4 = new Product("bicicleta",15000);
		Product p5 = new Product("autobus",8000000);
		
		ArrayList<Product> al = new ArrayList<>();
		al.add(p5);
		al.add(p4);
		al.add(p3);
		al.add(p2);
		al.add(p1);
		
		
		ProductFetch pf = ProjectRefernce::proFetch;
		pf.fetch(al);
	}
	
	static void proFetch(ArrayList<Product> p) {
		for(Product p1: p) {
			System.out.println(p1.getName()+" "+p1.getPrice());
		}
	}
}
