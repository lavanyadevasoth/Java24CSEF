import java.util.Scanner;
public class ElectricityBill {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the readings:");
		int reading = sc.nextInt();
		if (reading < 50) {
			System.out.println("Electricity Bill: "+(reading*1)+" Rs");
		}
		else if (reading > 50 && reading < 100) {
			System.out.println("Electricity Bill: "+(50*1 + (reading-50)*2)+" Rs");
		}
		else if (reading > 100 && reading < 200) {
			System.out.println("Electricity Bill: "+(50*1 + 50*2 + (reading-100)*3)+" Rs");
		}
		else if (reading > 200 && reading < 400) {
			System.out.println("Electricity Bill: "+(50*1 + 50*2 + 100*3 + (reading-200)*4)+" Rs");
		}
		else if (reading > 400) {
			System.out.println("Electricity Bill: "+(50*1 + 50*2 + 100*3 + 200*4 + (reading-400)*5)+" Rs");
		}
	}

}
