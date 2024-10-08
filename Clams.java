package Group_assignment_1;

public abstract class Clams extends PizzaDecorator {
	public Clams (Pizza pizza){
		super(pizza);
	}
	public abstract String toString();
	public abstract double cost();
	public abstract String getDescribe();
}
