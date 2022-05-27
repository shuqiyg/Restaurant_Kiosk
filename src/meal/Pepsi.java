package meal;

public class Pepsi extends Drink {
	static final String name = "Pepsi";
	static final double price = 1.25;
	static final Packing packing = new Bottle();
	Pepsi(){}
	Pepsi(String temp){
		super(packing, name, temp, price);
	};
}
