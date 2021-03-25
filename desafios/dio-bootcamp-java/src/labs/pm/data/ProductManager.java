package labs.pm.data;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {
	
	public static Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		return new Food(id, name, price, rating, bestBefore);

	}
	
	public static Product createProduct(int id, String name, BigDecimal price, Rating rating) {
		return new Drink(id, name, price, rating);
	}
}
