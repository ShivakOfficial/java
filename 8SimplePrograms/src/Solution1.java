import java.util.Scanner;

public class Solution1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number greater than 100");
	int n=scan.nextInt();
	if(n>100)
	{
		printNumbers(n);
	}
	else
	{
		System.out.println("Please reeun and enter a number greater than 100");
	}
	
}
public static void printNumbers(int n)
{
	for(int i=1;i<=n;i++)
	{
		System.out.println(i);
	}
}
}
