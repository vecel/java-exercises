package pl.edu.pw.mini.po.karandysm.grzyby;

public class MuchomorCesarski extends Muchomor {
	
	public MuchomorCesarski() {
		twardosc = Twardosc.TWARDY;
		masaOwocnika = random.nextInt(50, 76);
	}
	
	@Override
	public String toString() {
		return "MuchomorCesarski(" + twardoscIMasaOwocnikaMsg() + ")";
	}
}
