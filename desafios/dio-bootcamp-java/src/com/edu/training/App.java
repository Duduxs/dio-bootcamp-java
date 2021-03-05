package com.edu.training;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Employee e1 = new Junior("Eduardo", 20, 2500.0);
		Employee e2 = new Pleno("Luan", 25, 4500.0);
		Employee e3 = new Senior("Clécius", 30, 10000.0, true);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println();
	
		Junior juniorCasted = (Junior) e1;
		System.out.println(juniorCasted.saySalary(juniorCasted.getSalary()));
		
//		juniorCasted.writeCode();
//		e2.writeCode();
//		e3.writeCode();
		
		Company c = new Company("E-Precise");
		
		c.getEmployees().addAll(Arrays.asList(e1,e2,e3));
		
		c.getEmployees().forEach(System.out::println);
		c.getEmployees().stream().map(Employee::getSalary).forEach(System.out::println);
		
	}
}
