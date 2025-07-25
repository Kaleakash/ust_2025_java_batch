package com;

@FunctionalInterface
interface Test {
	void dis1();		// by default abstract and public 
	default void dis2() {
		System.out.println("dis2 default method");
	}
	default void dis3() {
		System.out.println("dis3 default method");
	}
	static void dis4() {
		System.out.println("dis4 static method");
	}
	//void dis5();
}
class TestImp implements Test{
	public void dis1() {
		System.out.println("abstract method provided body in TestImp");
	}
	@Override
	public void dis2() {
		System.out.println("dis2 default method override in TestImp");
	}
}
public class DefaultAndStaticInterfaceExample {

	public static void main(String[] args) {
	TestImp tt1 = new TestImp();
	tt1.dis1();
	tt1.dis2();
	tt1.dis3();
	Test.dis4();  // static method 
	}

}
