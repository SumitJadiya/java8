package com.appdirect.lambdasImpl;


//class OurOwnConrete implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//
//		for(int i=0; i<5; i++) {
//			System.out.println("I'm a Thread One :)");
//			try {
//				Thread.sleep(1000);
//			}
//			catch (Exception e) {
//				
//			}
//		}
//	}
//	
//	
//}
//

public class ThreadImplementationUsingLambdaExample {

	public static void main(String[] args) {
		
		Runnable threadOne = new Thread( ()->{
			
			for(int i=0; i<5; i++) {
				System.out.println("I'm a Thread One :)");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					
				}
			}
		});

		Runnable threadTwo = new Thread(()->{
			for(int i=0; i<5; i++)
				System.out.println("I'm a Thread Two :)");
		});

		threadOne.run();
		
		try {
			//threadOne.join();// Thread will wait until thread one completes its execution 
		} catch (Exception e) {
			e.printStackTrace();
		}

		threadTwo.run();
		
	}
}