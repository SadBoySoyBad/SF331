package Group_assignment_1;

public class ThinCrustDough extends Dough {
	public ThinCrustDough(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "ThinCrustDough \n";
	}
	
	public String toString() {
		return "Thin Crust Dough";
	}

	public double cost(){
		return decoratePizza.cost() + 25.0;
	}
}
