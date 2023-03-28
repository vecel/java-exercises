package pl.edu.pw.mini.po.karandysm.grzyby;

public class MuchomorTrujacy extends Muchomor {

	protected Toksyny toksyny;

	public MuchomorTrujacy() {
		masaOwocnika = random.nextInt(25, 76);
	}
	
	protected String toksynyMsg() {
		return ", toksyny=" + toksyny;
	}

	@Override
	public boolean isTrujacy() {
		if (toksyny != Toksyny.NIEOBECNE)
			return true;
		return false;
	}
}
