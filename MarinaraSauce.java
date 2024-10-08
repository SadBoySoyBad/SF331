package Group_assignment_1;

public class MarinaraSauce extends Sauce {
	MarinaraSauce(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "MarinaraSauce \n";
	}

	public String toString() {
		return "Marinara Sauce";
	}

	public double cost(){
		return decoratePizza.cost() + 10;
	}
}
