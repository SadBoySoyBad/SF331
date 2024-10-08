package Group_assignment_1;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory 
{
	Pizza pizza;


	public Dough createDough() {
		return new ThickCrustDough(pizza);
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce(pizza);
	}

	public Cheese createCheese() {
		return new MozzarellaCheese(pizza);
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(pizza), 
		                      new Spinach(pizza), 
		                      new Eggplant(pizza) };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni(pizza);
	}

	public Clams createClam() {
		return new FrozenClams(pizza);
	}
}
