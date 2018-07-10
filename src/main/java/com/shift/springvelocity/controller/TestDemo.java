package com.shift.springvelocity.controller;

import java.util.ArrayList;
import java.util.List;

class my {
	
	my(){
		System.out.println("Constructor my ");
	}
	void nn1(){
		System.out.println("Parent Method");
	}
	public static void main(String args[]) {
		System.out.println("Parent Main");
	}
}

class he extends my {
	he(){
		System.out.println("Constructor he ");
	}
	void nn2(){
		System.out.println("Child Method");
		ArrayList<Integer> l = new ArrayList<Integer>();
	}
	public static void main(String args[]) {
		System.out.println("Child Main");
	}
}

class TestDemo{
	
//	static{
//		System.out.println("Static Block");
//	}
	public static void main(String... args){
		
		my m= new he();
		he h = new he();
		m.nn1();
		
		m.main(new String[] {"",""});
		
		final byte a=10;
		final byte b=11;
		byte aa = a+b;
		System.out.println("aa "+aa);
		
		Math.sqrt(2);
		
		byte any = 127;
		if(any<0.7){
			System.out.println("YES");
		}else{
			System.out.println("No");
		}
		
		List l = new ArrayList();
		String p = (String) l.get(0);
		
	}
}
