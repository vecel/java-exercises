package pl.edu.pw.mini.po.karandysm.task1b;

public abstract class Roslina extends ElementPodloza {
	
	protected double wysokosc;
	
	protected double losujWysokosc(double min, double max) {
		return ElementPodloza.random.nextDouble(min, max);
	}
	
}
