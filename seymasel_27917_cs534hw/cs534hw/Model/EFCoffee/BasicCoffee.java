package EFCoffee;


public class BasicCoffee implements Coffee{
	
	public BasicCoffee() {
        //System.out.println("Basic Coffee - cost is: $2.00");
    }

    @Override
    public String getDescription() {
        return "Basic Coffee ";
    }

    @Override
    public double getPrice() {
        return 2.00;
    }

}
