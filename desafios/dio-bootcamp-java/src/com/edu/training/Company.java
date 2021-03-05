package com.edu.training;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private List<Employee> employees = new ArrayList<>();
	
	private String name;
	
	public Company() {
		
	}
	
	public Company(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
