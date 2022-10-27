package com.operative.streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("adi");
		al.add("shahi");
		
	//System.out.println(al.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()));
	//al.stream().forEach(x -> System.out.println(x.toUpperCase()));
		
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(12);
		a2.add(25);
		a2.add(65);
		
		int total = a2.stream().reduce(10,(n1,n2) -> (n1+n2));
		System.out.println(total);
	}
}
