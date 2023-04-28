package pl.edu.pw.mini.karandysm.podrozny;

import pl.edu.pw.mini.karandysm.towary.Towar;

public class Szpieg extends UzbrojonyPodrozny {
	
	public Szpieg() {
		super();
	}

	@Override
	protected void generujTowary() {
		int liczbaTowarow = random.nextInt(2, 4);
		for (int i = 0; i < liczbaTowarow; i++) 
			dodajTowar(new Towar());
	}
	
	@Override
	public String toString() {
		return "Szpieg";
	}
}
