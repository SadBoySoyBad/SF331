package Group_assignment_1;

public abstract class Dough extends PizzaDecorator {
	public Dough(Pizza pizza){
		super(pizza);
	}
	public abstract String toString();
	public abstract double cost();
	public abstract String getDescribe();
}
