package pl.edu.pw.mini.po.karandysm.task1b;

public class PrzeciwpiechotnaMina extends Mina {

	Obudowa obudowa;
	
	public PrzeciwpiechotnaMina() {
		super();
		losujObudowe();
		ustawEkologicznosc(obudowa == Obudowa.KARTON ? true : false);
	}
	
	private void losujObudowe() {
		Obudowa[] opcjeObudowy = Obudowa.values();
		obudowa = opcjeObudowy[ElementPodloza.random.nextInt(3)];
	}
	
	@Override
	public String toString() {
		return "x";
	}
	
	@Override
	public void pressMe() {
		if (isUzbrojona()) {
			System.out.println("Boom!");
		} else {
			super.pressMe();
		}
		
	}
	
}
