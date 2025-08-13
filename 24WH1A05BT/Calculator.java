import java.util.Scanner;
public class Calculator {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a = sc.nextInt();
		System.out.println("Enter number 2: ");
		int b = sc.nextInt();
		System.out.println("Options:\nADDITION: +\nSUBTRACTION: -\nMULTIPLICATION: *\nDIVISION: /");
		String choice = sc.next();
		switch(choice) {
		case "+": 
			System.out.println(a+" + "+b+" = "+(a+b));
			break;
		case "-":
			System.out.println(a+" - "+b+" = "+(a-b));
			break;
		case "*":
			System.out.println(a+" x "+b+" = "+(a*b));
			break;
		case "/":
			System.out.println(a+" / "+b+" = "+(a/b));
			break;
		default:
			System.out.println("INVALID INPUT");
		}
	}

}
