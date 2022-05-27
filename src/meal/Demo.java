package meal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Demo {
	public void initiateMenu() {
		Scanner input = new Scanner(System.in);
		boolean exit0 = false;
		Order newOrder = new Order();
		Customer newCus = new Customer();
		do {	
			int option0=0;
			String inputStr;
			System.out.println("Welcome to SQ's Burger Joint! Here's our MENU\n");
			System.out.println("1. Create New Order\n2. List Item Details\n3. Exit");
			try {
				inputStr = input.next();
				System.out.println();
				option0 = Integer.parseInt(inputStr);
			}catch(Exception e) {
				System.out.println("Please enter Interger as input.....\n");
				continue;
			}		

			switch(option0) {
			case 1:
				//Order newOrder = new Order();
				ArrayList<Burger> Burgers = new ArrayList<Burger>();
				ArrayList<Fries> Fries = new ArrayList<Fries>();
				ArrayList<Drink> Drinks = new ArrayList<Drink>();

				boolean exit1 = false;
				do {
					System.out.println("Please choose one of the following option -- ");
					System.out.println("a. Add Burger\nb. Add Cold Drink\nc. Add Fries\nd. Confirm/Cancel\n");
					System.out.println("Your Option: ");
					inputStr = input.next();
					System.out.println();
					switch(inputStr.toLowerCase()) {
					case "a":
						Burger newBurger;
						String burgerName;
						String burgerChoice = "";
						do {
							System.out.println("What kind of Burger you want to order --\n");
							System.out.println("1. Chicken Burger($5.99)\n2. Veggie Burger($4.99)\n");
							System.out.println("Your Choice: ");
							burgerChoice = input.next();
							System.out.println();
							int burChoice = Integer.parseInt(burgerChoice);
							if(burChoice == 1) {
								newBurger = new ChickenBurger();
								System.out.println("ChickenBurger has been added\n");
							}else if(burChoice == 2){
								newBurger = new VeggieBurger();
								System.out.println("VeggieBurger has been added\n");
							}else {
								System.out.println("Invalid Option, please try again...\n");
							}
						}while(Integer.parseInt(burgerChoice) != 1 && Integer.parseInt(burgerChoice)!= 2);
						//FoodItem newBurger;
						boolean exit2 = false;
						int PattyC = 0,  MayoC = 0,  SaladC = 0,  TomatoC = 0,  OnionC = 0,  hotSauceC = 0;
						do {
							System.out.println("Please choose one of the Ingredient(One Patty already included by default) -- ");
							System.out.println("a. Add Patty" + (Integer.parseInt(burgerChoice) == 1 ? "($3.99)":"($2.99)") + "\nb. Add Mayo\nc. Add Salad\nd. Add Tomatoes\ne. Add Onions\nf. Add Hot Sacue\ng. Press q/Q to go back to the last Menu\n");
							System.out.println("Your Option: ");
							inputStr = input.next();
							System.out.println();
							switch(inputStr.toLowerCase()) {
							case "a":
								PattyC++;
								System.out.println("One Patty is added\n");
								break;
							case "b":
								MayoC++;
								System.out.println("One Mayo is added\n");
								break;
							case "c":
								SaladC++;
								System.out.println("One Salad is added\n");
								break;
							case "d":
								TomatoC++;
								System.out.println("One Tomato is added\n");
								break;
							case "e":
								OnionC++;
								System.out.println("One Onion is added\n");
								break;
							case "f":
								hotSauceC++;
								System.out.println("One hotSauce is added\n");
								break;
							case "q":
								exit2 = true;
								break;
							default:
								System.out.println("Please Enter Valid Option.....\n");
							}
						}while(!exit2);
						if(Integer.parseInt(burgerChoice) == 1) {
							newBurger = new ChickenBurger(PattyC,  MayoC,  SaladC,  TomatoC,  OnionC,  hotSauceC);
						}else {
							newBurger = new VeggieBurger(PattyC,  MayoC,  SaladC,  TomatoC,  OnionC,  hotSauceC);
						}	
						Burgers.add(newBurger);
						break;
					case "b":
						Drink newDrink = null;
						String temp;
						String drinkChoice = "";
						do {
							System.out.println("What kind of Drink you want to order --\n");
							System.out.println("1. Coke($1.50)\n2. Pepsi($1.25)\n");
							System.out.println("Your Choice: ");
							drinkChoice = input.next();
							System.out.println();
							
							do{
								System.out.println("How do you like your Drink --\n");
								System.out.println("1. COLD\n2. ROOM TEMPERATURE\n");
								temp = input.next();
								System.out.println();
								if(Integer.parseInt(temp) != 1 && Integer.parseInt(temp) != 2) {
									System.out.println("Invalid Option, please try again...\n");
								}					
							}while(Integer.parseInt(temp) != 1 && Integer.parseInt(temp)!= 2);
							int dkChoice = Integer.parseInt(drinkChoice);
							if(dkChoice == 1) {
								newDrink = new Coke(Integer.parseInt(temp) == 1? "Cold" : "Room Temp");
								System.out.println("Coke has been added\n");
							}else if(dkChoice == 2){
								newDrink = new Pepsi(Integer.parseInt(temp) == 1? "Cold" : "Room Temp");
								System.out.println("Pepsi has been added\n");
							}else {
								System.out.println("Invalid Option, please try again...\n");
							}
						}while(Integer.parseInt(drinkChoice) != 1 && Integer.parseInt(drinkChoice)!= 2);
						Drinks.add(newDrink);
						break;
					case "c":
						Fries newFries = null;
						String friesChoice = "";
						do {
							System.out.println("What kind of Fries you want to order --\n");
							System.out.println("1. Straight\n2. Curly\n");
							System.out.println("Your Choice: ");
							friesChoice = input.next();
							int frChoice = Integer.parseInt(friesChoice);
							if(frChoice == 1) {
								newFries = new Fries("Straight");
								System.out.println("Straight Fries has been added\n");
							}else if(frChoice == 2){
								newFries = new Fries("Curly");
								System.out.println("Curly Fries has been added\n");
							}else {
								System.out.println("Invalid Option, please try again...\n");
							}
						}while(Integer.parseInt(friesChoice) != 1 && Integer.parseInt(friesChoice)!= 2);
						Fries.add(newFries);
						break;
					case "d":
						int input1 = -1;
						
						do {
							System.out.println("Press 1 to confirm your order | Press 2 to cancel your order\n");
							inputStr = input.next();
							input1 = Integer.parseInt(inputStr);
							if(input1 == 1) {
								System.out.print("\nPlease Enter your Name: ");
								String cusName = input.next();
								System.out.print("Please Enter your Phone Number(xxx-xxx-xxxx): ");
								String phoneNo = input.next();
								System.out.println();
								newCus = new Customer(cusName, phoneNo);
								LocalDate orderDate = LocalDate.now();
								newOrder = new Order(Burgers, Drinks, Fries, newCus, orderDate);
							}else if(input1 == 2) {
								System.out.println("Order has been canceled!\n");
								break;
							}else {
								System.out.println("Invalid Option, please try again..burgerChoice..\n");
								continue;
							}
						}while(input1 != 1 && input1 != 2);
						exit1 = true;
						break;
					default:
						System.out.println("Please Enter Valid Option.....\n");
					}
				}while(!exit1);
	
				break;
			case 2:
				newOrder.printOrder();
				break;
			case 3:
				System.out.println("Thank you for your business, enjoy your meal. See you next time, bye!\n");
				exit0 = true;
				break;
			default:
				System.out.println("Invalid Input, please try again....\n");				
			}
		}while(!exit0);
		input.close();
	}
}
