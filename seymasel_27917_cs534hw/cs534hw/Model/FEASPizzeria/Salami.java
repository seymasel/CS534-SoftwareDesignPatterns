package FEASPizzeria;

public class Salami  extends PizzaDecorator {

    public Salami(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding Tomato Sauce - extra cost is: $2.50");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", salami";
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice() + 2.50;
    }

}

