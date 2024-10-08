package Group_assignment_1;

public class FrozenClams extends Clams {
	public FrozenClams(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "FrozenClams \n";
	}

	public String toString() {
		return "Frozen Clams from Chesapeake Bay";
	}

	public double cost(){
		return decoratePizza.cost() + 300.25;
	}
}
