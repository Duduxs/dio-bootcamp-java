package com.edu.training.imutability;


public class PassByValue {

	public static void changeIt(Object object, int x, String o) {
//		object = new Customer("Blue", 4);
		x = 500;
		o = "Ui";
		o.substring(1);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Duke Choice Shop!");
//		Customer c1 = new Customer("Pinky", 3);
		String o = "Oi, blz?!";
		String a = new String("Oi, blz?!");
		int x = 1;
		
//		changeIt(c1, x, o);
//		System.out.println(c1.getName());
		System.out.println(x);
		System.out.println(o == a);
	}
}
