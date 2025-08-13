package intro;

import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number1, number2;
		String operation;
		System.out.println("Enter the number1:");
		number1=scanner.nextInt();
		System.out.println("Enter the number2");
		number2=scanner.nextInt();
		System.out.println("Enter the operation: '+' ; '-' ; '*' ; '/' ; '%'");
		operation=scanner.next();
		scanner.close();
		switch(operation) {
		case "+": 
			System.out.println(number1+number2);
			break;
		case "-":
			System.out.println(number1-number2);
			break;
		case "*":
			System.out.println(number1*number2);
			break;
		case "/":
			System.out.println(number1/number2);
			break;
		case "%":
			System.out.println(number1%number2);
			break;
		default: 
			System.out.println("Invalid operation");
			break;
		}
	}
}
