package org.comit.course._02_operators;

public class _05_unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b = a++;// post increment
		
		System.out.println("Post Increment");
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		a =5;
		b = ++a;// pre increment
		
		System.out.println("Pre Increment");
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
	}

}
