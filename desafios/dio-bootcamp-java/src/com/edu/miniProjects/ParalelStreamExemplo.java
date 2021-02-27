package com.edu.miniProjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParalelStreamExemplo {

	
	public static void factorial(long num) {
		long fat = 1L;	
		for(int i = 2; i <= num ; i++) {fat *=i;}
	}

	public static void main(String[] args) {
		//SERIAL
		long inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).forEach(ParalelStreamExemplo::factorial);
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo de execução da thread: " + (fim-inicio));
		
		//PARALLEL STREAM
		inicio = System.currentTimeMillis();
		IntStream.range(1, 100000).parallel().forEach(ParalelStreamExemplo::factorial);
		 fim = System.currentTimeMillis();
		
		System.out.println("Tempo de execução da thread paralel: " + (fim-inicio) + "\n");
		
		//Vai imprimir de forma sempre aleatória
		List<String> nomes = Arrays.asList("Edward", "oi", "miau", "Joao");
		nomes.parallelStream().forEach(System.out::println);

	}


}
