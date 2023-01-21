package Lounge;

public class EmergencyExit extends LoungeDecorator {

    public EmergencyExit(Lounge tempLounge) {
        super(tempLounge);
        System.out.println("Emergency Exit - extra cost is: $30.00");
    }

	@Override
	public String getDescription() {
		return super.getDescription()+ ", emergency exit";
	}

	@Override
	public double getPrice() {
		return super.getPrice()+ 30.0;
	}
}
