package pl.edu.pw.mini.po.karandysm.task1b;

public class PrzeciwczolgowaMina extends Mina{

	private double masaLadunkuWybuchowego;
	
	public PrzeciwczolgowaMina() {
		super();
		ustawEkologicznosc(false);
		masaLadunkuWybuchowego = ElementPodloza.random.nextDouble(1.5, 2.5);
	}
	
	@Override
	public String toString() {
		return "X";
	}
	
	@Override
	public void pressMe() {
		if (isUzbrojona()) {
			System.out.println("KABOOM!");
		} else {			
			super.pressMe();
		}
	}
}
