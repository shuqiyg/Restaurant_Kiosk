package meal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
	ArrayList<Burger> Burgers = new ArrayList<Burger>();
	ArrayList<Drink> Drinks = new ArrayList<Drink>();
	ArrayList<Fries> Fries = new ArrayList<Fries>();
	LocalDate date;
	Customer customer;
	
	int chickBurgerCount = 0, vegBurgerCount =0, pepsiCount = 0, cokeCount = 0, CurFriesCount = 0, StrFriesCount =0; 
	Order(){}
	Order(ArrayList<Burger> Burgers,ArrayList<Drink> Drinks, ArrayList<Fries> Fries, Customer customer, LocalDate date){
		setBurgers(Burgers);
		setDrinks(Drinks);
		setFries(Fries);
		setCustomer(customer);
		setDate(date);
	}
	
	public void setBurgers(ArrayList<Burger> burgers) {
		this.Burgers = burgers;
	}
	public ArrayList<Burger> getBurgers() {
		return this.Burgers;
	}
	public void setDrinks(ArrayList<Drink> drinks) {
		this.Drinks = drinks;
	}
	
	public ArrayList<Drink> getDrinks() {
		return this.Drinks;
	}
	public void setFries(ArrayList<Fries> fries) {
		this.Fries = fries;
	}
	public ArrayList<Fries> getFries() {
		return this.Fries;
	}
	
	public void setCustomer(Customer cus) {
		this.customer = cus;
	}
	
	public Customer getCustomer() {
		return this.customer;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalDate getDate() {
		return this.date;
	}
	
	public double calculateBurgersTotal() {
		double burgerTotal = 0;
		for(Burger b: Burgers) {
			burgerTotal += b.price;
		}
		return burgerTotal;
	}
	
	public double calculateFriesTotal() {
		double friesTotal = 0;
		for(Fries f: Fries) {
			friesTotal += f.price;
		}
		return friesTotal;
	}
	
	public double calculateDrinksTotal() {
		double drinkTotal = 0;
		for(Drink d: Drinks) {
			drinkTotal += d.price;
		}
		return drinkTotal;
	}
	
	public int getBurgerCount() {
		return Burgers.size();
	}
	
	public int getFriesCount() {
		return Fries.size();
	}
	public int getDrinkCount() {
		return Drinks.size();
	}
	public void printOrder() {
		double totalbill = 0;
		totalbill += calculateBurgersTotal();
		totalbill += calculateFriesTotal();
		totalbill += calculateDrinksTotal();
		System.out.println(getBurgerCount());
	if(getFriesCount()== 0 && getDrinkCount()== 0 && getBurgerCount()== 0) {
			System.out.println("*****************************************\n"
				          + "**** You have 0 item in your ORDER *****\n"
					          + "******************************************\n");
		return;
	}
		System.out.println("*****************Your Order Summary******************\n"
						 + "Your Name: " + customer.getName() + "  &  Your Phone Number: " + customer.phoneNo
						 + "\n*****************************************************\nBurgers --------------- Amounts: " + getBurgerCount() );
		for(Burger b : Burgers) {
			System.out.println("   " + b.name + " ---------- $" + b.getPrice());
			b.printIngredients();	
		}
		System.out.println("Fries ----------- Amounts: " + getFriesCount());
		for(Fries f: Fries) {
			System.out.println("      " + f.name + " ------------- " +  " $" + f.getPrice());	
		}
		System.out.println("Drinks ---------- Amounts: " + getDrinkCount());
		for(Drink d: Drinks) {
			System.out.println("      " + d.name + "@ " + d.getTemp()  + " ---------- "+ " $" + d.getPrice());
		}
		System.out.printf(" \n                                 TOTAL: $%.2f", totalbill);
		System.out.println("\n****************************************************\n");
	}
}
