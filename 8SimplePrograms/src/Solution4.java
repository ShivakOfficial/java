import java.util.Scanner;

public class Solution4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to print numbers divisible by 5");
	int n = scan.nextInt();
	displyDivisibleBy5(n);
}
public static void displyDivisibleBy5(int n)
{

	for(int i=0;i<=n;i++)
	{
		if(i%5==0)
			System.out.println(i);
	}
	}
	
}

