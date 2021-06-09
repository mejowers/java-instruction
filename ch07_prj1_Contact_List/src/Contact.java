
public class Contact {
	
	private String fName;
	private String lName;
	private String email;
	private String phone;
	
	public Contact(String fName, String lName, String email, String phone) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
	}

	public Contact() {
		super();
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	@Override
//	public String toString() {
//		return "Contact [fName=" + fName + ", lName=" + lName + ", email=" + email + ", phone=" + phone + "]";
//	}
	
	

}
