package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalTime;

public final class Drink extends Product {

	
	 Drink(int id, String name, BigDecimal price, Rating rating) {
		super(id, name, price, rating);	
	}
	
	@Override
	public Product applyRating(Rating rating) {
		return new Drink(this.getId(), this.getName(), this.getPrice(), rating);
	}
	
	@Override
	public BigDecimal getDiscount() {
		LocalTime now = LocalTime.now();
		if(now.isAfter(LocalTime.of(16, 30)) && now.isBefore(LocalTime.of(17, 30))) return super.getDiscount();
		return BigDecimal.ZERO;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
