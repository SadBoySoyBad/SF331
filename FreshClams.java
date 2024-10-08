package Group_assignment_1;

public class FreshClams extends Clams {
	public FreshClams(Pizza pizza){
		super(pizza);
	}
	
	public String getDescribe(){
		return decoratePizza.getDescribe() + "FreshClams \n";
	}

	public String toString() {
		return "Fresh Clams from Long Island Sound";
	}

	public double cost(){
		return decoratePizza.cost() + 1500.50;
	}
}
