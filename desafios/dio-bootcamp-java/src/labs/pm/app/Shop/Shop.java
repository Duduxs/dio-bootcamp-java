package labs.pm.app.Shop;

import static labs.pm.data.Rating.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

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
		

		  Product p1 = ProductManager.createProduct(101, "Tea", BigDecimal.valueOf(1.99), THREE_STAR);
		  Product p2 = ProductManager.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), FOUR_STAR);
		  Product p3 = ProductManager.createProduct(103, "Cake", BigDecimal.valueOf(3.99), FIVE_STAR, LocalDate.now().plusDays(2));
		  Product p4 = ProductManager.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), FIVE_STAR, LocalDate.now());
		  Product p5 = p4.applyRating(THREE_STAR);
		  Product p6 = ProductManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
		  Product p7 = ProductManager.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now());
		  Product p8 = p4.applyRating(FOUR_STAR);
		  Product p9 = p1.applyRating(TWO_STAR);
		  
	
		  LocalDate bestBefore = p3.getBestBefore();
		  System.out.println(p3.getBestBefore());
		  System.out.println(p1.getBestBefore());
		  

		  System.out.println(p1);
		  System.out.println(p2);
		  System.out.println(p3);
		  System.out.println(p4);
		  System.out.println(p5);
		  System.out.println(p6);
		  System.out.println(p7);
		  System.out.println(p8);
		  System.out.println(p9);
	}
}
