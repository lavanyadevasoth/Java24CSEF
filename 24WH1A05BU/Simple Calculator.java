import java.util.Scanner;
public class simpleCalculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int number1,number2;
		String operator;
		System.out.println("Enter number 1: ");
		number1=scanner.nextInt();
		System.out.println("Enter number 2: ");
		number2=scanner.nextInt();
		System.out.println("Enter the operator: ");
		operator=scanner.next();
		scanner.close();
		switch(operator) {
		
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
			
		}

	}

}
