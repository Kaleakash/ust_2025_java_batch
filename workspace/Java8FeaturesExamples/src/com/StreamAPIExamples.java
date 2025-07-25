package com;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIExamples {

	public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);
	list1.add(6);list1.add(7);list1.add(8);list1.add(9);list1.add(10);
	System.out.println(list1);
	System.out.println("for each loop or enhanced loop");
	for(int n:list1) {
		System.out.println(n);
	}
	System.out.println("retreive element from collection using function interface");
	
	list1.forEach((v)->System.out.println("Value is "+v));
	// display only even number 
	System.out.println("All even numbers");
	list1.stream().filter(e->e%2==0).forEach(v->System.out.println("Even number "+v));
	System.out.println("Odd even numbers");
	list1.stream().filter(e->e%2!=0).forEach(v->System.out.println("Odd number "+v));
	System.out.println("Modified for each number");
	list1.stream().map(m->m+100).forEach(v->System.out.println("modified number "+v));
	System.out.println("Map and filter both");
	list1.stream().map(m->m+100).filter(v->v%5==0).forEach(v->System.out.println("modified number "+v));
	}

}
