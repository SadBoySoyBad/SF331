package Group_assignment_1;

public class Spinach extends Veggies {
	public Spinach (Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "Spinach \n";
	}

	public String toString() {
		return "Spinach";
	}

	public double cost(){
		return decoratePizza.cost() + 10.0;
	}
}
