package com.operative.streamAPI;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("adi",10000);
		Employee e2 = new Employee("shahi",20000);
		

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(new Employee("jophn",23000));
		
		int total = al.stream().collect(Collectors.summingInt(s -> s.getSalary()));
		System.out.println(total);
	}

}
