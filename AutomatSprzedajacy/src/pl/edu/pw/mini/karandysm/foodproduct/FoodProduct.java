package pl.edu.pw.mini.karandysm.foodproduct;

import java.util.Random;

public abstract class FoodProduct implements Comparable<FoodProduct> {
	
	protected static Random random = new Random();
	
	private int percentageSugarContent;
	
	
	
	public abstract double getSugarContent();
	
	public int getPercentageSugarContent() {
		return percentageSugarContent;
	}



	protected void setRandomPercentageSugarContent(int min, int max) {
		percentageSugarContent = random.nextInt(min, max + 1);
	}

	@Override
	public int compareTo(FoodProduct o) {
		
		if (getSugarContent() == o.getSugarContent())
			return 0;
		else if (getSugarContent() > o.getSugarContent())
			return 1;
		else return -1;
	}
	
	
}
