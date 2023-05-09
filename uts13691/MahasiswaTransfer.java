package uts13691;

public class MahasiswaTransfer extends MahasiswaBaru{
	String asalUniversitas;
	public MahasiswaTransfer(String nim, String nama, String krs[], int usia, int semester, String asalSekolah, String asalUniversitas) {
		super(nim, nama, krs, usia, semester, asalSekolah);
		this.asalUniversitas = asalUniversitas;
	}
	
	public void infoMahasiswa() {
		super.infoMahasiswa();
		System.out.println("Universitas asal: "+asalUniversitas);
	}
	
	boolean ikutOspek() {
		return false;
	}
}
