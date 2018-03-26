package com.aamer.java8;

import java.util.Arrays;

public class Java8Lambda {

	public static void main(String[] args) {
		MyName lambdaVariable = a -> System.out.println(a.length());
		lambdaVariable.printName("1");
		
	}
	
	//functional Interface
	@FunctionalInterface
	interface MyName {
		public void printName(String s);
	}

}
