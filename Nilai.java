package praktik4;

public class Nilai {
	//atribut
	char nHuruf = ' ';
	String predikat;
	
	//method
	//cari nilai huruf
	char getNilHuruf(float nilai) {
		if(nilai >= 85) {
			nHuruf = 'A';
		} else if (nilai >= 70) {
			nHuruf = 'B';
		} else if (nilai >= 60){
			nHuruf = 'C';
		} else if (nilai >= 40) {
			nHuruf = 'D';
		} else {
			nHuruf = 'E';
		}
		return nHuruf;
	}
	
	//cari predikat
	String getPredikat(char huruf) {
		switch(huruf)
		{
			case 'A':predikat="Sangat Baik";
					 break;
			case 'B':predikat="Baik";
					 break;
			case 'C':predikat="Cukup";
					 break;
			case 'D':predikat="Kurang";
					 break;
			case 'E':predikat="Gagal";
					 break;
		}
		return predikat;
	}
}
