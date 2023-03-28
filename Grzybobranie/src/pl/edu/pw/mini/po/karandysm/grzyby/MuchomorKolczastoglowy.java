package pl.edu.pw.mini.po.karandysm.grzyby;

public class MuchomorKolczastoglowy extends Muchomor {

	public MuchomorKolczastoglowy() {
		twardosc = losujTwardosc();
		masaOwocnika = random.nextInt(25, 51);
	}

	@Override
	public String toString() {
		return "MuchomorKolczastoglowy(" + twardoscIMasaOwocnikaMsg() + ")";
	}
}
