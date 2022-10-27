package com.operative.threading;

public class Mythread extends Thread {

	Thread t;
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i ++)
		System.out.println("sita child");
	}
	//public void run() {
//		for(int i = 0; i < 10; i ++)
//		System.out.println(i);
	//} 
	
	public void start(Thread mt, Thread curr) {
		mt.start();
		t = curr;
//		for(int i = 0; i < 10 ; i ++)
//			System.out.println("start");
	}
}
