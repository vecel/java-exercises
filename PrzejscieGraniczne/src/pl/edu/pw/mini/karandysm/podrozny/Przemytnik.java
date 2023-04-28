package pl.edu.pw.mini.karandysm.podrozny;

import pl.edu.pw.mini.karandysm.towary.Towar;
import pl.edu.pw.mini.karandysm.towary.TrefnyTowar;

public class Przemytnik extends UzbrojonyPodrozny {

	public Przemytnik() {
		super();
	}

	@Override
	protected void generujTowary() {
		int liczbaTowarow = random.nextInt(31);
		for (int i = 0; i < liczbaTowarow; i++) {
			if (random.nextInt(10) < 5) {
				dodajTowar(new TrefnyTowar());
			} else {
				dodajTowar(new Towar());
			}
		}
	}
	
	@Override
	public String toString() {
		return "Przemytnik";
	}
}
