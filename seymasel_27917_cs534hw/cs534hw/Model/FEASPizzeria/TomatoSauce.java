package FEASPizzeria;

public class TomatoSauce  extends PizzaDecorator {

    public TomatoSauce(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding Tomato Sauce - extra cost is: $2.50");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", tomato sauce";
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice() + 1.00;
    }

}
