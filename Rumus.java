package Latihan2;

import java.lang.Math;

public class Rumus {
	double x, y, d;
	
	void abc(double a, double b, double c) {
		d = (b * b) - (4 * a * c);
		if(d > 0) {
			x = (-b + Math.sqrt(d)) / 2 * a;
			y = (-b - Math.sqrt(d)) / 2 * a;
		} else if (d == 0) {
			x = -b / (2 * a);
			y = -b / (2 * a);
		} else if (d < 0) {
			x = (-b / 2 * a) + (Math.sqrt(-d) / 2 * a);
			y = (-b / 2 * a) - (Math.sqrt(-d) / 2 * a);
		}
		System.out.println("X1 = "+x);
		System.out.println("X2 = "+y);
	}
}
