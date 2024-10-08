package Group_assignment_1;

public abstract class PizzaDecorator extends Pizza {
    protected Pizza decoratePizza;
    public PizzaDecorator(Pizza pizza){
        this.decoratePizza = pizza;
    }

    public String getDescribe(){
        return decoratePizza.getDescribe();
    }

    public double cost(){
        return decoratePizza.cost();
    }

    void prepare(){
        decoratePizza.prepare();
    }

}
