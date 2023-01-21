package EFCoffee;


public class CoffeeDecorator implements Coffee{
    protected Coffee tempCoffee;

    public CoffeeDecorator(Coffee tempCoffee) {
        this.tempCoffee = tempCoffee;
    }

    @Override
    public String getDescription() {
        return tempCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return tempCoffee.getPrice();
    }

}
