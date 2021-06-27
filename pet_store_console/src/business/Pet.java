package business;

import java.time.LocalDate;

public class Pet {
	
	private int id;
	private String type;
	private String breed;
	private String name;
	private LocalDate birthDate;
	private String gender;
	private String disposition;
	private boolean available;
	
	public Pet() {
		super();
	}

	public Pet(int id, String type, String breed, String name, LocalDate birthDate, String gender, String disposition,
			boolean available) {
		super();
		this.id = id;
		this.type = type;
		this.breed = breed;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.disposition = disposition;
		this.available = available;
	}
	

	public Pet(String type, String breed, String name, LocalDate birthDate, String gender, String disposition,
			boolean available) {
		super();
		this.type = type;
		this.breed = breed;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.disposition = disposition;
		this.available = available;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the disposition
	 */
	public String getDisposition() {
		return disposition;
	}

	/**
	 * @param disposition the disposition to set
	 */
	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

	/**
	 * @return the available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * @param available the available to set
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Pet id: "+id+"\n"+
				"Type: " +type +", Breed: "+breed+", Name: " + name + ", BirthDate: " +birthDate+"\n"+
				"Gender: "+gender+", Disposition: "+disposition+"\n"+
				"Available: "+available+"\n";
		
				
	}
	
	

}
