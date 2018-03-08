/********************************************
 * 											*
 * 	Ardasher Saidmuradov						*
 * 	300286501								*
 * 	CSIS 1275								*
 *	Assignment 2								*
 *	submission no: 							*
 *	9bc74b02-cf33-488c-9432-ecb8dd1e6508		*
 * 											*
 ********************************************/

public class Company {

	private FullTimeEmployee fullTimeArray[];
	private ContractEmployee contractArray[];
	private int numberOfEmployees;

	public Company() {
		this.fullTimeArray = new FullTimeEmployee[] { new FullTimeEmployee() };
		this.contractArray = new ContractEmployee[] { new ContractEmployee() };
		this.numberOfEmployees = 0;
	}

	public Company(FullTimeEmployee[] fullTimeArray, ContractEmployee[] contractArray, int numberOfEmployees) {
		this.fullTimeArray = fullTimeArray;
		this.contractArray = contractArray;
		this.numberOfEmployees = numberOfEmployees;
	}

	public FullTimeEmployee[] getFullTimeArray() {
		return fullTimeArray;
	}

	public void setFullTimeArray(FullTimeEmployee[] fullTimeArray) {
		this.fullTimeArray = fullTimeArray;
	}

	public ContractEmployee[] getContractArray() {
		return contractArray;
	}

	public void setContractArray(ContractEmployee[] contractArray) {
		this.contractArray = contractArray;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public String toString() {

		String contractString = "Contract employee:\n";
		String fullTimeString = "Full Time employee:\n";
		String employees = "Number of employees: ";

		for (ContractEmployee contractEmployee : this.contractArray) {
			contractString += contractEmployee.toString() + "\n";
		}
		
		for (FullTimeEmployee fullTimeEmployee : this.fullTimeArray) {
			fullTimeString += fullTimeEmployee.toString() + "\n";
		}
		employees += this.numberOfEmployees;
		
		return contractString + fullTimeString + employees + "\n";
	}

	public static void main(String[] args) {

		// Testing all default constructors
		Company co = new Company();
		System.out.println("~~~~~Testing all default constructors~~~~~\n\n" + co.toString());
		
		// testing default employee constructors
		FullTimeEmployee[] fullTimeArr = new FullTimeEmployee[] {new FullTimeEmployee(11)};
		ContractEmployee[] contractArr = new ContractEmployee[] {new ContractEmployee(10, 15)};
		co.setFullTimeArray(fullTimeArr);
		co.setContractArray(contractArr);
		co.setNumberOfEmployees(99);
		System.out.println("~~~~~testing default employee constructors~~~~~\n\n" + co.toString());
		
		// testing full constructors and setters
		contractArr = new ContractEmployee[] {new ContractEmployee("ID-9107", "Michel Foucalt", "m.foucalt@gmail.com", 10, 15)};
		FullTimeEmployee fullTime = new FullTimeEmployee();
		fullTime.setEmailAddress(contractArr[0].getEmailAddress());
		fullTime.setEmployeeID(contractArr[0].getEmployeeID());
		fullTime.setName(contractArr[0].getName());
		fullTimeArr = new FullTimeEmployee[] {fullTime};
		Company co2 = new Company(fullTimeArr, contractArr, 604);
		System.out.println("~~~~~testing full constructors and getters/setters~~~~~\n\n" + co2.toString());
	}

}