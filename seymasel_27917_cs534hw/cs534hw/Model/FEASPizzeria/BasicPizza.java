package FEASPizzeria;

public class BasicPizza implements Pizza {

    public BasicPizza() {
        //System.out.println("Basic Pizza - cost is: $4.00");
    }

    @Override
    public String getDescription() {
        return "Basic Pizza ";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
