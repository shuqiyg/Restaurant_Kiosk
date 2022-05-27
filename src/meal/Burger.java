package meal;

public abstract class Burger extends FoodItem {
	  int [] ingredCounts = new int[6];
	  int Patty = 0, Mayo = 1, Salad = 2,Tomatoes = 3, Onions = 4, hotSauce = 5;
	  Burger(){}
	  Burger(String name, double price, Packing packing,int noPatty, int MayoC, int SaladC, int TomatoC, int OnionC, int hotSauceC){
		  super(name, packing, price);
		  ingredCounts[Patty] = noPatty;
		  ingredCounts[Mayo] = MayoC;
		  ingredCounts[Salad] = SaladC;
		  ingredCounts[Tomatoes] = TomatoC;
		  ingredCounts[Onions] = OnionC;
		  ingredCounts[hotSauce] = hotSauceC;
	  }
	  
	  public void printIngredients() {
		  System.out.println("    ---- Ingredients =>");
		  System.out.println("         Patty: " + ingredCounts[Patty]);
		  System.out.println("         Mayo: " + ingredCounts[Mayo]);
		  System.out.println("         Salad: " + ingredCounts[Salad]);
		  System.out.println("         Tomato: " + ingredCounts[Tomatoes]);
		  System.out.println("         Onion: " + ingredCounts[Onions]);
		  System.out.println("         Hot Sauce: " + ingredCounts[hotSauce]);
		  System.out.println();
	  }  
}
