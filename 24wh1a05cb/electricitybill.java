package demo;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the old reading:");
        int oldreading = scanner.nextInt();
        System.out.println("Enter the current reading:");
        int currentreading = scanner.nextInt();
        int unitsconsumed = currentreading-oldreading;
        double billamount=0;

        if (unitsconsumed < 0) {
            System.out.println("Error");
        } else if (unitsconsumed <= 50) {
                billamount = unitsconsumed * 1;
            } else if (unitsconsumed <= 100) {
                billamount = (50 * 1) + ((unitsconsumed - 50) *2);
                System.out.println(billamount);
            } else if (unitsconsumed <= 200) {
                billamount = (50 * 1) + (50 * 2) + ((unitsconsumed - 100) * 3);
                System.out.println(billamount);
            } else if (unitsconsumed <= 400) {
                billamount = (50 * 1) + (50 * 2) + (100 * 3) + ((unitsconsumed - 200) * 4);
                System.out.println(billamount);
            } else {
                billamount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((unitsconsumed - 400) * 5);
                System.out.println(billamount);
            }
        System.out.println("Units Consumed: " + unitsconsumed);
        System.out.println("Electricity Bill is: Rs." + billamount);
    scanner.close();
  }
}
