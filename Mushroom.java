package Group_assignment_1;
public class Mushroom extends Veggies {
	public Mushroom(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "Mushroom \n";
	}

	public String toString() {
		return "Mushrooms";
	}

	public double cost(){
		return decoratePizza.cost() + 15.0;
	}
}
