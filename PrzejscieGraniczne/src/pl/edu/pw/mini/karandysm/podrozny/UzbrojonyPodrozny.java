package pl.edu.pw.mini.karandysm.podrozny;

public abstract class UzbrojonyPodrozny extends Podrozny {
	
	private boolean uzbrojony;
	
	public UzbrojonyPodrozny() {
		super();
		losujWiek(35, 75);
		losujUzbrojonosc();
	}
	
	private void losujUzbrojonosc() {
		uzbrojony = random.nextBoolean();
	}
}
