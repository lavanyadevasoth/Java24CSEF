package comsample;
import java.util.Scanner;
public class eveodd 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter nos");
		int n=input.nextInt();
		int even=0;
		int odd=0;
		int x;
		for(int i=0;i<n;i++)
		{
			System.out.printf("enter the numner %d  ",(i+1));
			x=input.nextInt();
			
			if(x%2==0)
			{
				even+=x;
			}else
			{
				odd+=x;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	input.close();
	}
}
