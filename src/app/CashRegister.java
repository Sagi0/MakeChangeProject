package app;

import java.util.Scanner;
import java.lang.Math;

public class CashRegister {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("                       Please enter PRICE for the product: ");
		double price = sc.nextDouble();
		System.out.println("______________________________________________________________________________________");

		System.out.print("\n                      Please enter CASH given for product: ");
		double cash = sc.nextDouble();
		System.out.println("______________________________________________________________________________________");
		System.out.println();

		if (cash < price) {
			System.out.println("\n                   Sale Void. Not enough cash for this product.");
			System.out.println("______________________________________________________________________________________");
			System.out.println("******************************** End Of Transaction **********************************");
		} else if (cash == price) {
			System.out.println("\n                            Exact Change. No Cash Back.");
			System.out.println("______________________________________________________________________________________");
			System.out.println("******************************** End Of Transaction **********************************");
		} else {

			System.out.println("**************************************************************************************");
			System.out.print("--------------------------------------------------------------------------------------");
			System.out.printf("\n" + "                                   TOTAL: %.2f%n", price);
			double changeOwed = cash - price;
			double coinsLeft;
			double coins;
			System.out.printf("\n" + "                                CHANGE OWED: %.2f%n", changeOwed );
			System.out.println();
			
			int pennies, nickels, dimes, quarters, dollars;
			int fives, tens, twenties, fifties, hundreds;
			double PENNIES = .01;
			double NICKELS = .05;
			double DIMES = .10;
			double QUARTERS = .25;
			double DOLLARS = 1;
			double FIVES = 5;
			double TENS = 10;
			double TWENTIES = 20;
			double FIFTIES = 50;
			double HUNDREDS = 100;

			hundreds = (int) Math.floor(changeOwed / HUNDREDS);
			fifties = (int) Math.floor((changeOwed - hundreds * HUNDREDS) / FIFTIES);
			twenties = (int) Math.floor((changeOwed - hundreds * HUNDREDS - fifties * FIFTIES) / TWENTIES);
			tens = (int) Math
					.floor((changeOwed - hundreds * HUNDREDS - fifties * FIFTIES - twenties * TWENTIES) / TENS);
			fives = (int) Math.floor(
					(changeOwed - hundreds * HUNDREDS - fifties * FIFTIES - twenties * TWENTIES - tens * TENS) / FIVES);
			dollars = (int) Math.floor((changeOwed - hundreds * HUNDREDS - fifties * FIFTIES - twenties * TWENTIES
					- tens * TENS - fives * FIVES));

			coins = changeOwed - hundreds * HUNDREDS - fifties * FIFTIES - twenties * TWENTIES - tens * TENS
					- fives * FIVES - dollars * DOLLARS;
			coinsLeft = coins;

			coinsLeft = Math.round(coinsLeft * 100.0) / 100.0;

			quarters = (int) Math.floor(coinsLeft / .25);

			coinsLeft = coins - quarters * QUARTERS;

			coinsLeft = Math.round(coinsLeft * 100.0) / 100.0;

			dimes = (int) Math.floor(coinsLeft / .10);

			coinsLeft = coins - quarters * QUARTERS - dimes * DIMES;

			coinsLeft = Math.round(coinsLeft * 100.0) / 100.0;

			nickels = (int) Math.floor(coinsLeft / .05);

			coinsLeft = coins - quarters * QUARTERS - dimes * DIMES - nickels * NICKELS;

			coinsLeft = Math.round(coinsLeft * 100.0) / 100.0;

			pennies = (int) Math.floor(coinsLeft / .01);

			if (hundreds > 1) {
				System.out.print(hundreds + " Hundreds, ");
			}
			if (hundreds == 1) {
				System.out.print(hundreds + " Hundred, ");
			}
			if (fifties > 1) {
				System.out.print(fifties + " Fifties, ");
			}
			if (fifties == 1) {
				System.out.print(fifties + " Fifty, ");
			}
			if (twenties > 1) {
				System.out.print(twenties + " Twenties, ");
			}
			if (twenties == 1) {
				System.out.print(twenties + " Twenty, ");
			}
			if (tens > 1) {
				System.out.print(tens + " Tens, ");
			}
			if (tens == 1) {
				System.out.print(tens + " Ten, ");
			}
			if (fives > 1) {
				System.out.print(fives + " Fives, ");
			}
			if (fives == 1) {
				System.out.print(fives + " Five, ");
			}
			if (dollars > 1) {
				System.out.print(dollars + " Dollars, ");
			}
			if (dollars == 1) {
				System.out.print(dollars + " Dollar, ");
			}
			if (quarters > 1) {
				System.out.print(quarters + " Quarters, ");
			}
			if (quarters == 1) {
				System.out.print(quarters + " Quarter, ");
			}
			if (dimes > 1) {
				System.out.print(dimes + " Dimes, ");
			}
			if (dimes == 1) {
				System.out.print(dimes + " Dime, ");
			}
			if (nickels > 1) {
				System.out.print(nickels + " Nickels, ");
			}
			if (nickels == 1) {
				System.out.print(nickels + " Nickel, ");
			}
			if (pennies > 1) {
				System.out.print(pennies + " Pennies.");
			}
			if (pennies == 1) {
				System.out.print(pennies + " Penny.");
			}
			System.out.println("\n______________________________________________________________________________________");
			System.out.println("******************************** End Of Transaction **********************************");
		}
	}
}
