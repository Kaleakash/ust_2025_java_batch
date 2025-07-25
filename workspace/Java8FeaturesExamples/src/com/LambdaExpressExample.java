package com;
@FunctionalInterface
interface Operation{
	public int add(int x, int y);
}
public class LambdaExpressExample {
	public static void main(String[] args) {
	// 1st way 
	Operation op1 = (x,y)->x+y;
	System.out.println(" "+op1.add(100, 200));
	// 2nd way 
	Operation op2 = (a,b)->a+b;
	System.out.println(" "+op2.add(10, 20));
	// 3rd way 
	Operation op3 = (int x, int y)->x+y;
	System.out.println(" "+op3.add(1, 2));
	//4th way 
	Operation op4 = (int x, int y)-> {
		int sum = x+y;
		return sum;
	};
	System.out.println(" "+op4.add(1000, 2000));
	}

}
