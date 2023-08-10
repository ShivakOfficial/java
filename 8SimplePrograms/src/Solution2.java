import java.util.Scanner;

public class Solution2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to print numbers divisible by 2");
	int n = scan.nextInt();
	diplayEven(n);
	
}
public static void diplayEven(int n)
{
	for(int i=0;i<=n;i++)
	{
		if(i%2==0)
			System.out.println(i);
	}
	}
	
}
