package Tugas7;

public class KaryawanTetap extends Karyawan{
	int gajiPokok, totalGaji;
	
	public KaryawanTetap(String nama, String status, int tunjAnak, int gajiPokok) {
		super(nama, status, tunjAnak);
		this.gajiPokok = gajiPokok;
	}
	
	void hitungGaji() {
		totalGaji = gajiPokok + tunjAnak;
	}
	
	public void cetak() {
		super.cetak();
		System.out.println("Gaji Pokok: Rp "+gajiPokok);
		System.out.println("Total Gaji: Rp "+totalGaji);
	}
}
