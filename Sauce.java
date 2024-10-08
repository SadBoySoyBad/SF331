package Group_assignment_1;

public abstract class Sauce extends PizzaDecorator {
	Sauce(Pizza pizza){
		super(pizza);
	}
	public abstract String toString();
	public abstract double cost();
	public abstract String getDescribe();
}
