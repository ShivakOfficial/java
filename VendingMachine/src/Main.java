import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Product Code");
		String code=scan.next();
		getProduct(code);
	}
	
	public static void getProduct(String productCode) 
	{ 
		switch(productCode)
		{
		case "p01":System.out.println("COCA COLA");
		break;
		case "p02":System.out.println("THUMPS UP");
		break;
		case "p03":System.out.println("Sprite");
		break;
		default:System.out.println("BINDU JAL JEERA....");
		}
	}
		

	}  


