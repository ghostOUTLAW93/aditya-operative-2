package com.operative.intro;

interface Drawable{
	int draw(int a, int b);
	default void add() {}
}

public class Demo1 {

	public static void main(String[] args) {
		Drawable d = (a,b) -> {return (a+b);};
		int add= d.draw(5,6);
		System.out.println(add);
	}
}
