package Latihan2;

import java.util.Scanner;

public class Determinan {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		double a, b, c;
		
		System.out.printf("a = ");
		a = inp.nextDouble();
		System.out.printf("b = ");
		b = inp.nextDouble();
		System.out.printf("c = ");
		c = inp.nextDouble();
		
		Rumus hasil = new Rumus();
		hasil.abc(a, b, c);
	}
}
