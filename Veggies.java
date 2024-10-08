package Group_assignment_1;

public abstract class Veggies extends PizzaDecorator {
	public Veggies(Pizza pizza){
		super(pizza);
	}
	public abstract String toString();
	public abstract double cost();
	public abstract String getDescribe();
}
