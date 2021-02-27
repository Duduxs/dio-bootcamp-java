package com.edu.test;

public class Recursividade {

	public static void main(String[] args) {
		System.out.println("e");
		printarAteDez(0);
	}
	
	public static void printarAteDez(int i) {
		System.out.println(i);		
		if(i < 10) { i++; printarAteDez(i); }

		
	}
}


