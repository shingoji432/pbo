package praktik4;

import java.util.Scanner;

public class Kondisional {
	public static void main(String[] args) {
		//input
		Scanner inp = new Scanner(System.in);
		String nim = inp.next();
		String nama = inp.next();
		float nilai = inp.nextFloat();
		
		//atribut
		char nHuruf = ' ';
		String predikat;
		
		//panggil method
		Nilai nl = new Nilai();
		nHuruf = nl.getNilHuruf(nilai);
		
		Nilai pr = new Nilai();
		predikat = pr.getPredikat(nHuruf);

		//cetak hasil
		System.out.println("NIM: "+nim);
		System.out.println("Nama: "+nama);
		System.out.println("Nilai: "+nilai);
		System.out.println("Nilai Huruf: "+nHuruf);
		System.out.println("Predikat: "+predikat);
	}
}
