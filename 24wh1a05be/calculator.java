package comsample;
import java.util.Scanner;
public class calci 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter a no1");
		int num1 = input.nextInt();
		System.out.println("enter a no 2");
		int num2= input.nextInt();
		System.out.println("1"+"is for addition");
		System.out.println("2"+"is for substraction");
		System.out.println("3"+"is for remainder");
		System.out.println("4"+"for division");
		System.out.println("5"+"multiplication");
		int n;
		System.out.println("enter any number");
		n=input.nextInt();
		switch(n)
		{
			case 1:
				System.out.println(num1+num2);
				break;
			case 2:
				System.out.println(num1-num2);
				break;
			case 3:
				System.out.println(num1%num2);
				break;
			case 4:
				if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero.");
                break;
			case 5:
				System.out.println(num1*num2);
				break;
			default:
	            System.out.println("other operation");        
				break;		
    	}
		input.close();
    }
}
