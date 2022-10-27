package com.operative.streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortNameSalary {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee("john",10000));
		al.add(new Employee("undertaker",30000));
		al.add(new Employee("alpha",20000));
		al.add(new Employee("zenna",15000));
		al.add(new Employee("rookie",1000));
		
		ArrayList<String> nameAL = new ArrayList<>();
		ArrayList<Integer> salaryAL = new ArrayList<>();
		
		for (int i = 0; i < al.size(); i++) {
			nameAL.add(al.get(i).getName());
			salaryAL.add(al.get(i).getSalary());
		}
		
		System.out.println(nameAL.stream().sorted().collect(Collectors.toList()));
		System.out.println(salaryAL.stream().sorted().collect(Collectors.toList()));
		
	}
}
