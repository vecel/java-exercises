package pl.edu.pw.mini.karandysm.przejsciegraniczne;

import java.util.List;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.karandysm.podrozny.Podrozny;
import pl.edu.pw.mini.karandysm.towary.Towar;
import pl.edu.pw.mini.karandysm.towary.TrefnyTowar;

public class Celnik {
	
	private static Random random = new Random();

	private Areszt areszt;
	private List<Podrozny> podrozniDoOdprawy;
	
	public Celnik(Areszt areszt, List<Podrozny> podrozniDoOdprawy) {
		this.areszt = areszt;
		this.podrozniDoOdprawy = podrozniDoOdprawy;
	}
	
	public boolean control(Podrozny podrozny) throws MalolatWAreszcieException {
		if (random.nextInt(10) < 2) {
			Set<Towar> towary = podrozny.getTowary();
			int wartoscCzarnorynkowa = 0;
			for (Towar towar : towary) {
				if (towar instanceof TrefnyTowar) {
					wartoscCzarnorynkowa += ((TrefnyTowar) towar).getWartoscCzarnorynkowa();
				}
			}
			
			if (wartoscCzarnorynkowa > 50000) {
				areszt.aresztuj(podrozny);
				return true;
			}
		}
		return false;
	}
}
