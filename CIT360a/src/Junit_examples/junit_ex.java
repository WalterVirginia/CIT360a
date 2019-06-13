package Junit_examples;

import java.util.*;

public class junit_ex {
	
	
/**
 * Creates a method that adds two numbers
 * This will be used for assertEquals in the junit Test
 */
	public int addInt (int numX, int numY) {
		return numX + numY;
	}
	
/**
 * This method creates an ArrayList
 * The arrayList is a list of species which are housed
 * in the primate house of the Idaho Falls zoo. 
 * This will be used for assertArrayEquals in the junit test
 * assertArrayEquals asserts that two arrays are equal to each other, 
 * that is, of the same datatype. 
 */
	public List primateArray(){
		List<String> primateHouse = new ArrayList<>();
			return primateHouse;
	}
	
	/**
	 * This method is created to check if one number is greater than 
	 * or equal to another number. 
	 * This will be used for assertFalse in the junit test. 
	 * This junit method asserts that a condition is false. 
	 */
	public boolean equalTo(int firstNum, int secondNum) {
		if (firstNum >= secondNum) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * This map will create a list of Animals with their scientific names.
	 * We will let their non-scientific names be used as the key. 
	 * This map will be used for assertNotNull, which is used in junit
	 * to assert that an object is not null. 
	 */
	public String AfricanAnimals(final String key) {
		Map<String, String> AfricanAnimals = new HashMap<>();
		AfricanAnimals.put("African Lion", "Panthera leo");
		AfricanAnimals.put("Aldabra Tortoise", "Aldabrachelys gigantea");
		AfricanAnimals.put("Black-and-white Colobus", "Colobus guereza");
		AfricanAnimals.put("Blue-bellied Roller", "Coracias cyanogaster");
		AfricanAnimals.put("Grant's Zebra", "Equus burchellii boehmi");
		AfricanAnimals.put("Grey Crowned Crane", "Balearica regulorum");
		AfricanAnimals.put("Serval", "Leptailurus serval");
		
		return AfricanAnimals.get(key);
		
	}
	
	/**
	 * This map creates a list of animals with the countries they belong to. 
	 * The countries will be the key. This will be used to illustrate 
	 * AssertNotSame, which asserts that two objects do not refer to the 
	 * same object. 
	 */
	public String animalCountries(final String key) {
		Map<String, String> animalCountries = new HashMap<>();
		animalCountries.put("Chile" , "Chilean Flamingo");
		animalCountries.put("Argentina" , "Patagonian Cavy");
		animalCountries.put("United States" , "Golden Eagle");
		animalCountries.put("Australia" , "Kookaburra");
		
		return animalCountries.get(key);
		
	}
	
	/**
	 * This is a hash map of some of my favorite books. I will use
	 * The author as the key. This will illustrate the junit method
	 * assertNull, which asserts that an object is null. 
	 */
	public String bestBooks (final String key) {
		Map<String, String> bestBooks = new HashMap<>();
		bestBooks.put("Dean Koontz","From the Corner of His Eye");
		bestBooks.put("Lois Lowry","Number the Stars");
		bestBooks.put("C.S. Lewis","The Lion, the Witch, and the Wardrobe");
		bestBooks.put("John Steinbeck","Cannery Row");
		bestBooks.put("Caroline Angell","All the Time in the World");
		
		return bestBooks.get(key);
	}
	
	/**This method will assure that firstNum is greater than 
	 * secondNum. This will be used to illustrate assertTrue, 
	 * which asserts that a condition is true. 
	 */
	public boolean greaterThan (int firstNum, int secondNum) {
		if (firstNum > secondNum) {
			return true;
		}
		else {
			return false;
		}
	}
}
	
	
	
