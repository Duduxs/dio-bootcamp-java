package com.edu.training;

public class Junior extends Employee {
	
	public Junior(String name, Integer age, Double salary) {
		super(name, age, salary);
	}
	
	@Override
	public String toString() {
		return "Junior Employee [name=" + this.getName() + ", age=" + this.getAge()+ ", salary=" + this.getSalary()+ "]";
	}

	@Override
	public void writeCode() {
		this.run();
	}

	@Override
	public void run() {
		System.out.println("\nJunior is Writing the code...");
		try {
			Thread.sleep(7000);
			System.out.println("Done!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}