package com.edu.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

	public static void main(String[] args) {

		Pessoa[] pessoas = {new Pessoa("Arthur", 19), new Pessoa("Maria", 22), new Pessoa("Eduardo", 20)};
	
		Arrays.stream(pessoas).filter(p -> p.getIdade() >= 20).map(Pessoa::getNome).forEach(System.out::println);
	
		Arrays.stream(pessoas).map(Pessoa::getIdade).map(i -> i * 2).forEach(System.out::println);
		
		String[] nomes = {"Oi", "Joselph", "Jonathan", "Oi", "Mariela 13"};
		
		String printNome = Stream.of(nomes).filter(x -> x.equals("Oi")).collect(Collectors.joining());
	
		System.out.println(printNome);
	}
}

class Pessoa {

	private String nome;
	private Integer idade;

	public Pessoa() {

	}

	public Pessoa(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
