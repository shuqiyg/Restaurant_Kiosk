package meal;

public class Coke extends Drink{
	static final String name = "Coke";
	static final double price = 1.50;
	static final Packing packing = new Bottle();
	Coke(){}
	Coke(String temp){
		super(packing, name, temp, price);
	};
}
