package com.edu.challenges.basic;

import java.util.Scanner;

public class BankNoteCount {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int value = keyboard.nextInt();

		keyboard.close();

		Integer[] notes = { 100, 50, 20, 10, 5, 2, 1 };
		int[] quantity = new int[7];
		
		System.out.println(value);

		for (int i = 0; i < notes.length; i++) {

			while (notes[i] <= value && value - notes[i] >= 0) {
				value -= notes[i];
				quantity[i] += 1;
			}
			System.out.printf("%d nota(s) de %d,00\n", quantity[i], notes[i]);
		}
	}
}

/**
Desafio
 
Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o 
valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. 
Na sequência mostre o valor lido e a relação de notas necessárias.

Entrada

Você receberá um valor inteiro N (0 < N < 1000000).

Saída

Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. 
Após cada linha deve ser imprimido o fim de linha. 
*/
