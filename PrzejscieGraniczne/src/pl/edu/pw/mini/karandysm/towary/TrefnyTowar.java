package pl.edu.pw.mini.karandysm.towary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrefnyTowar extends Towar {

	private static final Map<String, ArrayList<Integer>> dostepneTrefneTowary = new HashMap<>() {
		{
			put("Bron", new ArrayList<>(Arrays.asList(15000, 12000)));
			put("Alkohol bez banderoli", new ArrayList<>(Arrays.asList(700, 750, 800)));
			put("Bursztyn", new ArrayList<>(Arrays.asList(3500)));
			put("Lopatka wieprzowa", new ArrayList<>(Arrays.asList(1450, 1350)));
		}
	};
	private static final List<String> dostepneTrefneNazwy = new ArrayList<>(dostepneTrefneTowary.keySet());
	
	private int wartoscCzarnorynkowa;

	public TrefnyTowar() {
		super();
	}

	@Override
	protected void losujTowar() {
		String klucz = dostepneTrefneNazwy.get(random.nextInt(dostepneTrefneNazwy.size()));
		setNazwa(klucz);
		List<Integer> wartosci = dostepneTrefneTowary.get(klucz);
		wartoscCzarnorynkowa = wartosci.get(random.nextInt(wartosci.size()));
	}

	public void printMe() {
		System.out.println(dostepneTrefneNazwy);
	}

	public int getWartoscCzarnorynkowa() {
		return wartoscCzarnorynkowa;
	}

//	@Override
//	public String toString() {
//		return "TrefnyTowar [nazwa=" + getNazwa() + " wartoscCzarnorynkowa=" + wartoscCzarnorynkowa + "]";
//	}
	
	

}
