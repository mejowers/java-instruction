public class Employee implements Displayable, DepartmentConstants {

    private int department;
    private String firstName;
    private String lastName;

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public String getDisplayText() {
    	return ("Name: "+firstName+" "+lastName+"," +(int)department);
    	
    }
}