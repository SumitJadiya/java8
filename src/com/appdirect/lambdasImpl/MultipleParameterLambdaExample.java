package com.appdirect.lambdasImpl;

import com.appdirect.lambdas.MultipleParameterLambdaExampleInterf;

public class MultipleParameterLambdaExample {

	public static void main(String[] args) {
		MultipleParameterLambdaExampleInterf addition = (a,b)-> {return a+b;};
		System.out.println("Addition performed "+addition.perform((int)10.4, 20));
		
		System.out.println("------*********---------");
		MultipleParameterLambdaExampleInterf subtraction = (a,b)->a-b;
		System.out.println("Subtraction performed "+subtraction.perform(100, 20));
		
		System.out.println("------*********---------");
		MultipleParameterLambdaExampleInterf multiplication = (a,b)->a*b;
		System.out.println("Multiplication performed "+multiplication.perform(10, 20));
		
		System.out.println("------*********---------");
		MultipleParameterLambdaExampleInterf division = (a,b)->a/b;
		System.out.println("Division performed "+division.perform(100, 20));
		
	}
}
