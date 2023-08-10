import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number Of Sides To Identify the Shape");
		int sides=scan.nextInt();
		identifyPolygon(sides);
	}
	public static void identifyPolygon(int sides)
	{
		if(sides>0)
		{
		switch(sides)
		{
		
		case 2:System.out.println("LINE");
				break;
		
		case 3: System.out.println("Triangle");
				break;
		case 4: System.out.println("Quadrilateral");
				break;
		case 5: System.out.println("Pentagon");
				break;
		case 6: System.out.println("Hexagon");
				break; // Add more cases as needed
		default: System.out.println("Polygon");
				break;
		}
				
		}
		else
		{
			System.out.println("Either Your Math Skill or Your Eyes Is Not Good...");
		}
	}
	}


