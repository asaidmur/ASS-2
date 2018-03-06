package assignmentTwo;

public class Employee {
	// static? private?
	public String employeeID = "0";
	public String name = "name";
	public String emailAddress = "address@gmail.com";
	

	public Employee(String employeeId, String name, String emailAddress) {
		this.employeeID = employeeId;
		this.name = name;
		this.emailAddress = emailAddress;
	}
	
	public Employee() {}


	@Override
	public String toString() {
		
		return employeeID 
				+ "\n" 
				+ name 
				+ "\n" 
				+ emailAddress;
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
		return emailAddress;
	}
	public void setEmail_address(String email_address) {
		this.emailAddress = email_address;
	}
	
	
	public static void main(String[] args) {
		Employee em = new Employee("42", "Harry Potter", "hpotter@hogwarts.gmail");
		System.out.println(em);
	}
	 
}
