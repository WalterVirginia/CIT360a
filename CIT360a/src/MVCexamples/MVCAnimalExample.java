package MVCexamples;

public class MVCAnimalExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * this part of the code retrieves the information from the MVC
		 */
		
		AnimalModel model = retrieveAnimal();
		
		AnimalView view = new AnimalView();
		
		AnimalController controller = new AnimalController(model,view);
		
		controller.updateView();
		
		controller.updateView();
	}
	
	private static AnimalModel retrieveAnimal() {
		AnimalModel animal = new AnimalModel();
		animal.setaID("al2123");
		animal.setType("Lion");
		animal.setName("Camaria");
		return animal;
	}

}