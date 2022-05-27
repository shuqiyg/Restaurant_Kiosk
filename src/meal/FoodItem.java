package meal;

public abstract class FoodItem {
	String name;
	Packing packingType;
	double price;
	FoodItem(){};
	FoodItem(String name, Packing packingType, double price){
		setName(name);
		setPackType(packingType);
		setPrice(price);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPackType(Packing packingType) {
		this.packingType = packingType;
	}
	
	public String getPackType() {
		return this.packingType.getPackingName();
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
}
