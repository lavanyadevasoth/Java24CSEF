package intro;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows;
		System.out.println("Enter number of row:");
		rows=sc.nextInt();
		sc.close();
		for(int i1=1;i1<=rows;i1++) {
			for(int j=i1;j<=rows;j++) {
				System.out.print(" ");
			}
		for(int j=1;j<=i1;j++) {
			System.out.print("* ");
		}
		System.out.println(" ");
		}
		for(int i=rows-1;i>=1;i--) {
			for(int j=rows;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
