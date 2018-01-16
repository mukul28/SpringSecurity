package com.shift.springvelocity.controller;

import java.util.ArrayList;

class first {
	first(){
		System.out.println("Constructor my ");
	}
	void nn1(){
		System.out.println("In Parent Method");
	}
	public static void main(String args[]) {
		System.out.println("AA");
	}
}

class second extends first {
	second(){
		System.out.println("Constructor he ");
	}
	void nn2(){
		System.out.println("In Child Method");
		ArrayList<Integer> l = new ArrayList<Integer>();
	}
	public static void main(String args[]) {
		System.out.println("BB");
	}
}

class TestDemo2{
	
//	static{
//		System.out.println("Static Block");
//	}
	public static void main(String... args) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		Object m= Class.forName("my").newInstance();
		he h = new he();
		((my) m).nn1();
		
		((my) m).main(new String[] {"",""});
	}
}