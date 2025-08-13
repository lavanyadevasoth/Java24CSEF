package assignment_problems;
import java.util.Scanner;

public class Assignment1_powerbill {

	public static void main(String[] args) {
		System.out.print("enter number of units: ");
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		int bill_amount=0;
		if(units<=50) {
			bill_amount=units * 1;
		}
		else if(units<=100){
			bill_amount=(50 * 1)+((units - 50) * 2);
		}
		else if(units<=200) {
			bill_amount=(50*1)+(50*2)+((units-100)*3);
		}
		else if(units<=400) {
			bill_amount=(50*1)+(50*2)+(100*3)+((units-200)*4);
		}
		else{
			bill_amount=(50*1)+(50*2)+(100*3)+(200*4)+((units-400)*5);		
		}
		System.out.println("the bill amount is: "+ bill_amount);
		
		}
	

}
