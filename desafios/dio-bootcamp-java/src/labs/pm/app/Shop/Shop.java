package labs.pm.app.Shop;

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
		  Product p1 = new Product(1, "Tea", BigDecimal.valueOf(1.99));
		  System.out.println(p1);
	}
}
