package com.edu.challenges.basic;

import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner keyboard = new Scanner(System.in);
		
		Optional<Double> value = Optional.empty();
		int qtd = 0;
		
		for(int i = 0 ; i < 6 ; i++) {
			value = Optional.ofNullable(keyboard.nextDouble());
			if(value.get() > 0) qtd++; 
		}
		
		keyboard.close();
		System.out.printf("%d valores positivos", qtd);
	}
}

/**
Desafio

Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada, 
devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada

Você receberá seis valores, negativos e/ou positivos.

Saída

Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída.
Não esqueça da mensagem "valores positivos" ao final.
*/
