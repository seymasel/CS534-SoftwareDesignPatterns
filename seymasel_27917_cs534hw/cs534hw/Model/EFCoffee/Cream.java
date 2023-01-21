package EFCoffee;

public class Cream extends CoffeeDecorator {

	public Cream(Coffee tempCoffee) {
		super(tempCoffee);
		System.out.println("Adding Cream - extra cost is: $1.5");
	}	
	
    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", cream";
    }
	
	@Override
	 public double getPrice() {
		return 1.5 + super.getPrice();
	}	
}

