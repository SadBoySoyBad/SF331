package Group_assignment_1;

public class ParmesanCheese extends Cheese {
	public ParmesanCheese(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "ParmesanCheese \n";
	}

	public String toString() {
		return "Shredded Parmesan";
	}
	
	public double cost(){
		return decoratePizza.cost() + 5.0;
	}
}
