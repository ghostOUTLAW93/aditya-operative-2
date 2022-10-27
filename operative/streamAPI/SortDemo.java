package com.operative.streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortDemo {

	public static void main(String[] args) {
		
	
	ArrayList<Integer> al = new ArrayList<>();
	al.add(12);
	al.add(2);
	al.add(85);
	al.add(65);
	
	
	System.out.println(al.stream().filter(s -> s%2 == 0).reduce(0, (a,b) -> a+b));
}
}
