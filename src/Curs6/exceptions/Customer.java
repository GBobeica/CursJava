package Curs6.exceptions;

public class Customer {
	
	
	public String name;
	public String address;
	public String email;
	
	public Customer (String name, String address ,String email) {
		setName(name);
		setAddress(address);
		setEmail(email);
	
		
	
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	
	
	}
}
