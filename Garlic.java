package Group_assignment_1;
public class Garlic extends Veggies {
	public Garlic(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "Garlic \n";
	}

	public String toString() {
		return "Garlic";
	}

	public double cost(){
		return decoratePizza.cost() + 16.5;
	}
}
