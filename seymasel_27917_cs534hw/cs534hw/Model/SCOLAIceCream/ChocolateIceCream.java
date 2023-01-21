package SCOLAIceCream;

public class ChocolateIceCream extends IceCreamDecorator{

	public ChocolateIceCream(IceCream icecream) {
		super(icecream);
		System.out.println("Adding Chocolate - extra cost is: $1.0");
	}	
	
    @Override
    public String getDescription() {
        return icecream.getDescription() + ", chocolate";
    }
	
	@Override
	 public double getPrice() {
		return 1.5 + super.getPrice();
	}
	
}
