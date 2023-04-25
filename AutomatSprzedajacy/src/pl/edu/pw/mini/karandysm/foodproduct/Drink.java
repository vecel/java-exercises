package pl.edu.pw.mini.karandysm.foodproduct;

public class Drink extends FoodProduct {

	private static final double DENSITY = 0.95;
	private int volume;
	
	public Drink() {
		setRandomPercentageSugarContent(8, 12);
		setRandomVolume(100, 250);
	}
	
	@Override
	public double getSugarContent() {
		return DENSITY * volume * getPercentageSugarContent() / 100.0;
	}

	private void setRandomVolume(int min, int max) {
		volume = random.nextInt(min, max + 1);
	}

	@Override
	public String toString() {
		return "Drink [volume=" + volume + "]";
	}
	
	
}
