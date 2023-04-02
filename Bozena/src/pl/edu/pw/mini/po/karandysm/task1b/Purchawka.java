package pl.edu.pw.mini.po.karandysm.task1b;

public class Purchawka extends Roslina {
	
	public Purchawka() {
		losujWysokosc(3.5, 7.5);
		ustawEkologicznosc(ElementPodloza.random.nextBoolean());
	}
	
	@Override
	public String toString() {
		return "o";
	}

	@Override
	public void pressMe() {
		System.out.println("Pufff");
	}
	
	
}
