package meal;

public class VeggieBurger extends Burger{
	static final String name = "VeggieBurger";
	static final String pattyType = "SoyaPatty";
	static final double Price = 4.99;
	static final double extPattyPrice = 2.99;
	static final Packing packing = new Wrapper();
	
	VeggieBurger(){};
	VeggieBurger(int noPatty, int MayoC, int SaladC, int TomatoC, int OnionC, int hotSauceC){
		super(name, (Price + extPattyPrice* (noPatty)), packing,noPatty + 1, MayoC, SaladC, TomatoC, OnionC, hotSauceC);
	}
	
	public String getPattyType() {
		return pattyType;
	}
	@Override
	public void setName(String name) {
		super.name = name;
	}
}
