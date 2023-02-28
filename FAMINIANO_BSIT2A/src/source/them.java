package source;

import java.util.Scanner;

public class them {
    static Scanner myScan = new Scanner(System.in);
    static int product_Order;
    static int quantity;
    static int quantity1;
    static int total_Order; 
    static int total_Order1;
    static int total;
    static int payment; 
    static int change;
    static int bottle;
    static String another_Order;
    static int Tanduay = 120;
    static int stock1 = 10;

    public static void main(String[] args) {
        products();
        my_Orders();

    }

    private static void products() {
        System.out.println("=============================================");
        System.out.println("                Lyndon's Bar                 ");
        System.out.println("=============================================");
        System.out.println(" Item           Drinks       Price         Stock");
        System.out.println("                                                ");
        System.out.println(" [1]           Tanduay        120            " + stock1);
        System.out.println(" [2]           Redhorse       110            15 ");
        System.out.println(" [3]           Emperador      150            20 ");
        System.out.println("=============================================");
    }

    private static void my_Orders() {
        System.out.print("  Enter your order here: ");
        product_Order = myScan.nextInt();
        System.out.println("=============================================");
        if (product_Order == 1) {
            System.out.println("  You ordered 'Tanduay'               ");
            System.out.println("=============================================");
            System.out.println(" Price          Stock");
            System.out.println("  120            10");
            System.out.println("=============================================");
            System.out.print("  Enter quantity:                        ");
            quantity = myScan.nextInt();
            System.out.println("=============================================");
            if (quantity <= stock1) {
                System.out.println("  You ordered " + quantity + " Tanduay");

                total_Order = quantity * Tanduay;
                System.out.println("  Price: " + total_Order);
                stock1 = stock1 - quantity;
                System.out.println("=============================================");
                System.out.print("  Do you want to add order? [Y/N]: ");
                another_Order = myScan.next();

            } else {
                System.out.println("        INSUFFICIENT STOCK!\n   REMAINING STOCK IS ONLY " + stock1);
                products();
                return;
            }
            if (another_Order.equalsIgnoreCase("Y")) {
                System.out.println("=============================================");
                System.out.println(" [1]           Tanduay       120           " + stock1);
                my_Orders1();
            } else if (another_Order.equalsIgnoreCase("N")) {
                bottle = quantity;
                System.out.println("  Total No. of Bottle: " + bottle);
                total = total_Order + total_Order1;
                System.out.println("  Total Price: " + total);
                System.out.print("  Enter payment: ");
                payment = myScan.nextInt();
                if (payment > total) {
                    change = payment - total_Order;
                    System.out.println("  Change: " + change);
                } else {
                    System.out.println("  Isufficient Money");
                }
                System.out.println("=============================================");
                System.out.println("                 Lyndon's Bar                ");
                System.out.println("=============================================");
                System.out.println(" Item          Drinks       Price         Stock");
                System.out.println(" [1]           Tanduay       120            " + stock1);
                System.out.println(" [2]           Redhorse      110           15 ");
                System.out.println(" [3]           Emeprador     150           20 ");
                System.out.println("=============================================");
                System.out.println("                 Drink Well!!                ");

            }
        }
    }

    private static void my_Orders1() {

        System.out.println("=============================================");
        if (product_Order == 1) {
            System.out.print("Enter quantity:   ");
            quantity1 = myScan.nextInt();
            System.out.println("=============================================");
            if (quantity1 <= stock1) {
                System.out.println("You ordered " + quantity1 + " Tanduay ");
                total_Order1 = quantity1 * Tanduay;
                System.out.println("  Price: " + total_Order1);
                System.out.println("=============================================");
                System.out.print("  Do you want to add order [Y/N]: ");
                another_Order = myScan.next();
                System.out.println("=============================================");
            } else {
                System.out.println("  INSUFFICIENT STOCK! \n   REMAINING STOCK IS ONLY " + stock1);
                products();

                return;
            }
            if (another_Order.equalsIgnoreCase("Y")) {
                bottle = quantity + quantity1;
                System.out.println("  Total No. Of Bottle: " + bottle);
                total = total_Order + total_Order1;
            }
        }
    }
}
