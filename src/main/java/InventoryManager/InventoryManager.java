package InventoryManager;

/**
 * Finish the InventoryManager Class in the InventoryManager Package, which
 * manages an inventory of products. Create a product class which has a price,
 * id, and quantity on hand. Then create an inventory class which keeps track of
 * various products and can sum up the inventory value.
 *
 * Note: Inventory and InventoryManager should not be the same class!!!
 */
public class InventoryManager {

	public static void makeDecision() {
		Console.println("Choose from these choices");
		Console.println("-------------------------\n");
		Console.println("1 - Print Inventory Products");
		Console.println("2 - Create New Product");

		Console.println("3 - Remove Product");
		Console.println("4 - Print Sum of Inventory Products");
		Console.println("5 - Print Sum of Inventory Value");
		Console.println("6 - Quit");

		int input = Console.getIntInput("");

		if (input == 1) {
			InventoryManager.printInventoryProducts();
		}

		if (input == 2) {
			InventoryManager.createNewProduct();
		}

		if (input == 3) {
			InventoryManager.removeProductById();
		}

		if (input == 4) {
			InventoryManager.sumOfInventoryProducts();
		}
		
		if (input == 5) {
			InventoryManager.sumOfInventoryValue();
		}

		if (input == 6) {
			Console.println("Goodbye!");
			System.exit(0);
		}
	}
	

	
	public static String printInventoryProducts() {
		Product[] products = Inventory.getProducts();
		String result = "";
		for (Product product : products) {
			result += product.toString();
		}
		Console.println(result);
		return result;
	}
		
		

	public static Product createNewProduct() {
		int id = Console.getIntInput("Please Enter Product ID?");
		double price = Console.getDoubleInput("What is the products price?");
		int quantity = Console.getIntInput("How many would you like to buy?");

		Product newProduct = new Product(id, price, quantity);
		Inventory.addProduct(newProduct);
		// LoggerHandler.info(newProduct.toString()); I want to leave logger off for now
		return newProduct;
	}

	
	
	public static void removeProductById() {
		int id = Console.getIntInput("Which Product would you like to remove (by ID)?");
		for (Product product : Inventory.getProducts()) {
			if (product.getId() == id) {
				Inventory.remove(product);
				break;
			}
		}
	}

	
	
	public static double sumOfInventoryProducts() { 
		int sumOfProducts = 0;
		for (Product product : Inventory.getProducts()) {
			sumOfProducts += product.getQuantity();
			System.out.println(sumOfProducts);
			}
		return sumOfProducts;
		
	}
	
	
	
	public static double sumOfInventoryValue() { 
		double sumOfProductsPrice = 0.0;
		for (Product product : Inventory.getProducts()) {
			sumOfProductsPrice += (product.getPrice() * product.getQuantity());
			System.out.println(sumOfProductsPrice);
			}
		return sumOfProductsPrice;
		
	}

}