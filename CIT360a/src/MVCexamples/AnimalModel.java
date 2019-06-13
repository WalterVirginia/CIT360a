package MVCexamples;

/**
 * @author vjwalter
 *This is the animal model and will carry the data for animals in the park
 *and update the controller if this data changes. 
 */
public class AnimalModel {

	/*
	 * holds the value of the animal's ID, animal type(species)
	 * and animal name. 
	 */
	private String aID;
	private String type;
	private String name;
	
	//returns the animal ID
	public String getaID() {
		return aID;
	}
	
	//sets the animal ID
	    public void setaID(String aID) {
		this.aID = aID;
	}
	
	//returns the animal type
		public String getType() {
		return type;
		}
		
	//sets the animal type
		public void setType(String type) {
		this.type = type;
		}
	
	//returns the animal name
		public String getName() {
		return name;
		}
				
	//sets the animal name
		public void setName(String name) {
		this.name = name;
		}
	
}
