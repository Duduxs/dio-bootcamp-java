package labs.pm.app.Shop;

import static labs.pm.data.Rating.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

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
		
		  ProductManager pm = new ProductManager(Locale.getDefault());
		  
		  Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);
		  pm.printProductReport();
		  p1 = pm.reviewProduct(p1, FOUR_STAR, "Very cool!");
		  p1 = pm.reviewProduct(p1, TWO_STAR, "Very cool!");
		  p1 = pm.reviewProduct(p1, FOUR_STAR, "Very cool!");
		  p1 = pm.reviewProduct(p1, FOUR_STAR, "Very cool!");
		  p1 = pm.reviewProduct(p1, FIVE_STAR, "Very cool!");
		  p1 = pm.reviewProduct(p1, THREE_STAR, "Very cool!");
		  pm.printProductReport();
//		  Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), FOUR_STAR);
//		  Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(3.99), FIVE_STAR, LocalDate.now().plusDays(2));
//		  Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(3.99), FIVE_STAR, LocalDate.now());
//		  Product p5 = p4.applyRating(THREE_STAR);
//		  Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//		  Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now());
//		  Product p8 = p4.applyRating(FOUR_STAR);
//		  Product p9 = p1.applyRating(TWO_STAR);
		  
	
	
//		  
//		  System.out.println(p1);
//		  System.out.println(p2);
//		  System.out.println(p3);
//		  System.out.println(p4);
//		  System.out.println(p5);
//		  System.out.println(p6);
//		  System.out.println(p7);
//		  System.out.println(p8);
//		  System.out.println(p9);
	}
}
