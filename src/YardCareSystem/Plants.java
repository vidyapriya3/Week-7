package YardCareSystem;

public class Plants {

	
	private String plantName;
	private String Description;
	
	
	
	public Plants (String plantName, String Description) {
		
		
		this.setPlantName(plantName);
		this.setDescription(Description);
			
	}




	public String getPlantName() {
		return plantName;
	}


	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}
}
