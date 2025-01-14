package com.winter.app.thread;

public class ThreadMain {

	public static void main(String[] args) {
		
		StudyThread1 s1 = new StudyThread1();
		StudyThread2 s2 = new StudyThread2();
		
		Thread thread = new Thread(s2);
		
		
	
		//OS한테 실행 부탁
		
		thread.start();
		s1.start();
		
		
		
		
	}
}
