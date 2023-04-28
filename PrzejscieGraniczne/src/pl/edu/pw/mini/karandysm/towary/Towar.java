package pl.edu.pw.mini.karandysm.towary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Towar {
	
	private static final List<String> dostepneTowary = new ArrayList<>(6) {
		{
			add("Woda");
			add("Kanapka");
			add("Laptop");
			add("Zasilacz");
			add("Mysz");
			add("Ksiazka");
		}
	};
	protected static final Random random = new Random();
	
	private String nazwa;
	
	public Towar() {
		losujTowar();
	}
	
	protected void losujTowar() {
		int rozmiar = dostepneTowary.size();
		nazwa = dostepneTowary.get(random.nextInt(rozmiar));
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

//	public String getNazwa() {
//		return nazwa;
//	}
	
	

}
