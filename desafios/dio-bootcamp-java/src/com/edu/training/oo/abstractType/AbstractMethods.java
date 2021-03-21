package com.edu.training.oo.abstractType;

import java.math.BigDecimal;

public class AbstractMethods {

	public static void main(String[] args) {
		Product p = new Drink("Suquinho de laranja", BigDecimal.TEN);

		System.out.println(p.getName());
		
		doAnything(new Drink());
	}
	
	private static void doAnything(Product p) {
		p.serve();
	}
}
