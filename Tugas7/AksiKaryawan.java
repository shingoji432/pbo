package Tugas7;

import java.util.Scanner;

public class AksiKaryawan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tunjAnak = 500000;
		
		String nama = sc.nextLine();
		String status = sc.nextLine();
		int gajiPokok = sc.nextInt();
		
		/*
		int upahHarian = sc.nextInt();
		int jmlKehadiran = sc.nextInt();
		*/
		
		//Karyawan Tetap
		KaryawanTetap kt = new KaryawanTetap(nama, status, tunjAnak, gajiPokok);
		kt.hitungGaji();
		kt.cetak();
		
		//Karyawan Kontrak
		/*
		KaryawanKontrak kk = new KaryawanKontrak(nama, status, tunjAnak, upahHarian, jmlKehadiran);
		kk.totalUpah();
		kk.cetak();
		*/
	}
}
