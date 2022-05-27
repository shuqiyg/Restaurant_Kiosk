package meal;

public class Fries extends FoodItem{
	String shape;
	static final double price = 2.99;
	static final Packing packing = new BoxContainer();
	Fries(){}
	Fries(String shape){
		super(shape + "Fries",packing, price);	
		setShape(shape);
	}
	
	public void setShape(String shape) {
		this.shape =shape;
	}
	
	public String getShape() {
		return this.shape;
	}
}
