package pl.edu.pw.mini.karandysm.people;

import java.util.List;
import java.util.Objects;

import pl.edu.pw.mini.karandysm.foodproduct.FoodProduct;
import pl.edu.pw.mini.karandysm.foodproduct.Sweet;
import pl.edu.pw.mini.karandysm.vendingmachine.DeliveryService;

public class Customer extends Person {

	private static int nextId = 1;
	private int id = nextId++;
	private DeliveryService vendingMachine;

	
	public Customer(DeliveryService deliveryService) {
		vendingMachine = deliveryService;
	}

	@Override
	public void doJob() {
		int repeats = random.nextInt(5, 11);
		for (int i = 0; i < repeats; i++) {
			vendingMachine.randomOrder();		
		}
		List<FoodProduct> bought = vendingMachine.getAll();
		
		double averageMass = 0;
		int sweetsNumber = 0;
		for (FoodProduct product : bought) {
			if (product instanceof Sweet) {
				averageMass += ((Sweet) product).getMass();
				sweetsNumber++;
			}
		}
		averageMass = (sweetsNumber == 0 ? 0 : averageMass/sweetsNumber);
		
		System.out.println(bought);
		System.out.println("Srednia masa batonow i rogalikow to: " + averageMass);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return id == other.id;
	}

}
