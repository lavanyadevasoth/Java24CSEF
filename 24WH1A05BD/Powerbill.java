package add;
import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter old reading:");
		int n1=scanner.nextInt();
		System.out.println("enter current reading:");
		int n2=scanner.nextInt();
		
		int units=n2-n1;
		double bill=0;
		
		if (units<=50) {
			bill=units*1;
		}
		else if (units<=100) {
			bill=(50*1)+(units-50)*2;
		}
		else if (units<=200) {
			bill=(50*1)+(50*2)+(units-100)*3;
		}
		else if (units<=400) {
			bill=(50*1)+(50*2)+(100*3)+(units-200)*4;
		}
		else {
			bill=(50*1)+(50*2)+(100*3)+(200*4)+(units-400)*5;
		}
        System.out.println("total units:"+units);
        System.out.println("total bill:"+bill); 
	}

}  
