package pl.edu.pw.mini.karandysm.przejsciegraniczne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import pl.edu.pw.mini.karandysm.podrozny.Podrozny;
import pl.edu.pw.mini.karandysm.podrozny.Przemytnik;
import pl.edu.pw.mini.karandysm.podrozny.Szpieg;
import pl.edu.pw.mini.karandysm.podrozny.Turysta;

public class PrzejscieGraniczne {

	private static Random random = new Random();

	private List<Podrozny> podrozniDoOdprawy = new LinkedList<>();
	private List<Celnik> celnicy = new ArrayList<>();
	private Areszt areszt = new Areszt();

	public PrzejscieGraniczne() {
		initPodrozni();
		initCelnicy();
	}

	private void initPodrozni() {
		for (int i = 0; i < 150; i++) {
			int los = random.nextInt(3);
			if (los == 0)
				podrozniDoOdprawy.add(new Turysta());
			else if (los == 1)
				podrozniDoOdprawy.add(new Szpieg());
			else
				podrozniDoOdprawy.add(new Przemytnik());
		}
	}

	private void initCelnicy() {
		for (int i = 0; i < 5; i++) {
			celnicy.add(new Celnik(areszt, podrozniDoOdprawy));
		}
	}

	public void doJob() {
		Iterator<Podrozny> it = podrozniDoOdprawy.iterator();

		while (it.hasNext()) {
			Podrozny podrozny = it.next();
			Celnik celnik = celnicy.get(random.nextInt(celnicy.size()));
			try {
				if (celnik.control(podrozny))
					it.remove();
			} catch (MalolatWAreszcieException e) {
				e.printStackTrace();
			}

		}

		System.out.println(podrozniDoOdprawy);
	}
}
