package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import EFCoffee.BasicCoffee;
import EFCoffee.Caramel;
import EFCoffee.Coffee;
import EFCoffee.Cream;
import EFCoffee.Milk;
import FEASPizzeria.BasicPizza;
import FEASPizzeria.Mozzarella;
import FEASPizzeria.Pizza;
import FEASPizzeria.Salami;
import FEASPizzeria.TomatoSauce;
import Lounge.BasicLounge;
import Lounge.EmergencyExit;
import Lounge.ExtraLeg;
import Lounge.Lounge;
import Lounge.OzuExperience;
import OzuAirlines.Bill;
import SCOLAIceCream.BasicIceCream;
import SCOLAIceCream.ChocolateIceCream;
import SCOLAIceCream.IceCream;
import SCOLAIceCream.StrawberryIceCream;
import SCOLAIceCream.VanillaIceCream;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class View implements ActionListener{

	private JFrame frame;
	private JTextField txtCoffee;
	private JTextField textPizza;
	private JTextField textIceCream;
	private JTextField textLounge;
	private JTextField textBill;
	private JTextField FINAL;
	List<Double> myDoubleList = new ArrayList<Double>();
	List<String> myStringList = new ArrayList<String>();
	Double arr[];

	



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 858, 649);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 436, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 106, 436, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 187, 436, 52);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 274, 673, 98);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 211, 436, 52);
		frame.getContentPane().add(lblNewLabel_4);
		
		txtCoffee = new JTextField();
		txtCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		txtCoffee.setText("Coffee");
		txtCoffee.setBounds(29, 15, 121, 37);
		frame.getContentPane().add(txtCoffee);
		txtCoffee.setColumns(10);
		
		textPizza = new JTextField();
		textPizza.setHorizontalAlignment(SwingConstants.CENTER);
		textPizza.setText("Pizza");
		textPizza.setColumns(10);
		textPizza.setBounds(29, 106, 121, 28);
		frame.getContentPane().add(textPizza);
		
		textIceCream = new JTextField();
		textIceCream.setHorizontalAlignment(SwingConstants.CENTER);
		textIceCream.setText("Ice Cream");
		textIceCream.setColumns(10);
		textIceCream.setBounds(29, 187, 121, 34);
		frame.getContentPane().add(textIceCream);
		
		textLounge = new JTextField();
		textLounge.setHorizontalAlignment(SwingConstants.CENTER);
		textLounge.setText("Lounge");
		textLounge.setColumns(10);
		textLounge.setBounds(25, 293, 125, 34);
		frame.getContentPane().add(textLounge);
		
		textBill = new JTextField();
		textBill.setHorizontalAlignment(SwingConstants.CENTER);
		textBill.setText("Total Cost");
		textBill.setColumns(10);
		textBill.setBounds(295, 470, 96, 20);
		frame.getContentPane().add(textBill);
		
		JButton btnMilk = new JButton("Milk: $1.00");
		btnMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coffee cof = new Milk(new BasicCoffee());
				String a = cof.getDescription();
				Double b = cof.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnMilk.setBounds(221, 15, 95, 24);
		frame.getContentPane().add(btnMilk);
		
		JButton btnCream = new JButton("Cream: 1.5$");
		btnCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coffee cof = new Cream(new BasicCoffee());
				String a = cof.getDescription();
				Double b = cof.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnCream.setBounds(326, 15, 105, 24);
		frame.getContentPane().add(btnCream);
		
		JButton btnCaramel = new JButton("Caramel: 1.0$");
		btnCaramel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Coffee cof = new Caramel(new BasicCoffee());
				String a = cof.getDescription();
				Double b = cof.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnCaramel.setBounds(446, 15, 127, 24);
		frame.getContentPane().add(btnCaramel);
		
		JButton btnVanilla = new JButton("Vanilla: : 1.00$");
		btnVanilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream ic = new VanillaIceCream(new BasicIceCream());
				String a = ic.getDescription();
				Double b = ic.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnVanilla.setBounds(190, 197, 126, 24);
		frame.getContentPane().add(btnVanilla);
		
		JButton btnStrawberry = new JButton("Strawberry: 1.5$");
		btnStrawberry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream ic = new StrawberryIceCream(new BasicIceCream());
				String a = ic.getDescription();
				Double b = ic.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				//////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnStrawberry.setBounds(326, 197, 156, 24);
		frame.getContentPane().add(btnStrawberry);
		
		JButton btnChocolate = new JButton("Chocolate: 1.5$");
		btnChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IceCream ic = new ChocolateIceCream(new BasicIceCream());
				String a = ic.getDescription();
				Double b = ic.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				//////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnChocolate.setBounds(496, 197, 131, 24);
		frame.getContentPane().add(btnChocolate);
		
		JButton btnSalami = new JButton("Salami: $2.50");
		btnSalami.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pizza p = new Salami(new BasicPizza());
				String a = p.getDescription();
				Double b = p.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				//////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnSalami.setBounds(190, 110, 121, 24);
		frame.getContentPane().add(btnSalami);
		
		JButton btnMozzaralle = new JButton("Mozzarella: $2.00");
		btnMozzaralle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pizza p = new Mozzarella(new BasicPizza());
				String a = p.getDescription();
				Double b = p.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				//////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnMozzaralle.setBounds(322, 110, 140, 24);
		frame.getContentPane().add(btnMozzaralle);
		
		JButton btnTomato = new JButton("Tomato Sauce: $1.00");
		btnTomato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pizza p = new TomatoSauce(new BasicPizza());
				String a = p.getDescription();
				Double b = p.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				//////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnTomato.setHorizontalAlignment(SwingConstants.LEFT);
		btnTomato.setBounds(472, 110, 155, 24);
		frame.getContentPane().add(btnTomato);
		
		JButton btnOzuExperience = new JButton("Ozu Experience: 50$");
		btnOzuExperience.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lounge l = new OzuExperience(new BasicLounge());
				String a = l.getDescription();
				Double b = l.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnOzuExperience.setHorizontalAlignment(SwingConstants.LEFT);
		btnOzuExperience.setBounds(190, 293, 156, 34);
		frame.getContentPane().add(btnOzuExperience);
		
		JButton btnExtraLeg = new JButton("Extra Leg Room: 40$");
		btnExtraLeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lounge l = new ExtraLeg(new BasicLounge());
				String a = l.getDescription();
				Double b = l.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnExtraLeg.setBounds(361, 293, 169, 34);
		frame.getContentPane().add(btnExtraLeg);
		
		JButton btnEmergencyExit = new JButton("Emergency Exit: 30$");
		btnEmergencyExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lounge l = new EmergencyExit(new BasicLounge());
				String a = l.getDescription();
				Double b = l.getPrice();
				myDoubleList.add(b);
				myStringList.add(a);
				////System.out.println("Description: "+a+ " " +b);
			}
		});
		btnEmergencyExit.setBounds(540, 293, 164, 34);
		frame.getContentPane().add(btnEmergencyExit);
		
		JButton btnCalculateBill = new JButton("Calculate Bill");
		btnCalculateBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    int sum = 0;
			    for (double i: myDoubleList) {
			        sum += i;
			    }
			    System.out.println("Your total cost base products with extra is :" +sum);
			}
				

		});
		btnCalculateBill.setBounds(147, 470, 105, 20);
		frame.getContentPane().add(btnCalculateBill);
		
		FINAL = new JTextField();


		//FINAL.setText(String.valueOf(sum));
		FINAL.setBounds(16, 404, 96, 153);
		frame.getContentPane().add(FINAL);
		FINAL.setColumns(10);
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
