import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character to check for digit or vowel or consonent");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}
	
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Entered Character "+ch+" Is Digit...");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("Entered Character "+ch+" Is Special Character");
		}
		else
		{
			switch (Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					if(Character.isLowerCase(ch))
					{
						System.out.println("Entered Character "+ch+" Is Lower Case Vowel");
					}
					else
					{
						System.out.println("Entered Character "+ch+"Is Upper Case Vowel");
					}
				break;

			default:
				if(Character.isLowerCase(ch))
				{
				System.out.println("Entered Character "+ch+" Is Lower Case Consonent");
				}
				else
				{
					System.out.println("Entered Character "+ch+" is Upper case Consonent");
				}
			}
		}
	}

}
