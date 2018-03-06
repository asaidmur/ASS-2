package assignmentTwo;

public class ContractEmployee extends Employee {

	//should data members contain value?
	public String hourlyPay = "$10.25";

	public String hours = "40";

	public ContractEmployee() {
	}

	// is it ok to initialize parent class and child class in same constructor?
	public ContractEmployee(String employeeId, String name, String emailAddress, String hourlyPay, String hours) {

		super(employeeId, name, emailAddress);
		this.hourlyPay = hourlyPay;
		this.hours = hours;

	}

	public ContractEmployee(String employeeId, String name, String emailAddress) {
		super(employeeId, name, emailAddress);
	}

	public ContractEmployee(String hourlyPay, String hours) {
		this.hourlyPay = hourlyPay;
		this.hours = hours;
	}

	public String getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(String hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String toString() {

		return hourlyPay + "\n" + hours;
	}

}
