package demo;

import java.util.Scanner;

public class sumintegers {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the count of integers:");
		int count=scanner.nextInt();
		int evensum=0;
		int oddsum=0;
		System.out.println("Enter" + count + "integers");
		for (int i = 0; i < count; i++) 
		{
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num % 2 == 0)
            {
                evensum += num;
            }
            else
            {
                oddsum += num;          
            }
        }

        System.out.println("Sum of even integers: " + evensum);
        System.out.println("Sum of odd integers: " + oddsum);

        scanner.close(); 
        }
	}
