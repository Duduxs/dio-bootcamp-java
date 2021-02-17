package com.edu.basic;

import java.io.IOException;
import java.util.Scanner;

public class OddPair {

	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		int value = keyboard.nextInt();
		
		keyboard.close();
		
		for (int i = 1; i <= value; i++)
			if (i % 2 == 0) System.out.println(i);

	}
}

/**
Desafios

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada

Você receberá 1 valor inteiro N, onde N > 0.

Saída

Exiba todos os números pares até o valor de entrada, sendo um em cada linha.  
 
*/
