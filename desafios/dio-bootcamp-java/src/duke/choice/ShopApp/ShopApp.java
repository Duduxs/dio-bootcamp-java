package duke.choice.ShopApp;

import java.util.Arrays;

import duke.choice.Clothing;
import duke.choice.Customer;

//Oracle activity 2
public class ShopApp extends Clothing {

	public static void main(String[] args) {
		double tax = 0.2;
		
	
		System.out.println("Welcome to Duke Choice Shop!");
		
		Customer c1 = new Customer();
		c1.name = "Pinky";
		c1.size = "S";
		System.out.println(c1.name + " " +  c1.size );
	
		
		int measurement = 4;

		
		switch(measurement) {
		case 1: case 2: case 3:
			c1.size = "S";
			break;
		case 4: case 5: case 6:
			c1.size = "M";
			break;
		case 7: case 8: case 9:
			c1.size = "L";
			break;
		default:
			c1.size = "X";
		}
		System.out.println(c1.size);

		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();


		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";
		
		item2.description = "Orange T-Shirt";
		item2.price = 10.5;
		item2.size = "S";
		
		Clothing items[] = {item1,item2};
		Arrays.stream(items).map(Clothing::getPrice).forEach(System.out::println);
		
		
		System.out.println("Item 1, Descrição: "  + item1.description + " Preço: " + item1.price + " Tamanho: " + item1.size );
		System.out.println("Item 2, Descrição: "  + item2.description + " Preço: " + item2.price + " Tamanho: " + item2.size );
		
		double total = ( item1.price + ( item2.price * 2)) * (1 + tax );
		//total = (item1.price + item2.price) * 1.2;
		
		System.out.printf("Payment Value:  %.2f\n" , total );
		

	}
}
