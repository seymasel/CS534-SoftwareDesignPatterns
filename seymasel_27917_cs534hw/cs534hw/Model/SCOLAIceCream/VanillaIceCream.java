package SCOLAIceCream;

public class VanillaIceCream extends IceCreamDecorator{

	public VanillaIceCream(IceCream icecream) {
		super(icecream);
        System.out.println("Adding Vanilla Ice-Cream - extra cost is: $1.0");		
	}
	
    @Override
    public String getDescription() {
        return icecream.getDescription() + ", vanilla";
    }

	@Override
	public double getPrice() {
		return 1.0 + super.getPrice();
	}
	
	
	
	

}