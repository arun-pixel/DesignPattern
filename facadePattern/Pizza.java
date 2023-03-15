package facadePattern;

public class Pizza implements Food{
	
	private String preparedItem;

	public void prepareFood(String itemsRequired) {
		preparedItem = "Crust Pizza with ingredients - "+itemsRequired;
	}

	
	public String deliverFood() {
		return preparedItem;
	}

}
