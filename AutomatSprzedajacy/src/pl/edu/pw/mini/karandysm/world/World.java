package pl.edu.pw.mini.karandysm.world;

import java.util.LinkedHashSet;
import java.util.Set;

import pl.edu.pw.mini.karandysm.foodproduct.ChewingGum;
import pl.edu.pw.mini.karandysm.people.Customer;
import pl.edu.pw.mini.karandysm.people.Person;
import pl.edu.pw.mini.karandysm.people.Serviceman;
import pl.edu.pw.mini.karandysm.vendingmachine.VendingMachine;

public class World {
	
	public void goLive() {
		VendingMachine<ChewingGum> vendingMachine = new VendingMachine<>();
		Set<Person> people = new LinkedHashSet<>(11);
		
		people.add(new Serviceman(vendingMachine));
		for (int i = 0; i < 10; i++) {
			people.add(new Customer(vendingMachine));
		}
		
		System.out.println(people);
		for (Person person : people) {
			person.doJob();
		}
	}
}
