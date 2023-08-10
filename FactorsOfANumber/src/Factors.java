import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check for prime ");
		int n=scan.nextInt();
	
		if(n<2)
		{
			System.out.println("Entered number "+n+" is not prime");
		}
		else 
		{
			boolean isPrime=true;
			for (int i = 2; i*i<=n; i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
		
			if(isPrime==true)
			{
				System.out.println("Entered Number "+n+" is Prime");
			}
			else
			{
				System.out.println("Entered Number "+n+" is not prime");
			}
		}
	}
}
