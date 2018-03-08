public class ContractEmployee extends Employee {

	private int hourlyPay;
	private int hours;

	public ContractEmployee() {
		this.hourlyPay = 0;
		this.hours = 0;
	}

	public ContractEmployee(String employeeId, String name, String emailAddress, int hourlyPay, int hours) {

		super(employeeId, name, emailAddress);
		this.hourlyPay = hourlyPay;
		this.hours = hours;
	}

	public ContractEmployee(int hourlyPay, int hours) {
		this.hourlyPay = hourlyPay;
		this.hours = hours;
	}

	public int getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		String employee = super.toString();
		String contractor = "hourly pay: " + hourlyPay + ", hours: " + hours + "\n";
		return employee += contractor;
	}

}
