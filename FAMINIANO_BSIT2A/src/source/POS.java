package source;

import java.util.Scanner;

public class POS {
	static String product1 = "COKE BREW",
			product2 = "SPRITE BREW",
			product3 = "ROYAL BREW",
			product4 = "WATER BREW", ask;

	static int price1 = 50, price2 = 30, price3 = 20, price4 = 10,
			stock1 = 69, stock2 = 96, stock3 = 89, stock4 = 98, select, quantity, total = 0, addQuantity = 0;

	static void displayMenu() {
		System.out.println("\t\t+-------------------------------------------------------------+");
		System.out.println("\t\t+\t                SHEEP SHAAPP SHOP                     +");
		System.out.println("\t\t+----+ ID +--+ PRODUCT +-------+ PRICE +------------+ STOCK --+");
		System.out
				.println("\t\t+      [1]    " + product1 + "" + "\t\t  " + price1 + "\t\t       " + stock1 + "   --+");
		System.out.println("\t\t+      [2]    " + product2 + "" + "\t  " + price2 + "\t\t       " + stock2 + "   --+");
		System.out.println("\t\t+      [3]    " + product3 + "" + "\t  " + price3 + "\t\t       " + stock3 + "   --+");
		System.out.println("\t\t+      [4]    " + product4 + "" + "\t  " + price4 + "\t\t       " + stock4 + "   --+");
		System.out.println("\t\t+-------------------------------------------------------------+");

	}

	static void showSelection(Scanner sc, String product, int price, int stock) {
		System.out.println("\t\t+-------------------------------------------------------------+");
		System.out.println("\t\t+\t                YOU HAVE ORDERED                      +");
		System.out.println("\t\t+------+ PRODUCT +-----------+ PRICE +--------+ STOCK --------+");
		System.out.println("\t\t\t" + product + "\t\t" + price + "\t\t " + stock);
		System.out.println("\t\t+-------------------------------------------------------------+");

	}

	static void askQuantity(String product, Scanner sc, int stock) {
		System.out.print("\t\tEnter quantity: ");
		quantity = sc.nextInt();
		stock -= quantity;
		System.out.println("\t\tYou ordered: " + quantity + " " + product);

	}
	
	static void Receipt(Scanner sc, String product, int price, int stock, int total, int addQuantity)
	{
		System.out.println("\t\tStock " + stock);
		System.out.println("\t\tTotal: " + total);
		System.out.println("\t\tQuantity: " + addQuantity);
	}
		static void askAgain(Scanner sc, String product, int price, int stock) {
		System.out.print("\t\tDo you want to order again [Y/N]: ");
		ask = sc.next();
		if (ask.equalsIgnoreCase("Y")) {
			showSelection(sc, product, price, stock);
			System.out.print("\t\tEnter quantity: ");
			quantity = sc.nextInt();
			addQuantity += quantity;
			stock -= quantity;
			if (stock < quantity) {
				System.out.println("\t\tNot enough stock!");
				askAgain(sc, product, price, stock);
			} else {
				showSelection(sc, product, price, stock);
				System.out.println("\t\tYou ordered: " + quantity + " " + product);
				askAgain(sc, product, price, stock);
			}

		} else if (ask.equalsIgnoreCase("N")) {
			Receipt(sc, product, price, stock , total, addQuantity);
			System.out.println("\t\tBye");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		displayMenu();
		System.out.print("\t\t Select input: ");
		select = sc.nextInt();
		if (select == 1) {
			showSelection(sc, product1, price1, stock1);
			System.out.print("\t\tEnter quantity: ");
			quantity = sc.nextInt();
			addQuantity += quantity;
			stock1 -= quantity;
			System.out.println("\t\tYou ordered: " + quantity + " " + product1);
			askAgain(sc, product1, price1, stock1);
		} else if (select == 2) {
			// showSelection(product2, price2, stock2);
		} else if (select == 3) {
			// showSelection(product3, price3, stock3);
		} else if (select == 4) {
			// showSelection(product4, price4, stock4);

		}
	}
}
