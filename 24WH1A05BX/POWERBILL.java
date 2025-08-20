package demo;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		int units = scanner.nextInt();
		//int units = 120;
		int bill;
		if (units <=50 )
		{
			bill=units*1;
			System.out.println(bill);
		}
		else if(units <=100)
        {
			bill = (50*1)+((units-50)*2);
        	System.out.println(bill);
        }
		else if(units <= 200 )
        {
			bill = (50*1)+(50*2)+((units - 100)*3);
        	System.out.println(bill);
        }
		else if(units <=400)
	    {
			bill = (50*1)+(50*2)+(50*3)+((units-200)*4);
		    System.out.println(bill);
	    }
		else if(units>400)
	    {
			bill = (50*1)+(50*2)+(50*3)+(50*4)+((units-400)*5);
	    	System.out.println(bill);
	    }
}



}
