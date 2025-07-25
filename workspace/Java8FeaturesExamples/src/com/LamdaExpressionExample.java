package com;
interface A {
	void display();
}
class B implements A {
	@Override
	public void display() {
		System.out.println("providing the body for display method using class style");
	}
}
public class LamdaExpressionExample {
	public static void main(String[] args) {
	// 1st way 
	A obj1 = new B();		// run time polymorphism 
	obj1.display();
	// 2nd way : providing body using anonymous class 
	A obj2 = new A() {
		@Override
		public void display() {
		System.out.println("providing the body for display method using anonymous class style first time ");
		}
	};
	obj2.display();
	
	A obj3 = new A() {
		@Override
		public void display() {
			System.out.println("providing the body for display method using anonymous class style second time");
		}
	};
	obj3.display();
	// 3rd way providing body using anonymous method ie lambda expression
	A obj4 = ()->System.out.println("Providing body for display method using lambda style");
	obj4.display();
	}

}
