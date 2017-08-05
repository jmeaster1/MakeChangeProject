import java.util.Scanner;

public class MoneyChanger {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);// Scanner created to receive user input

		double itemCost, amtTend;

		System.out.println("What is the price of the item you would like to purchase?: ");// Prompts user for item cost
		itemCost = keyboard.nextDouble();

		System.out.println("What is the amount tendered?: ");// Prompts user for amount tendered
		amtTend = keyboard.nextDouble();

		double changeDue = (amtTend - itemCost);// calculates total change due
		int change = (int) changeDue * 100;// converts the total change due into cents and casts into an int because I
											// want the number of whole dollar bills (ex: 5, not 5.12)

		int numOnes = change / 100;
		change = change * 100;

		int numQuarters = change / 25;
		change = change * 25;

		if (itemCost > amtTend) {
			System.out.println("You don't have enough money to purchase this item ");// message displays if user
																						// doesn't have enough $
		} else if (itemCost == amtTend) {
			System.out.println("You have paid the exact amount. No change is due.");// message displays if user pays in
																					// exact change
		} else if (amtTend > itemCost) {
			System.out.println("You are due " + changeDue + " in change from this transaction.");// Displays total
																									// change
																									// due to user

		}

	}

}
