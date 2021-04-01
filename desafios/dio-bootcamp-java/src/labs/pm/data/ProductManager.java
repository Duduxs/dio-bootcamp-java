package labs.pm.data;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;

public class ProductManager {

	private Locale locale;
	private ResourceBundle resource;
	private DateTimeFormatter dateFormat;
	private NumberFormat moneyFormat;

	private Map<Product, List<Review>> products = new HashMap<>();

	public ProductManager(Locale locale) {
		this.locale = locale;
		this.resource = ResourceBundle.getBundle("labs.pm.resources.products.strings_en", locale);
		this.dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
		this.moneyFormat = NumberFormat.getCurrencyInstance(locale);
	}

	public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		Product product = new Food(id, name, price, rating, bestBefore);
		products.putIfAbsent(product, new ArrayList<>());
		return product;

	}

	public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
		Product product = new Drink(id, name, price, rating);
		products.putIfAbsent(product, new ArrayList<>());
		return product;
	}
	
	public Product reviewProduct(int id, Rating rating, String comments) {
		Product product = findProductById(id);
		
		if(product == null) return null;
		
		return reviewProduct(product, rating, comments);
	}

	public Product reviewProduct(Product product, Rating rating, String comments) {
				
		List<Review> reviews = products.get(product);
		reviews.add(new Review(rating, comments));
		
		products.remove(product, reviews);
		
		Optional<Integer> sum = reviews.stream().map(Review::getRating).map(Rating::ordinal).reduce(Integer::sum);

		product = product.applyRating(Math.round((float) sum.orElse(1) / reviews.size()));
		products.put(product, reviews);
		
		return product;
	}
	
	
	public Product findProductById(int id) {
		return products.keySet().stream().filter(p -> p.getId() == id).findAny().orElse(null);
	}
	
	public void printProductReport(int id) {
		Product product = findProductById(id);
		if(product != null) 
			printProductReport(product.getId());
	}

	public void printProductReport(Product product) {
		StringBuilder txt = new StringBuilder();

		List<Review> reviews = products.get(product);
		
		txt.append(
				MessageFormat.format(
						resource.getString("product"), 
						product.getName(),
						moneyFormat.format(product.getPrice()), 
						product.getRating().getStars(),
						dateFormat.format(product.getBestBefore())))
						.append("\n");

		Collections.sort(reviews);
		reviews.forEach(r -> {
			txt.append(MessageFormat.format(resource.getString("review"), r.getRating().getStars(),r.getComments())).append("\n");
		});
		
			
		if (reviews.isEmpty()) txt.append(resource.getString("no.reviews"));
		
		
		System.out.println(txt);

	}
}
