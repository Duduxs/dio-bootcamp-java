package com.edu.training.poly;

public class Cliente extends Pessoa {

	private final int codigo;
	
	public Cliente() {
		codigo = 0;
	}

	public Cliente(String nome, Data nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	@Override
	public void imprimeDados() {
		System.out.printf("Nome: %s, Nascimento: %s, Código: %d, %n", nome, nascimento.formatarData(), codigo);
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	
	
	
	
}
