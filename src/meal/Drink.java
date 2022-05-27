package meal;

public abstract class Drink extends FoodItem{
	String temp;
	Drink(){}
	Drink(Packing packing, String name, String temp, double price){		
		super(name, packing, price);	
		setTemp(temp);
	}
	
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getTemp() {
		return this.temp;
	}
}
