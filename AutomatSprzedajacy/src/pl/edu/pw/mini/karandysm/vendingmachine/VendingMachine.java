package pl.edu.pw.mini.karandysm.vendingmachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.karandysm.foodproduct.Drink;
import pl.edu.pw.mini.karandysm.foodproduct.FoodProduct;
import pl.edu.pw.mini.karandysm.foodproduct.SugarException;
import pl.edu.pw.mini.karandysm.foodproduct.Sweet;

public class VendingMachine<T> implements Serviceable {

	private static final int MAX_SWEETS_SIZE = 15;
	private static final int MAX_DRINKS_SIZE = 10;

	private static Random random = new Random();

	private Set<Sweet> sweets = new HashSet<>();
	private Set<Drink> drinks = new LinkedHashSet<>();
	private List<FoodProduct> feeder = new LinkedList<>();
	private List<T> otherProducts = new ArrayList<>();

	@Override
	public void randomOrder() {
		if (sweets.isEmpty() && drinks.isEmpty())
			System.out.println("Towaru brak!");
		else {

			if (drinks.isEmpty())
				feeder.add(getRandomProductFromSet(sweets));
			else if (sweets.isEmpty())
				feeder.add(getRandomProductFromSet(drinks));
			else {
				if (random.nextBoolean())
					feeder.add(getRandomProductFromSet(sweets));
				else
					feeder.add(getRandomProductFromSet(drinks));
			}
			
		}
	}

	@Override
	public LinkedList<FoodProduct> getAll() {
		LinkedList<FoodProduct> feederCopy = new LinkedList<FoodProduct>(feeder);
		Collections.sort(feederCopy);
		feeder.clear();
		return feederCopy;
	}

	@Override
	public boolean put(Sweet sweet) throws SugarException {
		if (sweets.size() >= MAX_SWEETS_SIZE)
			return false;
		if (sweet.getSugarContent() < 0 || sweet.getSugarContent() >= 100)
			throw new SugarException("Sugar content is too low or too high");
		sweets.add(sweet);
		return true;
	}

	@Override
	public boolean putDrink(Drink drink) throws SugarException {
		if (drinks.size() >= MAX_DRINKS_SIZE)
			return false;
		if (drink.getSugarContent() < 0 || drink.getSugarContent() >= 100)
			throw new SugarException("Sugar content is too low or too high");
		drinks.add(drink);
		return true;
	}

	private <T extends FoodProduct> FoodProduct getRandomProductFromSet(Set<T> set) {
		int item = random.nextInt(set.size());
		int i = 0;
		for (FoodProduct product : set) {
			if (i == item) {
				FoodProduct result = product;
				set.remove(product);
				return result;
			}
			i++;
		}
		return null; // Nie wywola sie, ale musi byc
	}
	
	@Override
	public String toString() {
		return sweets.size() + " " + drinks.size();
	}
	
	public void putAdditional(T otherProduct) {
		otherProducts.add(otherProduct);
	}
	
//	@Override
//	public boolean isFull() {
//		return sweets.size() == MAX_SWEETS_SIZE && drinks.size() == MAX_DRINKS_SIZE;
//	}
}
