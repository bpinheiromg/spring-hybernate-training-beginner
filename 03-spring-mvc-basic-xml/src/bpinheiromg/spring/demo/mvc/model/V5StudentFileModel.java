package bpinheiromg.spring.demo.mvc.model;

public class V5StudentFileModel {
	
	private String firstName;
	private String lastName;
	private String country;
	private String gender;
	private String preferredOS;
	private String[] programmingLanguages;

	public V5StudentFileModel() {
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

	public String getPreferredOS() {
		return preferredOS;
	}

	public void setPreferredOS(String preferredOS) {
		this.preferredOS = preferredOS;
	}

	public String[] getProgrammingLanguages() {
		return programmingLanguages;
	}

	public void setProgrammingLanguages(String[] programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}
}
