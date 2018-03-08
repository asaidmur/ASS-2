public class FullTimeEmployee extends Employee {

	private int salary = 0;

	public FullTimeEmployee(String employeeId, String name, String emailAddress) {
		super(employeeId, name, emailAddress);
	}

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		String employee = super.toString();
		String fulltime = "salary: " + String.valueOf(salary) + "\n";
		return employee += fulltime;

	}

}
