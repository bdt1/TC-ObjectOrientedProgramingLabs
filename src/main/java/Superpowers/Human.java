package Superpowers;

/**
 * Complete the 'Human' class in the Superpowers Package that has fields for: name, age, gender,
 * occupation, and address. Also create methods for retreiving and outputing this data to screen.
 * Then create a SuperHuman class and UNIT TEST that subclasses the first with fields for good or bad,
 * hero name, super ability. As before, create methods for retrieving field data and printing to screen.
 */
public class Human {
    private  String name;
    private  Boolean isMale;
    private  Integer age;
    private  String  occupation;
    private  String  address;

	public Human(String name, int age, boolean isMale, String occupation, String address) {
	        this.name = name;
	        this.isMale = isMale;
	        this.age = age;
	        this.occupation = occupation;
	        this.address = address;
	    }
	
	
	public String getName() {
		return name;
        
    }
	
	public void setName(String name) {
		this.name = name;
	}

    
	public int getAge() {
    	return this.age;
    }
    
	public void setAge(int age) {
		this.age = age;
	}
    
    
	public Boolean getIsMale() {
		
		return isMale;
	}


	public void setIsMale(Boolean isMale) {
		this.isMale = isMale;
	}

    
	public String getOccupation() {
		return occupation;
        
    }
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
	public String getAddress() {
		return address;
        
    }
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
}
