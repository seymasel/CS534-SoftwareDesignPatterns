package FEASPizzeria;


public class PizzaDecorator implements Pizza {

    protected Pizza temporalPizza;

    public PizzaDecorator(Pizza temporalPizza) {
        this.temporalPizza = temporalPizza;
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice();
    }

}
