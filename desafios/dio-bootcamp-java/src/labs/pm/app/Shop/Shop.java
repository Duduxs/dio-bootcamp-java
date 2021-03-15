package labs.pm.app.Shop;

import static labs.pm.data.Rating.*;

import java.math.BigDecimal;

import labs.pm.data.Product;

/**
 * 
 * {@code Shop} serve como inicializadora do código com o método main.
 * Ela irá receber variáveis do tipo Product e performar ações com a mesma.
 * @author Eduardo José
 * @version 1.0
 * @see github/Duduxs
 *
 */
public class Shop {

	public static void main(String... args) {
		  Product p1 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
		  Product p2 = new Product(102, "Coffee", BigDecimal.valueOf(1.99), FOUR_STAR);
		  Product p3 = new Product(103, "Cake", BigDecimal.valueOf(3.99), FIVE_STAR);
		  Product p4 = new Product();
		  Product p5 = p3.applyRating(THREE_STAR);
		  
		  System.out.println(p1);
		  System.out.println(p2);
		  System.out.println(p3);
		  System.out.println(p4);
		  System.out.println(p5);
	}
}
