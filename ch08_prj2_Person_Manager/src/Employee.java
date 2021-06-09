
public class Employee extends Person {
	
	private String ssn;

	public Employee(String firstName, String lastName, String ssn) {
		super(firstName, lastName);
		this.ssn = ssn;
	}

	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public String getSsn() {
		return ssn.substring(7);
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return super.toString() + "Name: "+ getFirstName() +" "+ getLastName()+"/n"
				+"SSN: "+"xxx-xx-"+getSsn();
	}
	
	
	

}
