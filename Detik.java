package Latihan3;

import java.util.Scanner;

public class Detik {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int detik;
		
		detik = inp.nextInt();
		
		Konversi waktu = new Konversi();
		waktu.konversi(detik);
	}
}
