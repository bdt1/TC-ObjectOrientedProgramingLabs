package Superpowers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuperHumanTest {
	private SuperHuman superHuman = null;
	private String name = null;
    private  Boolean isMale = false;
    private  Integer age = null;
    private  String  occupation = null;
    private  String  address = null;
	private  Boolean isGood = false;
	private  String heroName = null;
	private  String superAbility = null;
	
    @Before
	public void setup() {
		this.name = "Clark";
		this.isMale = true;
		this.age = 25;
		this.occupation = "superhero";
		this.address = "Smallville";
		this.isGood = true;
		this.heroName = "Superman";
		this.superAbility = "x-ray vision";
		this.superHuman = new SuperHuman(name, age, isMale, occupation, address, isGood, heroName, superAbility);

	}
    @Test
    public void superHuman() {
    System.out.println("SuperHuman: ");
    }
    
	@Test
	public void testName() {
		// :Given
		//name = "Clark";
		// :When
		String actual = superHuman.getName();
		// :Then
		Assert.assertEquals(this.name, actual);
		System.out.println("name: " + actual);
	}
	
	@Test
	public void testAge() {
		// :Given
		age = 25;
		// :When
		int actual = superHuman.getAge();
		// :Then
		assert(this.age == actual);
		System.out.println("age: " + actual);
	}
	
	@Test
	public void testIsMale() {
		// :Given
		isMale = true;
		// :When
		boolean actual = superHuman.getIsMale();
		// :Then
		Assert.assertEquals(this.isMale, actual);
		System.out.println("isMale: " + actual);
	}
	
	@Test
	public void testOccupation() {
		// :Given
		occupation = "superhero";
		// :When
		String actual = superHuman.getOccupation();
		// :Then
		Assert.assertEquals(this.occupation, actual);
		System.out.println("occupation: " + actual);
	}
	
	@Test
	public void testAddress() {
		// :Given
		address = "Smallville";
		// :When
		String actual = superHuman.getAddress();
		// :Then
		Assert.assertEquals(this.address, actual);
		System.out.println("address: " + actual);
	}
	
	@Test
	public void testIsGood() {
		// :Given
		isGood = true;
		// :When
		boolean actual = superHuman.getIsGood();
		// :Then
		Assert.assertEquals(this.isGood, actual);
		System.out.println("isGood: " + actual);
	}
	
	@Test
	public void testHeroName() {
		// :Given
		heroName = "Superman";
		// :When
		String actual = superHuman.getHeroName();
		// :Then
		Assert.assertEquals(this.heroName, actual);
		System.out.println("hero name: " + actual);
	}
	
	@Test
	public void testSuperAbility() {
		// :Given
		superAbility = "x-ray vision";
		// :When
		String actual = superHuman.getSuperAbility();
		// :Then
		Assert.assertEquals(this.superAbility, actual);
		System.out.println("super ability: " + actual);
	}
}
