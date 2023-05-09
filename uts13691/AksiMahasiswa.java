package uts13691;

import java.util.Scanner;
import java.util.ArrayList;

public class AksiMahasiswa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Masukkan Nama: ");
		String nama = sc.nextLine();
		System.out.println("Masukkan NIM: ");
		String nim = sc.nextLine();
		System.out.println("Masukkan Usia: ");
		int usia = sc.nextInt();
		System.out.println("Masukkan Semester: ");
		int semester = sc.nextInt();
		System.out.println("Jumlah Mata Kuliah: ");
		int mk = sc.nextInt();
		System.out.println("Masukkan KRS: ");
		String[] krs = new String[mk];
		if(mk != 0) {
			for (int i = 0; i < mk; i++) {
				krs[i] = sc.nextLine();
			}
		}
		
		System.out.println("Masukkan Status Kemahasiswaan: ");
		System.out.println("1. Aktif");
		System.out.println("2. Baru");
		System.out.println("3. Transfer");
		System.out.println("4. Lulus");
		int status = sc.nextInt();
		
		ArrayList<Object> Mahasiswa = new ArrayList<Object>();
		Mahasiswa.add(nama);
		Mahasiswa.add(nim);
		Mahasiswa.add(usia);
		Mahasiswa.add(semester);
		Mahasiswa.add(krs);
		switch(status) {
		case 1:
			int[] nilai = new int[mk];
			System.out.println("Daftar Nilai: ");
			for(int j = 0; j < mk; j++) {
				nilai[j] = sc.nextInt();
			}
			MahasiswaAktif mhsA = new MahasiswaAktif(nim, nama, krs, usia, semester);
			mhsA.infoMahasiswa();
			mhsA.infoKrsMahasiswa();
			System.out.println("Rata-rata Nilai: "+mhsA.hitungRataNilai(nilai));
			break;
		case 2:
			String asalSekolah = sc.nextLine();
			MahasiswaBaru mhsB = new MahasiswaBaru(nim, nama, krs, usia, semester, asalSekolah);
			mhsB.infoMahasiswa();
			mhsB.ikutOspek();
			break;
		case 3:
			System.out.println("Sekolah Asal: ");
			String asalSekolahLama = sc.nextLine();
			System.out.println("Universitas Asal: ");
			String asalUni = sc.nextLine();
			MahasiswaTransfer mhsT = new MahasiswaTransfer(nim, nama, krs, usia, semester, asalSekolahLama, asalUni);
			mhsT.infoMahasiswa();
			mhsT.ikutOspek();
			break;
		case 4:
			System.out.println("Tahun Kelulusan: ");
			int tahunLulus = sc.nextInt();
			System.out.println("Total IPK: ");
			float ipk = sc.nextFloat();
			MahasiswaLulus mhsL = new MahasiswaLulus(nim, nama, krs, usia, semester, tahunLulus, ipk);
			mhsL.infoMahasiswa();
			mhsL.ikutWisuda();
			break;
		default:
			System.out.println("Input Invalid");
		}
	}
}
