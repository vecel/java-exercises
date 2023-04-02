package pl.edu.pw.mini.po.karandysm.task1b.bozena;

import java.util.Random;

import pl.edu.pw.mini.po.karandysm.task1b.ElementPodloza;
import pl.edu.pw.mini.po.karandysm.task1b.pole.Podloze;

public class Bozena implements Destroyable {
	
	private static Random random = new Random();
	private Podloze podloze;
	
	public Bozena(Podloze podloze) {
		this.podloze = podloze;
	}

	@Override
	public void destroyMines() {
		int wiersz = random.nextInt(podloze.getLength());
		for (int i = 0; i < podloze.getLength(); i++) {
			ElementPodloza elementPodloze = podloze.getElement(wiersz, i);
			if (elementPodloze != null) {
				elementPodloze.pressMe();
				elementPodloze = null;
			}
		}
	}
	
	
}
