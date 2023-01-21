package EFCoffee;

public class Caramel extends CoffeeDecorator {

	public Caramel(Coffee tempCoffee) {
		super(tempCoffee);
		System.out.println("Adding Caramel - extra cost is: $1.0");
	}	
	
    @Override
    public String getDescription() {
        return tempCoffee.getDescription() + ", caramel";
    }
	
	@Override
	 public double getPrice() {
		return 1.0 + super.getPrice();
	}	
}
