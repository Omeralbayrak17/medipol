package com.medipol;

import java.util.Scanner;

public class denklemlerOdev{
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		System.out.println("A de�erini giriniz ");
		double a = giris.nextInt();
		
		System.out.println("B de�erini giriniz ");
		double b = giris.nextInt();
		
		System.out.println("C de�erini giriniz ");
		double c = giris.nextInt();
		
		double delta = (b * b) - (4 * a * c);
		double x1, x2;
		
		if (delta > 0) {
			x1 = ((-1 * b ) - Math.sqrt(delta))  / (2 * a);
			x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
			System.out.printf("x1 = %f, x2 = %f",x1, x2);
		}
		else if (delta==0) {
			x1 = (-1 * b) / (2 * a);
			System.out.printf("�ak���k k�k� vard�r x1 = x2 = %f",x1);
		}
		else {
			System.out.println("Denklemin ger�el k�k� yoktur");
		}
	}
}
