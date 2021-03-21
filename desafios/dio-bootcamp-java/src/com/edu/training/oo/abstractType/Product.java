package com.edu.training.oo.abstractType;

public abstract class Product {

	protected String name;
	
	public abstract void serve();

	public Product() { }
	
	public Product(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
	
	
}
