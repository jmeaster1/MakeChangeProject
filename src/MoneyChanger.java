import java.util.Scanner;

public class MoneyChanger {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);//Scanner created to receive user input
		
		double itemCost, amtTend;
		
		System.out.println("What is the price of the item you would like to purchase?: ");//Prompts user for item cost
		itemCost = keyboard.nextDouble();
		
		System.out.println("What is the amount tendered?: ");//Prompts user for amount tendered
		amtTend = keyboard.nextDouble();
		
		if( itemCost > amtTend) {
			System.out.println("You don't have enough money to purchase this item: ");//message displays if user doesn't have enough $
		}
		else if( itemCost == amtTend) {
			System.out.println("You have paid the exact amount. No change is due.");//message displays if user pays in exact change
		}
		else( )//Make change calculations will go here
		

	}

}
