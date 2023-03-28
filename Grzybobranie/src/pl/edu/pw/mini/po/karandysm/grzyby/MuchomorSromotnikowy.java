package pl.edu.pw.mini.po.karandysm.grzyby;

public class MuchomorSromotnikowy extends MuchomorTrujacy {

	public MuchomorSromotnikowy() {
		super();
		if (masaOwocnika < 50) 
			toksyny = Toksyny.ZABOJCZE;
		else 
			toksyny = Toksyny.WYJATJOWO_ZABOJCZE;
		twardosc = losujTwardosc();
	}
	
	@Override
	public String toString() {
		return "MuchomorSromotnikowy(" + twardoscIMasaOwocnikaMsg() + toksynyMsg() + ")";
	}
}
