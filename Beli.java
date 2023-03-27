package Latihan1;

import java.util.Scanner;

public class Beli {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String kode = inp.next();
		String nama = inp.next();
		float harga = inp.nextFloat();
		int jumlah = inp.nextInt();
		String bonus;
		
		Penjualan pl = new Penjualan();
		bonus = pl.getBonus(harga, jumlah);
		
		System.out.println("Kode: "+kode);
		System.out.println("Nama: "+nama);
		System.out.println("Harga: Rp."+harga);
		System.out.println("Jumlah: "+jumlah);
		System.out.println("Bonus: "+bonus);
	}
}
