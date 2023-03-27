package Latihan1;

public class Penjualan {
	String bonus;
	
	String getBonus(float harga, int jumlah) {
		if(harga >= 500000 && jumlah > 5) {
			bonus = "Setrika";
		} else if(harga >= 100000 && jumlah > 3) {
			bonus = "Payung";
		} else if(harga >= 50000 && jumlah > 2) {
			bonus = "Ballpoint";
		} else {
			bonus = "Tidak ada";
		}
		return bonus;
	}
}
