import java.util.ArrayList;

public class Employee implements Person {
	
	//Declare class-level variables
	protected String firstName;
	protected char middleInitial;
	protected String lastName;
	protected String SSN;
	protected String DOB;
	protected String ID;
	protected double salary = 0.00;
	protected ArrayList<Address> addressList = new ArrayList<Address>();
	

	
	public Employee (String firstName, char middleInitial, String lastName, String SSN, String DOB, String ID, double salary) {
		this.setFirstName(firstName);
		this.setMiddleInitial(middleInitial);
		this.setLastName(lastName);
		this.setSSN(SSN);
		this.setDOB(DOB);
		this.setID(ID);
		this.setSalary(salary);
	}
	


	/**
	 * @return the addressList
	 */
	public ArrayList<Address> getAddressList() {
		return addressList;
	}



	/**
	 * @param addressList the addressList to set
	 */
	public void setAddress(String addressType, String streetLine1, String streetLine2, String city, String stateCode, String countryCode, String postalCode) {

		addressList.add(new Address( addressType,  streetLine1,  streetLine2,  city,  stateCode,  countryCode,  postalCode));
		
	
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the sSN
	 */
	public String getSSN() {
		return SSN;
	}

	/**
	 * @param sSN the sSN to set
	 */
	public void setSSN(String sSN) {
		SSN = sSN;
	}

	/**
	 * @return the dOB
	 */
	public String getDOB() {
		return DOB;
	}

	/**
	 * @param dOB the dOB to set
	 */
	public void setDOB(String dOB) {
		DOB = dOB;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
//	
		String tempString = String.format("Employee: %s %s %s\nSSN: %s\nDOB: %s\nID: %s\nSalary: %s%n", getFirstName(), getMiddleInitial(), lastName, SSN, DOB, ID, salary);
		return tempString;
	}

	public Employee (String firstName, char middleInitial, String lastName, String SSN, String DOB, String ID) {
		this.setFirstName(firstName);
		this.setMiddleInitial(middleInitial);
		this.lastName = lastName;
		this.SSN = SSN;
		this.DOB = DOB;
		this.ID = ID;
		}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleInitial
	 */
	public char getMiddleInitial() {
		return middleInitial;
	}

	/**
	 * @param middleInitial the middleInitial to set
	 */
	public void setMiddleInitial(char middleInitial) {
		this.middleInitial = middleInitial;
	}








}



