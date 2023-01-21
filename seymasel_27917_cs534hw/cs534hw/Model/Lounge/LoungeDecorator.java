package Lounge;

import SCOLAIceCream.IceCream;

public class LoungeDecorator implements Lounge {
	protected Lounge lounge;
	
	public LoungeDecorator(Lounge lounge){
		this.lounge=lounge;
	}
	
    @Override
    public String getDescription() {
        return lounge.getDescription();
    }
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.lounge.getPrice();
	}

}
