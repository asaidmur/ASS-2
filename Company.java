import java.util.Arrays;

public class Company {

	public FullTimeEmployee fullTimeArray[];
	public ContractEmployee contractArray[];
	public int numberOfEmployees;

	public Company() {
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

	//Eclipse generated 
	@Override
	public String toString() {
		return "Company [fullTimeArray=" 	+ Arrays.toString(fullTimeArray) 
				+ ", contractArray=" 		+ Arrays.toString(contractArray) 
				+ ", numberOfEmployees=" 	+ numberOfEmployees + "]";
	}

	public static void main(String[] args) {

		FullTimeEmployee[] fullTimeArr = new FullTimeEmployee[3];
		ContractEmployee[] contractArr = new ContractEmployee[3];

		for (int i = 0; i < 3; i++) {
			FullTimeEmployee fullTime = new FullTimeEmployee(i);
			fullTimeArr[i] = fullTime;
			ContractEmployee contract = new ContractEmployee(10-i, 10+i);
			contractArr[i] = contract;
			
			System.out.println("fullTime: " + fullTime.toString());
			System.out.println("contract: " + contract.toString());
			
		}
		Company co = new Company();
		co.setFullTimeArray(fullTimeArr);
		co.setContractArray(contractArr);
		co.setNumberOfEmployees(99);
		System.out.println(co.toString());
	}
	
	
}