package Group_assignment_1;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		Pizza pizza = nyStore.orderPizza("cheese");
		pizza = new ReggianoCheese(pizza);
		pizza = new MarinaraSauce(pizza);
		pizza = new ThinCrustDough(pizza);
		System.out.println("Ethan ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");
 
		pizza = chicagoStore.orderPizza("cheese");
		pizza = new ThickCrustDough(pizza);
		pizza = new PlumTomatoSauce(pizza);
		pizza = new MozzarellaCheese(pizza);
		System.out.println("Joel ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");

		pizza = nyStore.orderPizza("clam");
		pizza = new ThinCrustDough(pizza);
		pizza = new MarinaraSauce(pizza);
		pizza = new ReggianoCheese(pizza);
		pizza = new SlicedPepperoni(pizza);
		pizza = new FreshClams(pizza);
		System.out.println("Ethan ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");
 
		pizza = chicagoStore.orderPizza("clam");
		pizza = new PlumTomatoSauce(pizza);
		pizza = new MozzarellaCheese(pizza);
		pizza = new FrozenClams(pizza);
		pizza = new ThickCrustDough(pizza);
		System.out.println("Joel ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");

		pizza = nyStore.orderPizza("pepperoni");
		pizza = new ThinCrustDough(pizza);
		pizza = new MarinaraSauce(pizza);
		pizza = new ReggianoCheese(pizza);
		pizza = new Garlic(pizza);
		pizza = new Onion(pizza);
		pizza = new Mushroom(pizza);
		pizza = new RedPepper(pizza);
		pizza = new SlicedPepperoni(pizza);
		System.out.println("Ethan ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		pizza = new ThickCrustDough(pizza);
		pizza = new PlumTomatoSauce(pizza);
		pizza = new MozzarellaCheese(pizza);
		pizza = new BlackOlives(pizza);
		pizza = new Spinach(pizza);
		pizza = new Eggplant(pizza);
		pizza = new SlicedPepperoni(pizza);
		System.out.println("Joel ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");

		pizza = nyStore.orderPizza("veggie");
		pizza = new ThinCrustDough(pizza);
		pizza = new MarinaraSauce(pizza);
		pizza = new ReggianoCheese(pizza);
		pizza = new Garlic(pizza);
		pizza = new Onion(pizza);
		pizza = new Mushroom(pizza);
		pizza = new RedPepper(pizza);
		System.out.println("Ethan ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		pizza = new ThickCrustDough(pizza);
		pizza = new PlumTomatoSauce(pizza);
		pizza = new MozzarellaCheese(pizza);
		pizza = new BlackOlives(pizza);
		pizza = new Spinach(pizza);
		pizza = new Eggplant(pizza);
		System.out.println("Joel ordered a " + pizza.getDescribe() + "-----Total price is " + pizza.cost() + " baht.-----\n");

	}
}