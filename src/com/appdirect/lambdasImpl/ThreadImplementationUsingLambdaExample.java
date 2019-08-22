package com.appdirect.lambdasImpl;

public class ThreadImplementationUsingLambdaExample {

	public static void main(String[] args) {
		
		Thread threadOne = new Thread(()->{
			
			for(int i=0; i<5; i++) {
				System.out.println("I'm a Thread One :)");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					
				}
			}
		});

		Thread threadTwo = new Thread(()->{
			for(int i=0; i<5; i++)
				System.out.println("I'm a Thread Two :)");
		});

		threadOne.start();
		
		try {
			threadOne.join();// Thread will wait until thread one completes its execution 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		threadTwo.start();
		
	}
}