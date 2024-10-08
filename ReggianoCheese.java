package Group_assignment_1;

public class ReggianoCheese extends Cheese {
	public ReggianoCheese(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "ReggianoCheese \n";
	}

	public String toString() {
		return "Reggiano Cheese";
	}

	public double cost(){
		return decoratePizza.cost() + 20.5;
	}
}
