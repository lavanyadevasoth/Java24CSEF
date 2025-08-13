import java.util.*;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Old Reading:");
		int oldReading=sc.nextInt();
		System.out.println("Enter Current Reading:");
		int curReading=sc.nextInt();
		int unitsConsumed=curReading-oldReading;
		double totalBill=0;
		if(unitsConsumed<0) {
			System.out.println("Error");
		}else if(unitsConsumed<=50) {
			totalBill=unitsConsumed*1;
		}else if(unitsConsumed<=100) {
			totalBill=(50*1)+((unitsConsumed-50)*2);
		}else if(unitsConsumed<=200) {
			totalBill=(50*1)+(50*2)+((unitsConsumed-100)*3);
		}else if(unitsConsumed<=400) {
			totalBill=(50*1)+(50*2)+(100*3)+((unitsConsumed-200)*4);
		}else {
			totalBill=(50*1)+(50*2)+(100*3)+(200*4)+((unitsConsumed-400)*5);
		}
		System.out.println("**Electricity Bill**");
		System.out.println("Units Consumed:"+unitsConsumed);
		System.out.println("Total Bill:"+totalBill);
		sc.close();
	}
	
}
