package MVCexamples;

/**
 * @author vjwalter
 * This is the animal controller. The controller communicates between 
 * the view and the model. The model does not talk to the view at all, 
 * and the view does not talk to the model at all. All communication
 * between the two is done through the controller. 
 *
 */

public class AnimalController {

	private AnimalModel model;
	private AnimalView view; 
	
	//Constructor - references the model and the view
	public AnimalController(AnimalModel model, AnimalView view) {
		this.model = model;
		this.view = view;
	}
	
	/**
	 * sets and returns the animal id from the model
	 */
	public void setAnimalID(String aID) {
		model.setaID(aID);
	}
	
	public String getAnimalID() {
		return model.getaID();
	}
	
	/**
	 * sets and returns the animal type from the model
	 */
	public void setAnimalType(String Type) {
		model.setType(Type);
	}
	
	public String getAnimalType() {
		return model.getType();
	}
	
	/**
	 * sets and returns the animal name from the model
	 */
	public void setAnimalName(String Name) {
		model.setName(Name);
	}
	
	public String getName() {
		return model.getName();
	}
	
	/*
	 * updates the view, which outputs to the console. 
	 */
	public void updateView() {
		view.animalFactCard(model.getaID(), model.getType(), model.getName());
	}

}

