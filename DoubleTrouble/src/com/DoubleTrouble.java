package com;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		
	}
	public static int doubleTheNumber(int num){ 
		return num*2;
	}
}

