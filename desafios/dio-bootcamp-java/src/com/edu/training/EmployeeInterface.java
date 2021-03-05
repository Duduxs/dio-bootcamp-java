package com.edu.training;

public interface EmployeeInterface {

	//As interfaces por padrão já são Públicas e abstratas
	//Métodos private e static tem que ter implementação (PRECISAM) SÃO CHAMADOS DE MÉTODOS DEFAULT, ENTÃO AO USAR ELES (PRIVATE, STATIC) POR TBM A KEYWORD DEFAULT 
	//Não aceitamos métodos protected
	
	  public abstract void writeCode();
	  default Double saySalary(Double salary) {
		  System.out.println("I will tell my salary to you boy...");
		  System.out.println("So, listen carefully...");
		  System.out.println("My salary is");
		  return salary;
	  }
}
