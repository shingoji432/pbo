package uts13691;

public class MahasiswaLulus extends Mahasiswa{
	int tahunLulus;
	float ipk;
	
	public MahasiswaLulus(String nim, String nama, String krs[], int usia, int semester, int tahunLulus, float ipk) {
		super(nim, nama, krs, usia, semester);
		this.tahunLulus = tahunLulus;
		this.ipk = ipk;
	}
	
	public void infoMahasiswa() {
		super.infoMahasiswa();
		System.out.println("Tahun Kelulusan: "+tahunLulus);
		System.out.println("IPK Terakhir: "+ipk);
	}
	
	boolean ikutWisuda() {
		return true;
	}
}
