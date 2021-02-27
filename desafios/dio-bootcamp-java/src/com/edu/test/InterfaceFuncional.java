package com.edu.test;

public class InterfaceFuncional {

	public static void main(String[] args) {
		calculo multiplicar = (a,b) -> a * b;
		calculo somar = (a,b) -> a + b;
		calculo subtrair = (a,b) -> a - b;
		calculo dividir = (a,b) -> a / b;
		
		System.out.println(multiplicar.calcular(2, 3));
		System.out.println(somar.calcular(2, 3));
		System.out.println(subtrair.calcular(9, 9));
		System.out.println(dividir.calcular(6, 3));
	}
}

interface calculo {
	public int calcular(int a, int b);
}
