package com.edu.training.poly;

public class Gerente extends Funcionario {

	private final String area;
	
	public Gerente() {
		this.area = null;
	}
	
	public Gerente(String nome, Data nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}
	
	@Override
	public void imprimeDados() {
		System.out.printf("Nome: %s, Salário: %.2f, Nascimento: %s, Area: %s%n", nome, salario, nascimento.formatarData(), area);
	}
	
	@Override
	public float calculaImposto() {
		return salario * 95/100;
	}

	@Override
	public String toString() {
		return "Gerente [area=" + area + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
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
		Gerente other = (Gerente) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		return true;
	}
	
	
	
}
