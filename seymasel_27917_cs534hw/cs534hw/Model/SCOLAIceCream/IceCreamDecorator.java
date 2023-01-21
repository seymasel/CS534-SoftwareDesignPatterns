package SCOLAIceCream;

public class IceCreamDecorator implements IceCream {
	protected IceCream icecream;
	
	public IceCreamDecorator(IceCream icecream){
		this.icecream=icecream;
	}
	
    @Override
    public String getDescription() {
        return icecream.getDescription();
    }
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.icecream.getPrice();
	}		
}
