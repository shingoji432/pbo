package Tugas7;

public class Karyawan {
	String nama, status;
	int tunjAnak;
	
	public Karyawan(String nama, String status, int tunjAnak) {
		this.nama = nama;
		this.status = status;
		this.tunjAnak = tunjAnak;
	}
	
    void cetak() {
    	System.out.println("Nama: "+nama);
		System.out.println("Status Kepegawaian: "+status);
    }
}
