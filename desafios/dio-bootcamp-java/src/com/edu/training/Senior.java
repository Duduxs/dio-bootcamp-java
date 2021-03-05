package com.edu.training;

public class Senior extends Employee {
	
	private Boolean isOrgulhoso;
	
	public Senior(String name, Integer age, Double salary) {
		super(name, age, salary);
	}
	
	public Senior(String name, Integer age, Double salary, Boolean isOrgulhoso) {
		super(name, age, salary);
		this.isOrgulhoso = isOrgulhoso;
	}
	
	public Boolean getIsOrgulhoso() {
		return isOrgulhoso;
	}

	public void setIsOrgulhoso(Boolean isOrgulhoso) {
		this.isOrgulhoso = isOrgulhoso;
	}

	@Override
	public String toString() {
		return "Senior Employee [name=" + this.getName() + ", age=" + this.getAge()+ ", salary=" + this.getSalary()+ ", isOrgulhoso=" + this.getIsOrgulhoso()+ "]";
	}


	@Override
	public void writeCode() {
		this.run();
	}

	@Override
	public void run() {
		System.out.println("\nSenior is Writing the code...");
		try {
			Thread.sleep(3000);
			System.out.println("Done!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}