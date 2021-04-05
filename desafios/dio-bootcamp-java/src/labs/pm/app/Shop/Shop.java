package labs.pm.app.Shop;

import static labs.pm.data.Rating.FIVE_STAR;
import static labs.pm.data.Rating.FOUR_STAR;
import static labs.pm.data.Rating.NOT_RATED;
import static labs.pm.data.Rating.THREE_STAR;
import static labs.pm.data.Rating.TWO_STAR;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import labs.pm.data.ProductManager;

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

//		pm.printProductReport(101);
		pm.reviewProduct(101, FOUR_STAR, "Very cool!");
		pm.reviewProduct(101, TWO_STAR, "Very cool!");
		pm.reviewProduct(101, FOUR_STAR, "Very cool!");
		pm.reviewProduct(101, FOUR_STAR, "Very cool!");
		pm.reviewProduct(101, FIVE_STAR, "Very cool!");
		pm.reviewProduct(101, THREE_STAR, "Very cool!");
//		pm.printProductReport(101);

		pm.changeLocale("pt-BR");

		pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.50), FOUR_STAR);

//		pm.printProductReport(102);
		pm.reviewProduct(102, FOUR_STAR, "yes!");
		pm.reviewProduct(102, TWO_STAR, "lol");
		pm.reviewProduct(102, FOUR_STAR, "cool");
		pm.reviewProduct(102, FOUR_STAR, "muchas gracias");
		pm.reviewProduct(102, FIVE_STAR, "bom d++++!");
		pm.reviewProduct(102, THREE_STAR, "arigato");
		pm.printProductReport(102);

		System.out.println(Stream.of("OI", "EI", "AU").collect(Collectors.joining(", ")));
//		
//	Stream.of("ON1E", "TWOeae", "BEATSEEA", "E").parallel().mapToInt(s -> s.length()).forEach((i) -> System.out.println(i));
//		System.out.println();
//		Stream.of("ON1E", "TWOeae", "BEATSEEA", "E").mapToInt(s -> s.length()).forEach((i) -> System.out.println(i));

		pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + "\t" + discount));
		
		pm.printProducts(p1 -> p1.getPrice().floatValue() > 2.30,
				(p1, p2) -> p1.getRating().ordinal() - p2.getRating().ordinal());
	}
}
