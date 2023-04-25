package pl.edu.pw.mini.karandysm.foodproduct;

public abstract class Sweet extends FoodProduct {
	
	private int mass;

	public Sweet() {
		setRandomMass(20, 50);
	}
	
//	public abstract Sweet createSweet();
	
	@Override
	public double getSugarContent() {
		return getPercentageSugarContent() * mass / 100.0;
	}
	
	private void setRandomMass(int min, int max) {
		mass = random.nextInt(min, max + 1);
	}

	public int getMass() {
		return mass;
	}

	@Override
	public String toString() {
		return "Sweet [mass=" + mass + "]";
	}
	
	
	
}
