package FEASPizzeria;

public class Mozzarella extends PizzaDecorator {

    public Mozzarella(Pizza temporalPizza) {
        super(temporalPizza);
        System.out.println("Adding Mozzarella - extra cost is: $2.00");
    }

    @Override
    public String getDescription() {
        return temporalPizza.getDescription() + ", mozzarella";
    }

    @Override
    public double getPrice() {
        return temporalPizza.getPrice() + 2.00;
    }

}
