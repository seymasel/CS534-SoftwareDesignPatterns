package OzuAirlines;

import EFCoffee.Coffee;
import FEASPizzeria.Pizza;
import Lounge.Lounge;
import SCOLAIceCream.IceCream;



public class Bill implements Pizza,Coffee,IceCream, Lounge{
	
	Lounge lounge;
	Pizza pizza;
	IceCream icecream;
	Coffee coffee;
	
	public Bill(Lounge lounge,Pizza pizza, IceCream icecream,Coffee coffee){
		this.coffee= coffee;
		this.icecream =icecream;
		this.pizza=pizza;
		this.lounge =lounge;
	}


	@Override
	public String getDescription() {

		return "bill total: ";
	}

	@Override
	public double getPrice() {
		
		return lounge.getPrice()+pizza.getPrice()+icecream.getPrice()+coffee.getPrice();
	}
	

}
