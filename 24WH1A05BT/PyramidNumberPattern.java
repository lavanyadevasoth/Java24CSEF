import java.util.Scanner;
public class Pattern4 {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k < 2*i; k++) {
				System.out.print(num+" ");
				if (k < i) {
					num++;
				}
				else {
					num--;
				}
			}
			num = 1;
			System.out.println();
		}
	}
}
