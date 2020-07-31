package practice;

import java.util.Scanner;

public class AdhikariTakeOutProject {
	static int trays;
	static int feeds;
	static double price;
	static int numberOfPeople;
	double subtotal;
	double tipRate;
	double taxRate;
	final double tip = 0.15;
	double grantotal;
	final double tax = 0.07;
	final double lasangPrice = 17.99;

	public static void displayMainMenu() {
		System.out.println("What Type of Food would you like to order");
		System.out.println("1. Italian\n\n2. Chinese\n\n3. American");

	}

	public static void displayItalianFoodMenu() {
		System.out.println("Here are  your choices");
		System.out.println(
				"1. Lasagna Tray-Feeds 5-$17.99\n2. Pizza Pack-Feeds 7-$15.99\n3. Gazpacho Soup, Salad and bread sticks pack-Feeds 4-$12.99");

	}

	public static void displayChineseFoodMenu() {
		System.out.println("Here are  your choices");
		System.out.println("1. Chicken and Broccoli " + "Tray(includes 7 wonton soups, 7 egg rolls)-"
				+ "feeds 7 - $18.99\n2. Sweet and Sour Pork Tray(includes 7 hot and sour soups, 7 egg rolls)-feeds 7- $18.99\n3. Shrimp Fried Rice Tray(includes 10 egg rolls)-Feeds 5-$10.9 ");

	}

	public static void displayAmericanFoodMenu() {
		System.out.println("Here are  your choices");
		System.out.println("1. Hamburger and Hot Dog Tray- includes bun and condiments-feeds 8- $21.99\n"
				+ "2. Grilled Chicken Sandwich and Mozzarella Sticks Tray- includes dipping sauces- Feeds 5 - $22.99\n3. Barbeque Tray- includes buns and peach cobbler- Feeds 10- $26.99");

	}

	public static int determineTrays(int numberOfPeople, int feeds) {
		trays = numberOfPeople / feeds;
		System.out.println(numberOfPeople);
		System.out.println("Trays:" + trays);
		return trays;

	}

	public static double getSUbtotal(double price, int trays) {
		double subtotal = price * trays;
		System.out.println("Price for " + numberOfPeople + "people is :" + subtotal);
		return subtotal;

	}

	public static double getTax(double subtotal, double taxRate) {

		double tax = taxRate * subtotal;
		System.out.println("Tax: " + tax);
		return tax;
	}

	public static double getTip(double subtotal, double tipRate) {
		double tip = tipRate * subtotal;
		System.out.println("Tip: " + tip);
		return tip;
	}

	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double grantotal = subtotal + tax + tip;
		System.out.println("Total(food,tax,tip): " + grantotal);
		return grantotal;
	}

	public static double pricePerPerson(double grantotal, int people) {
		double pricePerPerson = grantotal / people;
		System.out.println("Price per person :" + pricePerPerson);
		return pricePerPerson;
	}

	public static int determineLeftOvers(int feeds, int trays, int people) {
		int determineleftovers = (feeds * trays) - people;
		System.out.println("Leftover Serving for the delivery person :" + determineleftovers);
		return determineleftovers;
	}

	public static void main(String[] args) {
		displayMainMenu();
		
		Scanner input = new Scanner(System.in);	
		int menuChoice = input.nextInt();
		int menuChoosed = 0 ;
		
		switch (menuChoice) { if
		case 1:
			displayItalianFoodMenu();
			menuChoosed = 1;
			System.out.println();
			
			break;
		case 2:
			displayChineseFoodMenu();
			menuChoosed =2;
			System.out.println();
			break;
		case 3:
			displayAmericanFoodMenu();
			menuChoosed = 3;
			System.out.println();
			break;
		default:
			System.out.println("wrong choice");		
		
		
		}
	
        System.out.println("Enter your choices");
		
		int foodChoice = input.nextInt();
		System.out.println("Enter the number of people");
		int numberOfPeople = input.nextInt();
		
		if(foodChoice==menuChoosed) {
			switch (foodChoice) {
			case 1:
			    price= 17.99;
			    feeds= 5;
			    determineTrays( numberOfPeople, feeds);
				break;
			case 2:
				price= 15.99;
				feeds= 7;
				determineTrays( numberOfPeople, feeds);
				break;
			case 3:
				price= 12.99;
				feeds= 4;
				determineTrays( numberOfPeople, feeds);
				break;
			default:
				System.out.println("Invalid Input");
				
		}
			
		} else if (foodChoice==menuChoosed); {
			switch (foodChoice) {
			case 1:
				price= 18.99;
				feeds=7;
				determineTrays( numberOfPeople, feeds);
				break;
			case 2:
				price= 18.99;
				feeds= 7;
				determineTrays( numberOfPeople, feeds);
				break;
			case 3:
				price= 10.99;
				feeds= 5;
				determineTrays( numberOfPeople, feeds);
				break;
			default:
				System.out.println("Invalid Input");
			}	
		
			
		}  if(foodChoice==menuChoosed);{
			switch (foodChoice) {
			case 1:
				price = 21.99;
				feeds= 8;
				determineTrays( numberOfPeople, feeds);
				break;
			case 2:
				price=22.99;
				feeds=5;
				determineTrays( numberOfPeople, feeds);
				break;
			case 3:
				price=26.99;
				feeds=10;
				determineTrays( numberOfPeople, feeds);
				break;
			default:
				System.out.println("Invalid Input");
				
		}
		}	 input.close();	
	}
		}
	


