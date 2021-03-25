package com.edu.training.poly;

public interface Test {

	 public static void printaAee() {
		 System.out.println("oi");
	 }
	 
	 private void printaAeePrivado() {
		 System.out.println("oi");
	 }
	 
	 default void testando() {
		 System.out.println("testando aqui");
	 }
}
