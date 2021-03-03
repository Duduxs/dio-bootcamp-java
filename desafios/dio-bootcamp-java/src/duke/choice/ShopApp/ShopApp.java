package duke.choice.ShopApp;

import duke.choice.Clothing;
import duke.choice.Customer;

//Oracle activity 2
public class ShopApp extends Clothing {

	public static void main(String[] args) {
	
		System.out.println("Welcome to Duke Choice Shop!");
		Customer c1 = new Customer("Pinky", 3);
		
		Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "L");
		Clothing item3 = new Clothing("Green Scarf", 5.0, "L");
		Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
		
		Clothing items[] = { item1, item2, item3, item4 };
		c1.addItems(items);
				
		System.out.println("\nMin price of all clothings: " + Clothing.MIN_PRICE + "\nTax of all clothings: " + Clothing.TAX + "\n");
		
		System.out.printf("Customer: %s, his/her size: %s", c1.getName(), c1.getSize());
		System.out.println("\n");
		int i = 0;
		for (Clothing item : c1.getItems()) {
		
			i += 1;
			System.out.printf("Item: %d, description: %s, price: %.2f, size: %s%n", i, item.getDescription(), item.getPrice(),
					item.getSize());

		}
		
		System.out.println(String.format("\n%d", c1.getTotalAvaregeClothingCost()));

	}
}
