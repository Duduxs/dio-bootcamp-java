package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Food extends Product {

	private final LocalDate bestBefore;

	Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		super(id, name, price, rating);
		this.bestBefore = bestBefore;
	}

	@Override
	public LocalDate getBestBefore() {
		return bestBefore;
	}

	@Override
	public BigDecimal getDiscount() {
		if (bestBefore.isEqual(LocalDate.now()))
			return super.getDiscount();
		return BigDecimal.ZERO;
	}

	@Override
	public Product applyRating(Rating rating) {
		return new Food(this.getId(), this.getName(), this.getPrice(), rating, this.getBestBefore());
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
