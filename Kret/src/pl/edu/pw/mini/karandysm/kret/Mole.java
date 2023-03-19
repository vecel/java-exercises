package pl.edu.pw.mini.karandysm.kret;

import java.util.Random;

public class Mole implements MoleMotion {
	
	private String species;
	private int nutritionalValue;
	private GroundObject[][] environment;
	
	public Mole(String species, GroundObject[][] environment) {
		Random random = new Random();
		
		this.species = species;
		this.nutritionalValue = random.nextInt(200, 241);
		this.environment = environment;
	}
	
	@Override
	public void goMole() {
		Random random = new Random();
		int x, y;
		x = random.nextInt(environment[0].length);
		y = random.nextInt(environment.length);
		
		if (environment[y][x] != null) {
			nutritionalValue += environment[y][x].getNutritionalValue();
			System.out.println("Mniam! Zjedzono " + environment[y][x].getNutritionalValue() + " na polu (" + y + ", " + x + ")");
		}
		else {
			System.out.println("Pusto :(");			
		}
		environment[y][x] = null;		
	}
	
	@Override
	public String getNutritionalValue() {
		return Integer.toString(nutritionalValue);
	}
}
