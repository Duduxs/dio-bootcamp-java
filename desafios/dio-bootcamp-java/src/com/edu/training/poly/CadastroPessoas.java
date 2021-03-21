package com.edu.training.poly;

import java.util.Arrays;

public class CadastroPessoas {

	private static int qtdAtual;
	private final Pessoa[] pessoas;
	
	{ qtdAtual = 0; }
	
	public CadastroPessoas() {
		pessoas = new Pessoa[100];
	}
	
	public void cadastraPessoa(Pessoa pessoa) {
		if(qtdAtual >= 100) { System.out.println("Limite máximo de pessoas para cadastro atingido!"); return; }
		pessoas[qtdAtual] = pessoa;
		qtdAtual++;
	}
	
	public void imprimeCadastro() {
		Arrays.stream(pessoas).filter(x -> x != null).forEach(Pessoa::imprimeDados);
	}
	
	public int getQtdAtual() {
		return qtdAtual;
	}
}
