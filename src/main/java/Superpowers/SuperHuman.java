package Superpowers;

public class SuperHuman extends Human{
	private  Boolean isGood;
	private  String heroName;
	private  String superAbility;
   

	public SuperHuman(String name, int age, boolean isMale, String occupation, String address, boolean isGood, String heroName, String superAbility) {
		super(name, age, isMale, occupation, address);
		this.isGood = isGood;
		this.heroName = heroName;
		this.superAbility = superAbility;
	}


	public Boolean getIsGood() {
		
		return isGood;
	}


	public void setIsGood(Boolean isGood) {
		this.isGood = isGood;
	}


	public String getHeroName() {
		return heroName;
	}


	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}


	public String getSuperAbility() {
		return superAbility;
	}


	public void setSuperAbility(String superAbility) {
		this.superAbility = superAbility;
	}

}
