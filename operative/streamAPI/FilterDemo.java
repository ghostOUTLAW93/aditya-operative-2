package com.operative.streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<>();
		 al.add(12);
		 al.add(54);
		 al.add(65);
		 
		 System.out.println(al.stream().filter(e -> e%2 == 0).collect(Collectors.toList()));
	}
}
