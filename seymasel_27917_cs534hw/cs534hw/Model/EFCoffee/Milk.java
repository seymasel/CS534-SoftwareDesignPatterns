package EFCoffee;

public class Milk extends CoffeeDecorator{

	public Milk(Coffee tempCoffee) {
		super(tempCoffee);
		System.out.println("Adding Milk - extra cost is: $1.0");
	}	
	
    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", milk";
    }
	
	@Override
	 public double getPrice() {
		return 1.0 + super.getPrice();
	}	
}

