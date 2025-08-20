import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		int i,j;
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("Enter n value: ");
		n=scanner.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();	
		}

	}

}

