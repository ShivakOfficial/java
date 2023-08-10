import java.util.Scanner;

public class Solutin3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to print numbers divisible by 3");
	int n = scan.nextInt();
	displyDivisibleBy3(n);
}
public static void displyDivisibleBy3(int n)
{

	for(int i=0;i<=n;i++)
	{
		if(i%3==0)
			System.out.println(i);
	}
	}
	
}

