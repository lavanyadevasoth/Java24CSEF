import java.util.Scanner;
public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try(Scanner myNum = new Scanner(System.in)){  // Create a Scanner object
		 System.out.println("Enter old meter value");
		 int  oldmeter = myNum.nextInt();// Read user input
		 System.out.println("Enter new meter value");
         int newmeter = myNum.nextInt();
		 int units = newmeter- oldmeter;
		 if (units<0) {
			 System.out.println("Error: units cannot be negative.");
			 return ;
		    }
		 int charge = 0;
	     System.out.println("Total units consumed: " + units);
	     // Bill calculation using if-else-if ladder
	        if (units <= 50) {
	            charge = units * 1;
	        } else if (units <= 100) {
	            charge = (50 * 1) + ((units - 50) * 2);
	        } else if (units <= 200) {
	            charge = (50 * 1) + (50 * 2) + ((units - 100) * 3);
	        } else if (units <= 400) {
	            charge = (50 * 1) + (50 * 2) + (100 * 3) + ((units - 200) * 4);
	        } else { // units > 400
	            charge = (50 * 1) + (50 * 2) + (100 * 3) + (200 * 4) + ((units - 400) * 5);
	        }
	        System.out.println("Electricity Bill Amount: Rs. " + charge);

		}
	}

}
