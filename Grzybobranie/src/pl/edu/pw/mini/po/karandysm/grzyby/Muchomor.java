package pl.edu.pw.mini.po.karandysm.grzyby;

import java.util.Random;

public abstract class Muchomor {
	
	protected Twardosc twardosc;
	protected int masaOwocnika;
	protected Random random = new Random();
	
	protected Twardosc losujTwardosc() {
		switch (random.nextInt(1, 4)) {
		case 1:
			return Twardosc.TWARDY;
		case 2:
			return Twardosc.MIEKKI;
		case 3:
			return Twardosc.SREDNIOTRWALY;
		default:
			return null;
		}
	}
	
	protected String twardoscIMasaOwocnikaMsg() {
		return "twardosc=" + twardosc + ", masaOwocnika=" + masaOwocnika;
	}
	
	public void ugotuj() {
		twardosc = Twardosc.MIEKKI;
	}
	
	public boolean isTrujacy() {
		return false;
	}
}
