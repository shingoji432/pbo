package uts13691;

public class MahasiswaBaru extends Mahasiswa{
	String asalSekolah;
	
	public MahasiswaBaru(String nim, String nama, String krs[], int usia, int semester, String asalSekolah) {
		super(nim, nama, krs, usia, semester);
		this.asalSekolah = asalSekolah;
	}
	
	public void infoMahasiswa() {
		super.infoMahasiswa();
		System.out.println("Sekolah Asal: "+asalSekolah);
	}
	
	boolean ikutOspek() {
		return true;
	}
}
