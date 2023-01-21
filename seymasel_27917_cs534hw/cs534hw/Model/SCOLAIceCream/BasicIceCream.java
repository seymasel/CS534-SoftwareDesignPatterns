package SCOLAIceCream;

public class BasicIceCream implements IceCream{

	public BasicIceCream() {
		//System.out.println("Basic Ice-Cream - cost is: $0.50");
	}
	
    @Override
    public String getDescription() {
        return "Basic Ice-Cream ";
    }
	
	@Override
	public double getPrice() {
		return 0.50;
	}
	

	
}
