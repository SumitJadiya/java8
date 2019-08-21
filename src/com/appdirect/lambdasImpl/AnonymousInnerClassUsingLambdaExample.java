package com.appdirect.lambdasImpl;

import com.appdirect.lambdas.AnonymousInnerClassUsingLambdaExampleInterf;

public class AnonymousInnerClassUsingLambdaExample {

	int x = 800;

	/* Anonymous Inner Class */

	public static void main(String[] args) {
		AnonymousInnerClassUsingLambdaExampleInterf anonymousInnerClassWithLambdaExampleInterf = () -> {
			int x = 900;
			System.out.println(x);
		};
		anonymousInnerClassWithLambdaExampleInterf.m1();
	}

}