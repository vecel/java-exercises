package pl.edu.pw.mini.karandysm.kret;

public class EnvironmentDemonstrator {
	
	public static void main(String[] args) {
		Environment environment = new Environment(8, 10, 4, 6);
		environment.printEnvironment();
		environment.runMole();
		
		System.out.println("Wrtosc odzywcza kreta to: " + environment.getNutritionalValue() + "\n");
		
		environment.runMole();
		
		System.out.println("Wrtosc odzywcza kreta to: " + environment.getNutritionalValue());
		
		environment.runMole();
		environment.runMole();
		environment.runMole();
		environment.runMole();
		
		System.out.println("Wrtosc odzywcza kreta to: " + environment.getNutritionalValue());
	}
}
