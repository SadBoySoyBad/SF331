package Group_assignment_1;

public class BlackOlives extends Veggies {
	public BlackOlives(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "BlackOlives \n";
	}

	public String toString() {
		return "Black Olives";
	}

	public double cost(){
		return decoratePizza.cost() + 10.0;
	}
}
