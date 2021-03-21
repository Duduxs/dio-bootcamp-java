package com.edu.training.poly;

public class TestaCadastro {

	public static void main(String[] args) {
		
		CadastroPessoas cp = new CadastroPessoas();
		
		Pessoa funcionario = new Funcionario("Eduardo", new Data(04,11,2000), 1800F);
		Pessoa cliente = new Cliente("Arthur", new Data(06,10,2015), 1);
		Funcionario gerente = new Gerente("Clécius Martinkoski", new Data(01, 01, 1950), 8500F, "CTO");

		if(funcionario instanceof Funcionario)
			System.out.println(((Funcionario) funcionario).calculaImposto());
		
		if(gerente instanceof Gerente)
			System.out.println(gerente.calculaImposto());
					
		cp.cadastraPessoa(gerente);
		cp.cadastraPessoa(funcionario);
		cp.cadastraPessoa(cliente);
		
		cp.imprimeCadastro();
		System.out.println(cp.getQtdAtual());
	}
}
