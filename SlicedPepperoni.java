package Group_assignment_1;

public class SlicedPepperoni extends Pepperoni {
	public SlicedPepperoni(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "SlicedPepperoni \n";
	}

	public String toString() {
		return "Sliced Pepperoni";
	}
	
	public double cost(){
		return decoratePizza.cost() + 7.5;
	}
}
