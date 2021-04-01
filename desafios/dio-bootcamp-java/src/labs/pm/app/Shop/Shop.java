package labs.pm.app.Shop;

import static labs.pm.data.Rating.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import labs.pm.data.Drink;
import labs.pm.data.Food;
import labs.pm.data.Product;
import labs.pm.data.ProductManager;
import labs.pm.data.Rating;

/**
 * 
 * {@code Shop} serve como inicializadora do código com o método main. Ela irá
 * receber variáveis do tipo Product e performar ações com a mesma.
 * 
 * @author Eduardo José
 * @version 1.0
 * @see github/Duduxs
 *
 */
public class Shop {

	public static void main(String... args) {

		ProductManager pm = new ProductManager(Locale.getDefault());

		pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), NOT_RATED);

		pm.printProductReport(101);
		pm.reviewProduct(101, FOUR_STAR, "Very cool!");
		pm.reviewProduct(101, TWO_STAR, "Very cool!");
		pm.reviewProduct(101, FOUR_STAR, "Very cool!");
		pm.reviewProduct(101, FOUR_STAR, "Very cool!");
		pm.reviewProduct(101, FIVE_STAR, "Very cool!");
		pm.reviewProduct(101, THREE_STAR, "Very cool!");
		pm.printProductReport(101);

		pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.50), FOUR_STAR);

		pm.printProductReport(102);
		pm.reviewProduct(102, FOUR_STAR, "yes!");
		pm.reviewProduct(102, TWO_STAR, "lol");
		pm.reviewProduct(102, FOUR_STAR, "cool");
		pm.reviewProduct(102, FOUR_STAR, "muchas gracias");
		pm.reviewProduct(102, FIVE_STAR, "bom d++++!");
		pm.reviewProduct(102, THREE_STAR, "arigato");
		pm.printProductReport(102);

	}
}
