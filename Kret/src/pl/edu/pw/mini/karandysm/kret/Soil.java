package pl.edu.pw.mini.karandysm.kret;

import java.util.Random;

public class Soil extends GroundObject {

	private double density;
	
	public Soil(int nutritionalValue) {
		super(nutritionalValue);
		
		Random random = new Random();
		density = random.nextDouble(1.4, 2.4);
	}
	
	@Override
	public String toString() {
		return "# ";
	}
}
