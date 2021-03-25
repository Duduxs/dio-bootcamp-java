package labs.pm.data;

import static java.math.RoundingMode.HALF_UP;
import static labs.pm.data.Rating.*;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 
 * {@code Product} é a classe que representa um produto qualquer dentro do
 * sistema. <br>
 * Cada instância da mesma conterá os atributos id, name & price. <br>
 * Cada produto pode ter um desconto com o calculo baseado no
 * {@link DISCOUNT_RATE discount rate}
 * 
 * @author Eduardo José
 * @version 1.0
 * @see "My Github /Duduxs"
 *
 */
public abstract class Product {

	private final int id;

	private final String name;
	private final BigDecimal price;
	private final Rating rating;

	public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.9);

	 Product() {
		this(0, "", BigDecimal.ZERO);
	}

	Product(int id , String name, BigDecimal price) {
		this(id, name, price, NOT_RATED);
	}

	Product(int id, String name, BigDecimal price, Rating rating) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
		
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public Rating getRating() {
		return rating;
	}
	
	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
	}
	
	public abstract Product applyRating(Rating rating);
	
	public LocalDate getBestBefore() {
		return LocalDate.now();
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", price=" + price + ", discount=" + getDiscount() + ", rating="
				+ rating.getStars() + ", bestBefore=" + this.getBestBefore();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

}
