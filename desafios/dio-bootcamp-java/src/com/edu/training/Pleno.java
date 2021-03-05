package com.edu.training;

public class Pleno extends Employee {
	
	public Pleno(String name, Integer age, Double salary) {
		super(name, age, salary);
	}
	
	@Override
	public String toString() {
		return "Pleno Employee [name=" + this.getName() + ", age=" + this.getAge()+ ", salary=" + this.getSalary()+ "]";
	}
	
	@Override
	public void writeCode() {
		this.run();	
	}

	@Override
	public void run() {
		System.out.println("\nPleno is Writing the code...");
		try {
			Thread.sleep(5000);
			System.out.println("Done!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}