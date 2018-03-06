package assignmentTwo;

public class FullTimeEmployee extends Employee {

	public String salary = "0.0";

	public FullTimeEmployee(String employeeId, String name, String emailAddress) {
		super(employeeId, name, emailAddress);
	}

	public FullTimeEmployee() {
	}

	public FullTimeEmployee(String salary) {
		this.salary = salary;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String toString() {
		return salary;
	}

	// don't think this is necessary, but it looks cool I guess
	public String getSuperString() {
		return super.toString();
	}

	public static void main(String[] args) {
		FullTimeEmployee em = new FullTimeEmployee("42", "Hermione", "magic_lover92@hotmail.com");
		em.setSalary("one **million** dollars");
		System.out.println(em);
		System.out.println(em.getSuperString());
	}
}
