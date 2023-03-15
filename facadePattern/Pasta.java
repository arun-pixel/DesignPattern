package facadePattern;

public class Pasta implements Food{
	
	private String preparedItem;

	public void prepareFood(String itemsRequired) {
		preparedItem = "Pasta  with ingredients - "+itemsRequired;

	}

	public String deliverFood() {
		return preparedItem;
	}

}
