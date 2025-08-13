package java2025;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
        int n = scanner.nextInt(); 

        
        for (int i = 1; i <= n; i++) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  "); 
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*   "); 
            }
            System.out.println();
        }

        
        for (int i = n - 1; i >= 1; i--) {
            
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

	


