package Group_assignment_1;

public class Onion extends Veggies {
	public Onion(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "Onion \n";
	}

	public String toString() {
		return "Onion";
	}

	public double cost(){
		return decoratePizza.cost() + 10.0;
	}
}
