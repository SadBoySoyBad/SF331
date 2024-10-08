package Group_assignment_1;

public abstract class Pepperoni extends PizzaDecorator {
	public Pepperoni(Pizza pizza){
		super(pizza);
	}
	public abstract String toString();
	public abstract double cost();
	public abstract String getDescribe();
}
