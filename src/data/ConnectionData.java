package data;

public class ConnectionData {

	private String firstName;
	private String lastName;
	private String sex;
	private String email;
	private String telephone;
	private String company;
	private String ssu;
	private String seniority;
	private String additionalInfo;
	
	public ConnectionData(String firstName, String lastName, String sex, String email, String telephone, String company,
			String ssu, String seniority, String additionalInfo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.email = email;
		this.telephone = telephone;
		this.company = company;
		this.ssu = ssu;
		this.seniority = seniority;
		this.additionalInfo = additionalInfo;
	}
	
	

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getSsu() {
		return ssu;
	}

	public void setSsu(String ssu) {
		this.ssu = ssu;
	}

	public String getSeniority() {
		return seniority;
	}

	public void setSeniority(String seniority) {
		this.seniority = seniority;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
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

}
