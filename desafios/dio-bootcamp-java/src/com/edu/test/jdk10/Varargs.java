package com.edu.test.jdk10;

import java.util.Arrays;

public class Varargs {

	public static void main(String[] args) {
		printarQuantosValoresQuiser("printa esse", "esse aqui tbm", "por ultimo esse", "pronto");
		printarQuantosValoresQuiser("");
		printarQuantosValoresQuiser("um", "dois");
		printarQuantosValoresQuiser("Só essse agora");
	}
	
	public static void printarQuantosValoresQuiser(String... valores) {
		System.out.println("==========================================");
		Arrays.stream(valores).filter(s -> !(s.isBlank() && s.isEmpty())).forEach(System.out::println);
		
	}
}
