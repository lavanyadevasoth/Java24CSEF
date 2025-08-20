package demo;

import java.util.Scanner;

public class calculator{
	public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the first number:");
    int number1 =scanner.nextInt();
	System.out.println("Enter the second number:");
    int number2 = scanner.nextInt();
    System.out.println("choice \n 1.addition\n 2.subtraction\n 3.Multiplication\n 4.Division");
    int choice = scanner.nextInt();
    switch(choice) 
    {
    case 1:
    	System.out.println("addition is:");
    	System.out.println(number1+number2);
    	break;
    case 2:
    	System.out.println("subtraction is:");
    	System.out.println(number1-number2);
    	break;
    case 3:
    	System.out.println("Multiplication is:");
    	System.out.println(number1*number2);
    	break;
    case 4:
    	System.out.println("Division is:");
    	System.out.println(number1/number2);
    	break;
    }
    return;
	}
}
