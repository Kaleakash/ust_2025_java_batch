package com;

import java.util.function.Function;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		return "You pass the number as "+t;
	}
}
public class PredefinedFunctionInterfaceExample {

	public static void main(String[] args) {
	Function<Integer,String> f1 = new MyFunction();
	System.out.println(f1.apply(10));
	// we can achieve with lambda 
	
	Function<Integer, String> f2 = (v)->"Welcome lamda for funtion interface "+v;
	System.out.println(f2.apply(20));
	}

}
