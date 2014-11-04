package org.make.jar;

public class PersonalInfo {
	private String firstName;
	private String lastName;
	private String company;
	private String city;
	
	public PersonalInfo(){
		this.firstName = "Gajanan";
		this.lastName = "Mahajan";
		this.company = "Persistent Systems Ltd";
		this.city = "Pune";
	}
	
	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}
	
	public String getCompany(){
		return company;
	}
	
	public String getCity(){
		return city;
	}
}
