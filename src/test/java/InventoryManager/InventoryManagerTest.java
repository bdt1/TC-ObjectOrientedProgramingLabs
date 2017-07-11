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
		{
		this.id = 1;
		this.price = 1.0;
		this.quantity = 10;
		this.product = new Product(id, price, quantity);
		}
		{
		this.id = 2;
		this.price = 5.0;
		this.quantity = 10;
		this.product2 = new Product(id, price, quantity);
		}
		{
		this.id = 3;
		this.price = 10.0;
		this.quantity = 5;
		this.product3 = new Product(id, price, quantity);	
		}
		}
	
	
	@Test
	public void testCreateNewProduct() {
		// :Given
		//String expected = "\n\n\nId = 1\nPrice = 1.0\nQuantity = 10";
		String expected = "" + this.product;
		// :When
		Product actual = InventoryManager.createNewProduct();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCreateNewProduct2() {
		// :Given
		//String expected = "\n\n\nId = 2\nPrice = 5.0\nQuantity = 10";
		String expected = "" + this.product2;
		// :When
		Product actual = InventoryManager.createNewProduct();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCreateNewProduct3() {
		// :Given
		//String expected = "\n\n\nId = 3\nPrice = 10.0\nQuantity = 5";
		String expected = "" + this.product3;
		// :When
		Product actual = InventoryManager.createNewProduct();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void testPrintInventoryProducts() {
		// :Given
		//Products = in @Before
		String expected = ("" + this.product + this.product2 + this.product3);
		// :When
		String actual = InventoryManager.printInventoryProducts();
		// :Then
		Assert.assertEquals(expected, actual);
	}
	
	
	
	@Test
	public void testRemoveProductById() {
		// :Given
		//int removeID = 1; 
		//remove this.product
		String expected = ("" + this.product2 + this.product3);
		// :When enter ID to remove = 1
		InventoryManager.removeProductById();
		// :Then 
		String actual = InventoryManager.printInventoryProducts();
		Assert.assertEquals(expected, actual);
	}
	
	
	
	@Test
	public void testSumOfInventoryProducts() {
		// :Given
		String expected = 10 + "\n" + 20 + "\n" + 25;
		// :When
		double actual = InventoryManager.sumOfInventoryProducts();
		// :Then
		Assert.assertEquals(expected,actual);
	
	}
	
	
	@Test
	public void testSumOfInventoryValue() {
		// :Given
		String expected = 10.0 + "\n" + 60.0 + "\n" + 110.0;
		// :When
		double actual = InventoryManager.sumOfInventoryValue();
		// :Then
		Assert.assertEquals(expected,actual);
	
	}

}
