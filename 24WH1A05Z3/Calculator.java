package assignment_problems;

import java.util.Scanner;

public class Assignment2_calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select the operators\n1.addition\n2.subbtraction\n3.multiplication\n4.division");
		int operator=sc.nextInt();
		System.out.print("enter the first number: ");
		int n1=sc.nextInt();
		System.out.print("enter the second number: ");
		int n2=sc.nextInt();
		switch(operator)
		{
			case 1:System.out.printf("the sum of %d and %d: %d", n1,n2,n1+n2);
			break;
			case 2:System.out.printf("the difference of %d and %d: %d", n1,n2,n1-n2);
			break;
			case 3:System.out.printf("the multiplication of %d and %d: %d", n1,n2,n1*n2);
			break;
			case 4:
			if(n2!=0) {
				System.out.printf("the quotient of %d and %d: %d", n1,n2,n1*n2);
			}
			else {
				System.out.println("division by 0 is not possible");
			}
		}
		sc.close();
	}

}
