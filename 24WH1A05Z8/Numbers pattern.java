package JavaPrograms;

public class pattern2 {

	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
				}
			for (int j = 2; j <= i; j++) 
			{
				System.out.print(j);
				}
			System.out.println();
		}
	}
}
