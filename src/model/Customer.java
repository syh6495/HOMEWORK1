package model;

public class Customer {

	private String id;
	private String password;
	private String name;
	private String email;
	private String gender;
	

	
	
	public Customer(String id, String password, String name, String email, String gender) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
}