package Latihan3;

public class Konversi {
	int hari, jam, menit;
	
	void konversi(int detik) {
		hari = detik / 86400;
		jam = (detik % 86400) / 3600;
		menit = (detik % 3600) / 60;
		detik = detik % 60;
		System.out.println("Hari: "+hari);
		System.out.println("Jam: "+jam);
		System.out.println("Menit: "+menit);
		System.out.println("Detik: "+detik);
	}
}
