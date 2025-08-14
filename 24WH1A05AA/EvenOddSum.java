/**
 * 
 */
package intro;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                sumEven += num; 
            } else {
                sumOdd += num;  
            }
        }

        // Output results
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        sc.close();
    }
}
