package com;

interface Hello {
	public String sayHello(String name);
}
// providing body for method with static 
class HelloImp {
	public static String sayHello(String name) {
		return "Welcome user in method reference style "+name;
	}
}
public class MethodReferenceExample {

	public static void main(String[] args) {
	// providing body for this interface using labmda style 
	Hello h1 = (name)->"Welcome user lambda style"+name;
	System.out.println(h1.sayHello("Raj"));
	
	Hello h2 = (name)->"Welcome "+name;
	System.out.println(h2.sayHello("Raj"));
	System.out.println("static method reference");
	
	Hello h3 = HelloImp::sayHello;
	System.out.println(h3.sayHello("Raj"));
	
	Hello h4 = HelloImp::sayHello;
	System.out.println(h4.sayHello("Raj"));
	}

}
