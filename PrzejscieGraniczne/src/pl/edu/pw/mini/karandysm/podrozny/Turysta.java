package pl.edu.pw.mini.karandysm.podrozny;

import pl.edu.pw.mini.karandysm.towary.Towar;
import pl.edu.pw.mini.karandysm.towary.TrefnyTowar;

public class Turysta extends Podrozny {

	public Turysta() {
		super();
		losujWiek(14, 60);
	}

	@Override
	protected void generujTowary() {
		int liczbaTowarow = random.nextInt(10, 21);
		for (int i = 0; i < liczbaTowarow; i++) {
			if (random.nextInt(10) > 0) {
				dodajTowar(new Towar());
			} else {
				dodajTowar(new TrefnyTowar());
			}
		}
	}
	
	@Override
	public String toString() {
		return "Turysta";
	}
	
}
