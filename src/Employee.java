public class Employee {

	private String employeeId;
	private String name;
	private String emailAddress;

	public Employee(String employeeId, String name, String emailAddress) {
		this.employeeId = employeeId;
		this.name = name;
		this.emailAddress = emailAddress;
	}

	public Employee() {
	}

	@Override
	public String toString() {

		return "Employee Id: " + employeeId + ", name: " + name + ", email address: " + emailAddress + ", ";
	}

	public String getEmployeeID() {
		return employeeId;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeId = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
