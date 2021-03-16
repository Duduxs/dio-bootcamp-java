package duke.choice;


public class Customer {

	private String name;
	private String size = "S";

	private Clothing items[] = new Clothing[4];

	public Customer() {

	}

	public Customer(String name, int measurement) {
		this.name = name;
		this.setSize(measurement);
	}
	


	public void addItems(Clothing[] item) {
		this.items = item;
	}

	public Clothing[] getItems() {
		return items;
	}

	public int getTotalAvaregeClothingCost() {
		var total = 0;
		int average = 0;

		for (Clothing item : items) {
			if (item != null && item.getSize().equals("L"))
				total += item.getPrice();
		}
		try {
			if (this.getItems().length > 0 && total > 0) average =  total/this.getItems().length;
	
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause());
			System.out.println(e.getSuppressed());
			System.out.println(e.getStackTrace());
		}
		return average;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setSize(int size) {
		switch (size) {
		case 1:
		case 2:
		case 3:
			this.size = "S";
			break;
		case 4:
		case 5:
		case 6:
			this.size = "M";
			break;
		case 7:
		case 8:
		case 9:
			this.size = "L";
			break;
		default:
			this.size = "X";
		}
	}

}
