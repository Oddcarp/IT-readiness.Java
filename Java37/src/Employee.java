
public class Employee {
	
	//Declare class-level variables
	private String firstName;
	private char middleInitial;
	private String lastName;
	private String SSN;
	private String DOB;
	private String ID;
	private double salary = 0.00;
	
	public Employee (String firstName, char middleInitial, String lastName, String SSN, String DOB, String ID, double salary) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.SSN = SSN;
		this.DOB = DOB;
		this.ID = ID;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
//		return "Employee \nfirstName: " + firstName + "\nmiddleInitial: " + middleInitial + "\nlastName: " + lastName
//				+ "\nSSN: " + SSN + "\nDOB: " + DOB + "\nID: " + ID + "\nsalary: " + salary;
		String tempString = String.format("Employee: %s %s %s\nSSN: %s\nDOB: %s\nID: %s\nSalary: %s", firstName, middleInitial, lastName, SSN, DOB, ID, salary);
		return tempString;
	}

	public Employee (String firstName, char middleInitial, String lastName, String SSN, String DOB, String ID) {
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.SSN = SSN;
		this.DOB = DOB;
		this.ID = ID;
		}
}



