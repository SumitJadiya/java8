package com.appdirect.lambdasImpl;

 @FunctionalInterface
interface Interf{
	
	// Single Abstract Method
	public void display();

	// Multiple Default 
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
}

/*
class ConcreteClass implements Interf{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Through Concrete class");
	}

	public void local() {
		// TODO Auto-generated method stub
		System.out.println("local method");
	}
	
}
*/

public class ZeroParameterLambdaExample {

	public static void main(String[] args) {
		
		Interf interf = ()->System.out.println("Zero Parameter Lambda"); 
		interf.display();

//		Interf concreteClass = new ConcreteClass();
//		concreteClass.local();
//		concreteClass.display();

	}
	
}
