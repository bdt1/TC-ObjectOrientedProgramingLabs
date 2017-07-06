package InventoryManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InventoryManagerTest {
	private Product product = null;
	private Product product2 = null;
	private Product product3 = null;
	private Integer id = null;
	private Double price = null;
	private Integer quantity = null;

	
	@Before
	public void setup() {
		this.id = 1;
		this.price = 1.0;
		this.quantity = 10;
		this.product = new Product(id, price, quantity);
	
		this.id = 2;
		this.price = 5.0;
		this.quantity = 10;
		this.product2 = new Product(id, price, quantity);
	
		this.id = 3;
		this.price = 10.0;
		this.quantity = 5;
		this.product3 = new Product(id, price, quantity);	
	}
	
	
	@Test
	public void testCreateNewProduct() {
		// :Given
		Product actual = InventoryManager.createNewProduct();
		Assert.assertEquals(("" + this.product), actual);
	}
	
	
	@Test
	public void testPrintInventoryProducts() {
		// :Given
		//Products = in @Before
		// :When
		String actual = InventoryManager.printInventoryProducts();
		// :Then
		Assert.assertEquals(("" + this.product), actual);
		//Console.println("" + this.product);
	}
	
	
	/*
	@Test
	public void testRemoveProductById() {
		// :Given
		//Product product = InventoryManager.removeProductById();
		//Assert.assertEquals((null), product);
	
	}
	
	
	@Test
	public void testSumOfInventoryProducts() {
		// :Given
		//Product product = InventoryManager.sumOfInventoryProducts();
		//Assert.assertEquals(this.product, product);
	
	}
	
	
	@Test
	public void testSumOfInventoryValue() {
		// :Given
		//Product product = InventoryManager.sumOfInventoryValue();
		//Assert.assertEquals(this.product, product);
	
	}
*/
}
