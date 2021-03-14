package duke.choice;

import java.lang.Math;
import static java.lang.Math.round;

public class Clothing implements Comparable<Clothing> {

	static {
		Math.round(5);
		Long e = round(3.0);
		int x = 0;
		x+=50;
		MIN_PRICE = (double) x;	
	}
	
	
	private String description = "I'm a non static variable";
	private Double price;
	private String size;

	public static final Double TAX = 1.2;
	public static final Double MIN_PRICE;
	

	public Clothing() {

	}
	
	public Clothing(String description, Double price, String size) {
		this.description = description;
		this.price = price;
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price *= TAX;
	}

	public void setPrice(Double price) {
		this.price = price < MIN_PRICE ? MIN_PRICE : price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %.2f, %s", description, price, size);
	}

	
	@Override
	public int compareTo(Clothing c) {
		return this.price.compareTo(c.getPrice());
	}

}
