package MVCexamples;

/**
 * @author vjwalter
 * This portion of code creates the view - this is the portion 
 * visible to the user. 
 */

public class AnimalView {
	
	public void animalFactCard(String animalID, String animalType, String animalName ) {
		System.out.println("Animal: ");
		System.out.println("Animal ID: " + animalID);
		System.out.println("Animal type: " + animalType);
		System.out.println("Animal name: " + animalName);
	}
}
