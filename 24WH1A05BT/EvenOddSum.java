import java.util.Scanner;
public class EvenOddSum {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number of integers:");
		int n = sc.nextInt();
		int Even = 0, Odd = 0;
		for (int i = 0; i < n; i++ ) {
			System.out.println("Enter number "+(i+1)+":");
			int x = sc.nextInt();
			if (x % 2 == 0) {
				Even += x;
			}
			else {
				Odd += x;
			}
		}
		System.out.println("Sum of Even numbers: "+Even);
		System.out.println("Sum of Odd numbers: "+Odd);

	}

}
