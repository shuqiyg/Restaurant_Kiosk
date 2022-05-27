package meal;

public class Wrapper implements Packing{
	final String name = "Wrapper";
	@Override
	public String getPackingName() {
		return this.name;
	}
}
