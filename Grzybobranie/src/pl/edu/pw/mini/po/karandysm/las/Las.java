package pl.edu.pw.mini.po.karandysm.las;

import java.util.Random;

import pl.edu.pw.mini.po.karandysm.grzyby.Muchomor;
import pl.edu.pw.mini.po.karandysm.grzyby.MuchomorCesarski;
import pl.edu.pw.mini.po.karandysm.grzyby.MuchomorKolczastoglowy;
import pl.edu.pw.mini.po.karandysm.grzyby.MuchomorSromotnikowy;
import pl.edu.pw.mini.po.karandysm.grzyby.MuchomorSzarawy;

public class Las {

	private Muchomor[][] las;
	private Random random = new Random();

	public Las(int x, int y) {
		if (x <= 0)
			x = 100;
		if (y <= 0)
			y = 100;
		las = new Muchomor[y][x];
		int pustaKolumna = random.nextInt(x + 1);
		boolean czyGrzybUrosnie;
		for (int i = 0; i < y; ++i) {
			for (int j = 0; j < x; j++) {
				if (j == pustaKolumna)
					continue;
				if (random.nextInt(5) == 0)
					wyrosnijGrzyba(i, j);
			}
		}
	}
	
	public Muchomor getMuchomor() {
		int x = random.nextInt(las[0].length);
		int y = random.nextInt(las.length);
		
		Muchomor muchomor = las[y][x];
		las[y][x] = null;
		return muchomor;
	}
	
	public void print() {
		char c;
		for (int i = 0; i < las.length; ++i) {
			for (int j = 0; j < las[0].length; j++) {
				if (las[i][j] == null) 
					c = ' ';
				else
					c = '#';
				System.out.print(c);
			}
			System.out.print("\n");
		}
	}

	private void wyrosnijGrzyba(int i, int j) {
		int gatunek = random.nextInt(4);
		switch (gatunek) {
		case 0:
			las[i][j] = new MuchomorCesarski();
			break;
		case 1:
			las[i][j] = new MuchomorKolczastoglowy();
			break;
		case 2:
			las[i][j] = new MuchomorSzarawy();
			break;
		case 3:
			las[i][j] = new MuchomorSromotnikowy();
			break;
		}
	}

}
