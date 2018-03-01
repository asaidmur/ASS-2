package lab;

public class Employee {
	
	public Employee() {
		this.employeeID = "42";
		this.name = "Kalina";
		this.email_address = "k.blonska@gmail.com";
	}


	private String employeeID;
	private String name;
	private String email_address;

	
	public String toString() {
		
		String s = employeeID;
		s += "\n";
		s +=  name;
		s +=  "\n";
		s += email_address;

		return s;
	}
	
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	
	
	public static void main(String[] args) {
		Employee em = new Employee();
		System.out.println(em);
	}

}
