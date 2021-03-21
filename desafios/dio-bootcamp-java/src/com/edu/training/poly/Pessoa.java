package com.edu.training.poly;

public abstract class Pessoa {

	protected final String nome;
	protected final Data nascimento;
	
	private final CadastroPessoas cp;
	
	public Pessoa() {
		this.nome = null;
		this.nascimento = null;
		this.cp = null;
	}
	
	public Pessoa(Pessoa pessoa) {
		this(pessoa.nome, pessoa.nascimento);
	}
	
	public Pessoa(String nome, Data nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.cp = new CadastroPessoas();
	}

	public String getNome() {
		return nome;
	}

	public Data getNascimento() {
		return nascimento;
	}
	
	public CadastroPessoas getCp() {
		return this.cp;
	}
		
	public abstract void imprimeDados();
	

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
