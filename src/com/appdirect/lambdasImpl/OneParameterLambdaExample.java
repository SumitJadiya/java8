package com.appdirect.lambdasImpl;

@FunctionalInterface
interface OneParameterLambdaInterface{
	
	public void displayValue(int x);
	
	default void normalDefaultMethod() {
		System.out.println("That's why default methods were introduced from java 8");
	}
}

public class OneParameterLambdaExample {

	public static void main(String[] args) {
		OneParameterLambdaInterface oneParameterLambdaInterface = (x)->System.out.println("The value is " + x);
		oneParameterLambdaInterface.displayValue(10);
		oneParameterLambdaInterface.normalDefaultMethod();
	}
}
