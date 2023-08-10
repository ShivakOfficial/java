import java.util.Scanner;

public class PalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int n=scan.nextInt();
		Palindrome palindrome=new Palindrome();
		int rev=palindrome.reverseNumber(n);
		System.out.println("Reverse Of Number "+n+" is "+rev);
		if(n==rev)
		{
			System.out.println("Entered Number "+n+" is palindrome ");
		}
		else
		{
			System.out.println("Entered Number "+n+" is Not palindrome ");

		}
	}
}
