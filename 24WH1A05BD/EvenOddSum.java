package add;
import java.util.Scanner;
public class ass3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of integer:");
        int n=scanner.nextInt();
        
        int oddsum=0;
        int evensum=0;
        
        for(int i=1;i<=n;i++) {
            if (i%2==0) {
            	evensum+=i;
            }
            else {
            	oddsum+=i;
            }
        }
        System.out.println("sum of even numbers:"+evensum);
        System.out.println("sum of odd numbers:"+oddsum);
        scanner.close();
	}

}
