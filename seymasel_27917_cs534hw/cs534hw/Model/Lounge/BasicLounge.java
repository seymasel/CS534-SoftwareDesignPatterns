package Lounge;

public class BasicLounge implements Lounge {
	
	public BasicLounge() {
		//System.out.println("Basic Lounge - cost is: $40.00");
	}

	@Override
	public String getDescription() {
		return "Basic Lounge ";
	}

	@Override
	public double getPrice() {
		return 40.0;
	}

}
