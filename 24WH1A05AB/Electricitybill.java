import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Input readings
        System.out.print("Enter old meter reading: ");
        int oldReading = sc.nextInt();
        
        System.out.print("Enter current meter reading: ");
        int currentReading = sc.nextInt();
        
        // Step 2: Calculate units consumed
        int units = currentReading - oldReading;
        
        double billAmount = 0;

        // Step 3: Calculate bill using if-else-if ladder
        if (units <= 50) {
            billAmount = units * 1;
        } 
        else if (units <= 100) {
            billAmount = (50 * 1) + ((units - 50) * 2);
        } 
        else if (units <= 200) {
            billAmount = (50 * 1) + (50 * 2) + ((units - 100) * 3);
        } 
        else if (units <= 400) {
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + ((units - 200) * 4);
        } 
        else {
            billAmount = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((units - 400) * 5);
        }
        
        // Step 4: Display result
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: Rs. " + billAmount);
        
        sc.close();
    }
}
