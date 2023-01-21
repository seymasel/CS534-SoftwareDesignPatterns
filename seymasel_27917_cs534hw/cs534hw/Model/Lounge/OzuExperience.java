package Lounge;

public class OzuExperience extends LoungeDecorator {
	
    public OzuExperience(Lounge tempLounge) {
        super(tempLounge);
        System.out.println("Ozu Experience - extra cost is: $50.00");
    }

	@Override
	public String getDescription() {
		return super.getDescription()+ ", ozu experience";
	}

	@Override
	public double getPrice() {
		return super.getPrice()+ 50.0;
	}
}
