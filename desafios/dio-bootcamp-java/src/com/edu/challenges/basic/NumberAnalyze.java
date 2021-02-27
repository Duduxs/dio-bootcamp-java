package com.edu.challenges.basic;

import java.io.IOException;
import java.util.Scanner;

public class NumberAnalyze {

	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		int value = 0, odd = 0, pair = 0, positive = 0, negative = 0;

		for (int i = 0; i < 5; i++) {
			value = keyboard.nextInt();
			
			if(value > 0) positive++;
			else if(value < 0) negative++;
			
			if(value % 2 == 0 ) pair++;
			else odd++;
		}
		keyboard.close();
		System.out.printf("%d valor(es) par(es)%n%d valor(es) impar(es)%n%d valor(es) positivo(s)%n%d valor(es) negativo(s)", pair, odd, positive, negative);

	}
}

/**
Desafio

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, 
quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados 
são negativos.

Entrada

Você receberá 5 valores inteiros.

Saída

Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final 
de linha após cada uma.
*/