package com;
import java.util.Scanner;
public class SemesterMarksAverager 
{
	

	

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter All eight sem marks ");
			int sem1=scan.nextInt();
			int sem2=scan.nextInt();
			int sem3=scan.nextInt();
			int sem4=scan.nextInt();
			int sem5=scan.nextInt();
			int sem6=scan.nextInt();
			int sem7=scan.nextInt();
			int sem8=scan.nextInt();
			System.out.printf("%.2f",SemesterMarksAveragerApp .calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8));
			scan.close();
		}

	}


