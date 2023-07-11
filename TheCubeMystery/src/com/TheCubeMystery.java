package com;

import java.util.Scanner;

public class TheCubeMystery {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=scan.nextInt();
	System.out.println(cubeNumber(num));
}
public static int cubeNumber(int num)
{
	return num*num*num;
}
}