package pl.edu.pw.mini.karandysm.przejsciegraniczne;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import pl.edu.pw.mini.karandysm.podrozny.Podrozny;

public class Areszt {

	private Set<Podrozny> aresztowaniPodrozni = new TreeSet<>(new Comparator<Podrozny>() {
		@Override
		public int compare(Podrozny o1, Podrozny o2) {
			if (o1.equals(o2))
				return 0;
			else if (o1.getWiek() < o2.getWiek())
				return -1;
			else
				return 1;
		}
	});
	
	public boolean aresztuj(Podrozny podrozny) throws MalolatWAreszcieException {
		if (podrozny.getWiek() < 18) {
			throw new MalolatWAreszcieException("Aresztowano osobe ponizej 18 roku zycia");
		}
		return aresztowaniPodrozni.add(podrozny);
	}
}
