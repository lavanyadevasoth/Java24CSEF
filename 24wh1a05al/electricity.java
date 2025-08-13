import java.util.Scanner;

		public class Demo {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the old reading: ");
		        int OldReading = scanner.nextInt();
		        System.out.print("Enter the current reading: ");
		        int CurrentReading = scanner.nextInt();

		        int units = CurrentReading - OldReading;  // corrected calculation
		        int billAccount = 0;

		        if (units <= 50) {
		            billAccount = units * 1;
		        } else if (units <= 100) {
		            billAccount = (50 * 1) + (units - 50) * 2;
		        } else if (units <= 200) {
		            billAccount = (50 * 1) + (50 * 2) + (units - 100) * 3;
		        } else if (units <= 400) {
		            billAccount = (50 * 1) + (50 * 2) + (100 * 3) + (units - 200) * 4;
		        } else {
		            billAccount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + (units - 400) * 5;
		        }

		        System.out.println("Total units consumed: " + units);
		        System.out.println("Electricity bill amount: Rs " + billAccount);
		    }
		}
