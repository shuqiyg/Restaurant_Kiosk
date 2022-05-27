package meal;

public class Bottle implements Packing{
	final String name = "Bottle";
	@Override
	public String getPackingName() {
		return this.name;
	}
}
