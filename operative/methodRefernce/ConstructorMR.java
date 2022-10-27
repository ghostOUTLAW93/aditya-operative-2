package com.operative.methodRefernce;

interface Drawable1{
	ConstructorMR draw(String data);
}

public class ConstructorMR {

	ConstructorMR(String msg){
		System.out.println("welcome");
	}
	
	public static void main(String[] args) {
		Drawable1 d = ConstructorMR::new;
		d.draw("hello");
	}
}
