package Lounge;

public class ExtraLeg extends LoungeDecorator {

    public ExtraLeg(Lounge tempLounge) {
        super(tempLounge);
        System.out.println("Extra Leg - extra cost is: $40.00");
    }

	@Override
	public String getDescription() {
		return super.getDescription()+ ", with extra leg total cost";
	}

	@Override
	public double getPrice() {
		return super.getPrice()+ 40.0;
	}
}
