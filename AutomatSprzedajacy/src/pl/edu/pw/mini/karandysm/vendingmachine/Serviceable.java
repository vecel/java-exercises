package pl.edu.pw.mini.karandysm.vendingmachine;

import pl.edu.pw.mini.karandysm.foodproduct.Drink;
import pl.edu.pw.mini.karandysm.foodproduct.SugarException;
import pl.edu.pw.mini.karandysm.foodproduct.Sweet;

public interface Serviceable extends DeliveryService {

	boolean put(Sweet sweet) throws SugarException;

	boolean putDrink(Drink drink) throws SugarException;
	
//	boolean isFull();
}
