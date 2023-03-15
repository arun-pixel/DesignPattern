package facadePattern;

public class WaiterFacade {
	
	public static String deliverFood(String foodType) {
		
		Ingredient ingredient = new Ingredient();

		
		switch(foodType) {
		case "pizza":
			Food pizza = new Pizza();
			String pizzaItems = ingredient.getPizzaItems();
			pizza.prepareFood(pizzaItems);
			return pizza.deliverFood();
		case "pasta":
			Food pasta = new Pasta();
			String pastaItems = ingredient.getPastaItems();
			pasta.prepareFood(pastaItems);
			return pasta.deliverFood();
		}
		return null;		
	}

}
