package duke.choice.ShopApp;

public enum SO {

	WINDOWS("Windows"), LINUX("Linux"), MAC("Porcaria");

	private String value;

	private SO(String value) {
		this.value = value;
	}
		
	public String getValue() {
		return value;
	}

}
