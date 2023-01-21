package Main;

import EFCoffee.BasicCoffee;
import EFCoffee.Coffee;
import EFCoffee.Cream;
import EFCoffee.Milk;
import FEASPizzeria.BasicPizza;
import FEASPizzeria.Mozzarella;
import FEASPizzeria.Pizza;
import FEASPizzeria.TomatoSauce;
import Lounge.BasicLounge;
import Lounge.Lounge;
import Lounge.OzuExperience;
import OzuAirlines.Bill;
import SCOLAIceCream.BasicIceCream;
import SCOLAIceCream.ChocolateIceCream;
import SCOLAIceCream.IceCream;
import SCOLAIceCream.StrawberryIceCream;
import SCOLAIceCream.VanillaIceCream;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("---------------WELCOME OZU AIRLINES---------------");
		System.out.println("");
		IceCream basic = new BasicIceCream();
		IceCream vanilla = new VanillaIceCream(basic);
		IceCream strawberry = new StrawberryIceCream(vanilla);
		IceCream cho = new ChocolateIceCream(strawberry);
        	System.out.println("Ingredients: " + cho.getDescription());
        	System.out.println("Total Price: " + cho.getPrice());

		System.out.println("------------------------------------------");
        	Pizza pizza = new Mozzarella(new TomatoSauce(new BasicPizza()));
        	System.out.println("Ingredients: " + pizza.getDescription());
        	System.out.println("Total Price: " + pizza.getPrice());
        
		System.out.println("------------------------------------------");
        	Coffee cof = new Cream(new Milk(new BasicCoffee()));
        	System.out.println("Ingredients: " + cof.getDescription());
        	System.out.println("Total Price: " + cof.getPrice());
        
		System.out.println("------------------------------------------");
        	Lounge lon = new OzuExperience(new BasicLounge());
        	System.out.println("Ingredients: " + lon.getDescription());
        	System.out.println("Total Price: " + lon.getPrice());
        
        	//double p =pizza.getPrice();
        	//double ic =cho.getPrice();
        	//double c = cof.getPrice();
        	//double l = lon.getPrice();
        	//double total = ic+p+c+l;
        	//System.out.println("Total bill: " + total);
		
        	Bill b = new Bill(lon,pizza,cho,cof);
        	System.out.println("------------------------------------------");
        	System.out.println("Good flights, Total bill: " + b.getPrice());
   	
	}
}
