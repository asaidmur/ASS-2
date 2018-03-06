package assignmentTwo;

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

	public ContractEmployee[] getContractArrayt() {
		return contractArray;
	}

	public void setContractArrayt(ContractEmployee[] contractArrayt) {
		this.contractArray = contractArrayt;
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

	
	
	
	
}
