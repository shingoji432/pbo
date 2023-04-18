package Tugas7;

public class KaryawanKontrak extends Karyawan{
	int upahHarian, jmlKehadiran, totalBayaran;
	
	public KaryawanKontrak(String nama, String status, int tunjAnak, int upahHarian, int jmlKehadiran) {
		super(nama, status, tunjAnak);
		this.upahHarian = upahHarian;
		this.jmlKehadiran = jmlKehadiran;
	}
	
	void totalUpah() {
		totalBayaran = upahHarian * jmlKehadiran + tunjAnak;
	}
	
	void cetak() {
		super.cetak();
		System.out.println("Upah harian: Rp "+upahHarian);
		System.out.println("Jumlah hari masuk: "+jmlKehadiran);
		System.out.println("Total upah: Rp "+totalBayaran);
	}
}
