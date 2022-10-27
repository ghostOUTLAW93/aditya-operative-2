package com.operative.methodRefernce;

interface Drawable{
	void draw();
}

public class DemoInstance {

	public static void main(String[] args) {
		
		DemoInstance d = new DemoInstance();
		Drawable obj = d::show;
		obj.draw();
		
	}
	
	void show() {
		System.out.println("hello");
	}
}
