package Group_assignment_1;

public class RedPepper extends Veggies {
	public RedPepper(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "RedPepper \n";
	}

	public String toString() {
		return "Red Pepper";
	}

	public double cost(){
		return decoratePizza.cost() + 15.0;
	}
}
