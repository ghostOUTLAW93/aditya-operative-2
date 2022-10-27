package com.operative.threading;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Mythread mt = new Mythread(); 
		mt.start(mt, Thread.currentThread());
//		mt.setPriority(7);
		
		
		//mt.run(100);
		for(int i = 0; i < 10; i ++)
			System.out.println("ram thread");
		mt.sleep(10000);
//	System.out.println(mt.getPriority()); ;
		
	}
}
