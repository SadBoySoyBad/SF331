package Group_assignment_1;

public class MozzarellaCheese extends Cheese {
	public MozzarellaCheese(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "MozzarellaCheese \n";
	}

	public String toString() {
		return "Shredded Mozzarella";
	}

	public double cost(){
		return decoratePizza.cost() + 20.25;
	}
}
