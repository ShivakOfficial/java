import java.util.Scanner;

public class Soultion7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter n");
	int n=scan.nextInt();
	printEvenDivisibleBy3(n);
}
public static void printEvenDivisibleBy3(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	}
}
}
