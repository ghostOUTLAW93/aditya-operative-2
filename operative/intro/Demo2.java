package com.operative.intro;

interface Doable{
	default void doIt() {
		System.out.println("do it now");
	}
}

interface Sayable extends Doable {
	void say(String msg);
}
public class Demo2 implements Sayable {

	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.say("Hello there");
		obj.doIt();
	}

}
