package Group_assignment_1;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	Pizza pizza;

	public Dough createDough() {
		return new ThinCrustDough(pizza);
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce(pizza);
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese(pizza);
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(pizza), new Onion(pizza), new Mushroom(pizza), new RedPepper(pizza) };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni(pizza);
	}

	public Clams createClam() {
		return new FreshClams(pizza);
	}
}
