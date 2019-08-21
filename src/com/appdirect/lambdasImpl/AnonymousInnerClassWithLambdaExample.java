package com.appdirect.lambdasImpl;

import com.appdirect.lambdas.AnonymousInnerClassWithLambdaExampleInterf;

public class AnonymousInnerClassWithLambdaExample {

	int x = 800;

	/* Anonymous Inner Class */
	
	public static void main(String[] args) {
		AnonymousInnerClassWithLambdaExampleInterf anonymousInnerClassWithLambdaExampleInterf = ()->{
			int x = 900;
			System.out.println(x);
		};
		anonymousInnerClassWithLambdaExampleInterf.m1();
	}

}