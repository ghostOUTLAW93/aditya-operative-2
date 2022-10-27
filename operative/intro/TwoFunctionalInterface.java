package com.operative.intro;

interface T1{
	default void show() {
		System.out.println("default 1");
	}
}

interface T2{
	default void show() {
		System.out.println("default 2");
	}
}

public class TwoFunctionalInterface implements T1, T2 {
	
	public static void main(String[] args) {
		
		TwoFunctionalInterface obj = new TwoFunctionalInterface();
		obj.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		T1.super.show();
		T2.super.show();
	}

}
