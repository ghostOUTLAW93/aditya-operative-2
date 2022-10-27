package com.operative.methodRefernce;

//interface Drawable{
//	void draw();
//	//void show1();
//}

public class DemoStatic {

	static void show() {
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		Drawable d = DemoStatic::show;
		d.draw();
	}
}
