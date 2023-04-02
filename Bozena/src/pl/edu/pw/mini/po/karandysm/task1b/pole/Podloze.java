package pl.edu.pw.mini.po.karandysm.task1b.pole;

import java.util.Random;

import pl.edu.pw.mini.po.karandysm.task1b.ElementPodloza;
import pl.edu.pw.mini.po.karandysm.task1b.Mina;
import pl.edu.pw.mini.po.karandysm.task1b.PrzeciwczolgowaMina;
import pl.edu.pw.mini.po.karandysm.task1b.PrzeciwpiechotnaMina;
import pl.edu.pw.mini.po.karandysm.task1b.Purchawka;
import pl.edu.pw.mini.po.karandysm.task1b.Trawa;

public class Podloze {

	private static Random random = new Random();
	private ElementPodloza[][] podloze;

	public Podloze() {
		initPodloze();
	}

	private void initPodloze() {
		podloze = new ElementPodloza[100][100];
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (random.nextInt(10) < 4)
					wstawElementPodloza(i, j);
			}
		}
	}

	private void wstawElementPodloza(int i, int j) {
		int typElementu = random.nextInt(4);
		switch (typElementu) {
		case 0:
			podloze[i][j] = new PrzeciwpiechotnaMina();
			break;
		case 1:
			podloze[i][j] = new PrzeciwczolgowaMina();
			break;
		case 2:
			podloze[i][j] = new Trawa();
			break;
		case 3:
			podloze[i][j] = new Purchawka();
			break;
		}
		
		if (typElementu <= 1) {
			boolean czyUzbrojona = random.nextInt(10) < 9;
			if (czyUzbrojona) {
				((Mina) podloze[i][j]).armMe();
			}
		}
	}
	
	public int getLength() {
		return 100;
	}
	
	public ElementPodloza getElement(int i, int j) {
		return podloze[i][j];
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				result += (podloze[i][j] != null ? podloze[i][j].toString() : " ");
			}
			result += "\n";
		}
		return result;
	}

}
