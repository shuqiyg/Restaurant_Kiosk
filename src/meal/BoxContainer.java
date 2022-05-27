package meal;

public class BoxContainer implements Packing{
	final String name = "BoxContainer";
	@Override
	public String getPackingName() {
		return this.name;
	}
}
