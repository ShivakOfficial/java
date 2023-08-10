import java.util.Scanner;

public class Solution5 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to print numbers divisible by 5 and 2");
	int n = scan.nextInt();
	displyDivisibleBy5and2(n);
}
public static void displyDivisibleBy5and2(int n)
{

	for(int i=0;i<=n;i++)
	{
		if(i%5==0 && i%2==0)
			System.out.println(i);
	}
	}
	
}

