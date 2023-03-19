package pl.edu.pw.mini.karandysm.kret;

import java.util.Random;

public class Larva extends GroundObject {
	private double mass;
	
	public Larva(int nutritionalValue) {
		super(nutritionalValue);
		
		Random random = new Random();
		mass = random.nextDouble(2.0, 3.0);
	}
	
	@Override
	public String toString() {
		return "@ ";
	}
}
