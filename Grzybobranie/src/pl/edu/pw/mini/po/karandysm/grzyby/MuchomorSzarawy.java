package pl.edu.pw.mini.po.karandysm.grzyby;

public class MuchomorSzarawy extends MuchomorTrujacy {

	private static int rokOdkryciaGatunku = 1783;
	
	public MuchomorSzarawy() {
		twardosc = losujTwardosc();
		toksyny = Toksyny.TRUJACE;
	}
	
	@Override
	public String toString() {
		return "MuchomorSzarawy(" + twardoscIMasaOwocnikaMsg() + toksynyMsg() + ")";	
	}
	
	@Override
	public void ugotuj() {
		super.ugotuj();
		toksyny = Toksyny.NIEOBECNE;
	}
}
