package pl.edu.pw.mini.karandysm.people;

import java.util.List;

import pl.edu.pw.mini.karandysm.foodproduct.Bar;
import pl.edu.pw.mini.karandysm.foodproduct.Drink;
import pl.edu.pw.mini.karandysm.foodproduct.FoodProduct;
import pl.edu.pw.mini.karandysm.foodproduct.SugarException;
import pl.edu.pw.mini.karandysm.foodproduct.Sweet;
import pl.edu.pw.mini.karandysm.foodproduct.Twirl;
import pl.edu.pw.mini.karandysm.vendingmachine.Serviceable;

public class Serviceman extends Person {

	Serviceable vendingMachine;

	public Serviceman(Serviceable serviceable) {
		vendingMachine = serviceable;
	}

	@Override
	public void doJob() {
		boolean run = true;
		while (run) {
			try {
				run = vendingMachine.putDrink(new Drink());
			} catch (SugarException e) {
				e.printStackTrace();
			}
		}

		run = true;
		
		while (run) {
			Sweet sweet = random.nextBoolean() ? new Bar() : new Twirl();
			try {
				run = vendingMachine.put(sweet);
			} catch (SugarException e) {
				e.printStackTrace();
			}
		}
		vendingMachine.randomOrder();
		List<FoodProduct> bought = vendingMachine.getAll();
	}

}
