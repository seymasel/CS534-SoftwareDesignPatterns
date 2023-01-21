package SCOLAIceCream;

public class StrawberryIceCream extends IceCreamDecorator{

	public StrawberryIceCream(IceCream icecream) {
		super(icecream);
		System.out.println("Adding Strawberry - extra cost is: $1.50");
	}
	
    @Override
    public String getDescription() {
        return icecream.getDescription() + ", strawberry";
    }

	@Override
	public double getPrice() {
		return 1.50 +  super.getPrice();
	}
	
	

}