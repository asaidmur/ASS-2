public class FullTimeEmployee extends Employee {

	public int salary = 0;

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
		return String.valueOf(salary);
	}

	// don't think this is necessary, but it looks cool I guess
	public String getSuperString() {
		return super.toString();
	}

	public static void main(String[] args) {
		FullTimeEmployee em = new FullTimeEmployee("42", "Hermione", "magic_lover92@hotmail.com");
		em.setSalary(100000);
		System.out.println(em);
		System.out.println(em.getSuperString());
	}
}
