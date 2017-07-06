package InventoryManager;

import java.util.ArrayList;


public class Inventory {

	private static final ArrayList<Product> products = new ArrayList<>();
	
	
	
	
	private Inventory() {
		/** this class cannot be instantiated */
	}

	public static void addProduct(Product product) {
		Console.println("Registering a new Product to Inventory");
		products.add(product);
	}
	
	public static Product [] getProducts() {
		return products.stream().toArray(Product[]::new);
		
	}

	public static void remove(Product product) {
		Console.println("Product has been removed from Inventory");
		products.remove(product);
	}
	

}
