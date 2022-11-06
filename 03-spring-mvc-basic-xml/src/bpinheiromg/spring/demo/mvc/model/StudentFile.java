package bpinheiromg.spring.demo.mvc.model;

public class StudentFile {
	
	private String firstName;
	private String lastName;
	private String country;
	private String gender;
	private String preferredProgrammingLanguage;

	public StudentFile() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPreferredProgrammingLanguage() {
		return preferredProgrammingLanguage;
	}

	public void setPreferredProgrammingLanguage(String preferedProgramingLanguage) {
		this.preferredProgrammingLanguage = preferedProgramingLanguage;
	}

}
