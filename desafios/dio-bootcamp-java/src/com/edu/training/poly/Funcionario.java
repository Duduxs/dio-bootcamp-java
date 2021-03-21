package com.edu.training.poly;

public class Funcionario extends Pessoa {

	protected final float salario;
	
	public Funcionario() {
		this.salario = 0.0F;
	}
	
	public Funcionario(String nome, Data nascimento, float salario) {
		super(nome, nascimento);
		this.salario = salario;
	}
	
	@Override
	public void imprimeDados() {
		System.out.printf("Nome: %s, Salário: %.2f, Nascimento: %s%n", nome, salario, nascimento.formatarData());
	}
	
	public float calculaImposto() {
		return salario * (float)0.97;
	}

	
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(salario);
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
		Funcionario other = (Funcionario) obj;
		if (Float.floatToIntBits(salario) != Float.floatToIntBits(other.salario))
			return false;
		return true;
	}	

}
