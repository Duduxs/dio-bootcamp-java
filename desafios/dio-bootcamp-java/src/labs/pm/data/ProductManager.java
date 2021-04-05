package labs.pm.data;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductManager {

	private Map<Product, List<Review>> products = new HashMap<>();
	private ResourceFormatter formatter;
	private static Map<String, ResourceFormatter> formatters = Map.of("en-GB", new ResourceFormatter(Locale.UK),
			"en-US", new ResourceFormatter(Locale.US), "fr-FR", new ResourceFormatter(Locale.FRANCE), "ru-RU",
			new ResourceFormatter(new Locale("ru", "RU")), "zh-CN", new ResourceFormatter(Locale.CHINA), "pt-BR",
			new ResourceFormatter(Locale.getDefault()));

	public ProductManager(Locale locale) {
		this(locale.toLanguageTag());
	}

	public ProductManager(String languageTag) {
		changeLocale(languageTag);
	}

	public void changeLocale(String languageTag) {
		formatter = formatters.getOrDefault(languageTag, formatters.get("en-GB"));
	}

	public Set<String> getSupportedLocales() {
		return formatters.keySet();
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
		return reviewProduct(product, rating, comments);
	}

	public Product reviewProduct(Product product, Rating rating, String comments) {

		List<Review> reviews = products.get(product);
		products.remove(product, reviews);
		reviews.add(new Review(rating, comments));

		product = product.applyRating(Rateable.convert(
				(int) Math.round(reviews.stream().mapToInt(x -> x.getRating().ordinal()).average().orElse(0))));

		products.put(product, reviews);

		return product;
	}

	public Product findProductById(int id) {
		return products.keySet().stream().filter(p -> p.getId() == id).findAny().orElse(null);
	}

	public void printProductReport(int id) {
		Product product = findProductById(id);
		if (product != null)
			printProductReport(product);

	}

	public void printProductReport(Product product) {
		StringBuilder txt = new StringBuilder();

		List<Review> reviews = products.get(product);
		Collections.sort(reviews);

		txt.append(formatter.formatProduct(product)).append("\n");

		txt.append(reviews.stream().map(r -> formatter.formatReview(r) + "\n").collect(Collectors.joining()));

		if (reviews.isEmpty())
			txt.append(formatter.getText("no.reviews")).append("\n");

		System.out.println(txt);

	}

	public void printProducts(Predicate<Product> filter, Comparator<Product> sorter) {
		StringBuilder sb = new StringBuilder();
		products.keySet().stream().filter(filter).sorted(sorter)
				.forEach(p -> sb.append(formatter.formatProduct(p) + "\n"));
		System.out.println(sb);
	}

	public Map<String, String> getDiscounts() {
		return products.keySet().stream()
				.collect(Collectors.groupingBy(p -> p.getRating().getStars(),
						Collectors.collectingAndThen(
								Collectors.summingDouble(product -> product.getDiscount().doubleValue()),
								discount -> formatter.moneyFormat.format(discount))));
	}

	private static class ResourceFormatter {

		private Locale locale;
		private ResourceBundle resource;
		private DateTimeFormatter dateFormat;
		private NumberFormat moneyFormat;

		public ResourceFormatter(Locale locale) {
			this.locale = locale;
			this.resource = ResourceBundle.getBundle("labs.pm.resources.products.strings", locale);
			this.dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
			this.moneyFormat = NumberFormat.getCurrencyInstance(locale);
		}

		private String formatProduct(Product product) {
			return MessageFormat.format(resource.getString("product"), product.getName(),
					moneyFormat.format(product.getPrice()), product.getRating().getStars(),
					dateFormat.format(product.getBestBefore()));

		}

		private String formatReview(Review review) {
			return MessageFormat.format(resource.getString("review"), review.getRating().getStars(),
					review.getComments());
		}

		private String getText(String key) {
			return resource.getString(key);
		}
	}
}
