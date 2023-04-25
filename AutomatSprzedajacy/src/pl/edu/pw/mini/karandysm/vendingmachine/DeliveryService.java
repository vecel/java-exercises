package pl.edu.pw.mini.karandysm.vendingmachine;

import java.util.LinkedList;

import pl.edu.pw.mini.karandysm.foodproduct.FoodProduct;

public interface DeliveryService {
	void randomOrder();

	LinkedList<FoodProduct> getAll();
}
