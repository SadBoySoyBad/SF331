package Group_assignment_1;

public class Eggplant extends Veggies {
	public Eggplant(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "Eggplant \n";
	}

	public String toString() {
		return "Eggplant";
	}

	public double cost(){
		return decoratePizza.cost() + 5.5;
	}
}
