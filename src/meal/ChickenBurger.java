package meal;

public class ChickenBurger extends Burger {
	static final String name = "ChickenBurger";
	final String pattyType = "ChickenPatty";
	static final double Price = 5.99;
	static final double extPattyPrice = 3.99;
	int noOfPatty = 1;
	static final Packing packing = new Wrapper();
	
	ChickenBurger(){}
	ChickenBurger(int noPatty, int MayoC, int SaladC, int TomatoC, int OnionC, int hotSauceC){
		super(name, (Price + extPattyPrice* noPatty), packing,noPatty, MayoC, SaladC, TomatoC, OnionC, hotSauceC);
		setNoOfPatty(noPatty);
	}	
	public String getPattyType() {
		return this.pattyType;
	}
	public void setNoOfPatty(int no) {
		this.noOfPatty = no;
	}
	@Override
	public void setName(String name) {
		super.name = name;
	}
}
