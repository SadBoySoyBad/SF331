package Group_assignment_1;

public class ThickCrustDough extends Dough {
	public ThickCrustDough(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "ThickCrustDough \n";
	}

	public String toString() {
		return "ThickCrust style extra thick crust dough";
	}

	public double cost(){
		return decoratePizza.cost() + 20.0;
	}
}
