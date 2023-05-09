package uts13691;

public class Mahasiswa {
	String nim, nama, krs[];
	int usia, semester;
	
	
	public Mahasiswa(String nim, String nama,String[] krs, int usia, int semester) {
		this.nim = nim;
		this.nama = nama;
		this.usia = usia;
		this.semester = semester;
		this.krs = krs;
	}
	
	public void infoMahasiswa() {
		System.out.println("NIM: "+nim);
		System.out.println("Nama: "+nama);
		System.out.println("Usia: "+usia);
		System.out.println("Semester: "+semester);
	}
	
	public void infoKrsMahasiswa() {
		System.out.println("Daftar KRS");
		
		for(int i = 0; i < krs.length; i++) {
			System.out.println(krs[i]);
		}
	}
	
	float hitungRataNilai(int[] nilai) {
		int length = nilai.length;
		int sum = 0;
		for(int i = 0; i < nilai.length; i++) {
			sum += nilai[i];
		}
		float avg = sum / length;
		return avg;
	}
}
