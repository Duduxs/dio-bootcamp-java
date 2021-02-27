package com.edu.challenges.basic;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AverageCarConsumption {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner keyboard = new Scanner(System.in);
		
		int distance = keyboard.nextInt();
		double fuel = keyboard.nextDouble();
		
		keyboard.close();
				
		System.out.printf("%.3f km/l", distance / fuel);
		
	}
}

/**
Desafio

Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) 
e o total de combustível consumido (em litros).

Entrada

Você receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y 
que representa o total de combustível consumido, com um dígito após o ponto decimal.

Saída

Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a 
mensagem "km/l".
*/