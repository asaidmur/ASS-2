public class ContractEmployee extends Employee {

	//should data members contain value?
	private int hourlyPay;
	private int hours;

	public ContractEmployee() {
		this.hourlyPay = 10;
		this.hours = 40;
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

	public String toString() {
		return hourlyPay + ", " + hours;
	}
	
	public static void main(String[] args) {
		ContractEmployee contr = new ContractEmployee();
		System.out.println(contr.toString());
	}

}
