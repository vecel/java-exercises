package pl.edu.pw.mini.karandysm.kret;

import java.util.Random;

public class Earthworm extends GroundObject{
	private double mass;
	
	public Earthworm(int nutritionalValue) {
		super(nutritionalValue);
		
		Random random = new Random();
		mass = random.nextDouble(0.5, 1.0);
	}
	
	@Override
	public String toString() {
		return "{}";
	}
}
