package pl.edu.pw.mini.karandysm.kret;

import java.util.Random;

public class Environment {
	
	public GroundObject[][] environment;
	
	private static final int EARTHWORM_NUTRITIONAL_VALUE = 3;
	private Mole mole;
	
	public Environment(int width, int height, int larvaeNumber, int earthwormsNumber) {
		environment = new GroundObject[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				environment[i][j] = null;
			}
		}
		placeLarvae(larvaeNumber);
		placeEarthworms(earthwormsNumber);
		placeSoil();
		
		mole = new Mole("europea", environment);
	}
	
	public Environment(int width, int height, int larvaeNumber, int earthwormsNumber, String species) {
		this(width, height, larvaeNumber, earthwormsNumber);
		mole = new Mole(species, environment);
		
	}
	
	public void printEnvironment() {
		String result = "";
		for (int i = 0; i < environment.length; i++) {
			for (int j = 0; j < environment[0].length; j++) {
				if (environment[i][j] == null) 
					result += " ";
				else
					result += environment[i][j].toString();
			}
			result += "\n";
		}
		System.out.println(result);
	}
	
	public void runMole() {
		for (int i = 1; i <= 10; i++) {
			mole.goMole();
		}
		printEnvironment();
	}
	
	public String getNutritionalValue() {
		return mole.getNutritionalValue();
	}
	
	private void placeLarvae(int larvaeNumber) {
		Random random = new Random();
		int counter = larvaeNumber;
		int x, y;
		while (counter > 0) {
			x = random.nextInt(environment[0].length);
			y = random.nextInt(environment.length);
			
			if (environment[y][x] == null) {
				environment[y][x] = new Larva(random.nextInt(3, 6));
				counter--;
			}
		}
	}

	private void placeEarthworms(int earthwormsNUmber) {
		Random random = new Random();
		int counter = earthwormsNUmber;
		int x, y;
		while (counter > 0) {
			x = random.nextInt(environment[0].length);
			y = random.nextInt(environment.length);
			
			if (environment[y][x] == null) {
				environment[y][x] = new Earthworm(Environment.EARTHWORM_NUTRITIONAL_VALUE);
				counter--;
			}
		}
	}
	
	private void placeSoil() {
		for (int i = 0; i < environment.length; i++) {
			for (int j = 0; j < environment[0].length; j++) {
				if (environment[i][j] == null) {
					environment[i][j] = new Soil(0);
				}
			}
		}
	}
	
}
