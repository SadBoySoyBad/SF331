package Group_assignment_1;
public class PlumTomatoSauce extends Sauce {
	public PlumTomatoSauce(Pizza pizza){
		super(pizza);
	}

	public String getDescribe(){
		return decoratePizza.getDescribe() + "PlumTomatoSauce \n";
	}

	public String toString() {
		return "Tomato sauce with plum tomatoes";
	}

	public double cost(){
		return decoratePizza.cost() + 5.0;
	}
}
