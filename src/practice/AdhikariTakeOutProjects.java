package practice;

import java.util.Scanner;

public class AdhikariTakeOutProjects {

	final static double tipRate = 0.15;
	final static double taxRate = 0.07;

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

	public static int determineTrays(int people, int feeds) {
		int trays = people / feeds;
		return trays;

	}

	public static double getSUbtotal(double price, int trays) {
		double subtotal = price * trays;
		return subtotal;

	}

	public static double getTax(double subtotal, double taxRate) {

		double tax = taxRate * subtotal;
		return tax;
	}

	public static double getTip(double subtotal, double tipRate) {
		double tip = tipRate * subtotal;
		return tip;
	}

	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double grantotal = subtotal + tax + tip;
		return grantotal;
	}

	public static double pricePerPerson(double grantotal, int people) {
		double pricePerPerson = grantotal / people;
		return pricePerPerson;
	}

	public static int determineLeftOvers(int feeds, int trays, int people) {
		int determineleftovers = people - (feeds * trays);
		return determineleftovers;
	}

	public static void main(String[] args) {
		double price = 0;
		int feeds = 0;
		int menuChoiced = 0;

		displayMainMenu();
		Scanner input = new Scanner(System.in);
		int menuChoice = input.nextInt();
		switch (menuChoice) {
		case 1:
			menuChoiced = 1;
			displayItalianFoodMenu();
			break;
		case 2:
			menuChoiced = 2;
			displayChineseFoodMenu();
			break;
		case 3:
			menuChoiced = 3;
			displayAmericanFoodMenu();
			break;
		default:
			System.out.println("wrong choice");
		}
		System.out.println("Enter your choices");
		int foodChoice = input.nextInt();
		System.out.println("Enter the number of people");
		int people = input.nextInt();
		if (people >= 10 && people <= 100) {
			if (menuChoiced == 1 && foodChoice == 1) {

				price = 17.99;
				feeds = 5;
			}

			else if (menuChoiced == 1 && foodChoice == 2) {

				price = 15.99;
				feeds = 7;
			}

			else if (menuChoiced == 1 && foodChoice == 3)

			{
				price = 12.99;
				feeds = 4;
			}

			else if (menuChoiced == 2 && foodChoice == 1) {

				price = 18.99;
				feeds = 7;
			}

			else if (menuChoiced == 2 && foodChoice == 2) {

				price = 18.99;
				feeds = 7;
			}

			else if (menuChoiced == 2 && foodChoice == 3)

			{
				price = 10.99;
				feeds = 5;
			} else if (menuChoiced == 3 && foodChoice == 1) {

				price = 21.99;
				feeds = 8;
			}

			else if (menuChoiced == 3 && foodChoice == 2) {

				price = 22.99;
				feeds = 5;
			}

			else if (menuChoiced == 3 && foodChoice == 3)

			{
				price = 26.99;
				feeds = 10;
			}

			else {
				System.out.println("Invalid Input");

			}
			System.out.println();
			System.out.println();
			determineTrays(people, feeds);
			int trays = AdhikariTakeOutProjects.determineTrays(people, feeds);
			System.out.println("You need " + trays + " trays");
			double subtotal = AdhikariTakeOutProjects.getSUbtotal(price, trays);
			System.out.println("total price for " + people + "(" + trays + "trays):" + subtotal);

			double tax = AdhikariTakeOutProjects.getTax(subtotal, taxRate);
			System.out.println("Tax: " + tax);
			double tip = AdhikariTakeOutProjects.getTip(subtotal, tipRate);
			System.out.println("Tip:" + tip);
			double grantotal = getGrandTotal(subtotal, tax, tip);
			System.out.println("Total(food,tax,tip) :" + grantotal);
			double pricePerPerson = pricePerPerson(grantotal, people);
			System.out.println("Price per person :" + pricePerPerson);
			int determineleftovers = determineLeftOvers(feeds, trays, people);
			System.out.println("Leftover Serving for the delivery person :" + determineleftovers);

			input.close();
		} else {
			System.out.println("Invalid People");
		}
	}
}
