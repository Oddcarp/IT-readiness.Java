
public class SalespersonEmployee extends Employee{
	
	
	protected int region = 0;
	protected String stringRegion;
	protected boolean isSmoker = false;

	
	public SalespersonEmployee(String firstName, char middleInitial, String lastName, String SSN, String DOB, String ID,
			double salary, int region, boolean isSmoker) {
		super(firstName, middleInitial, lastName, SSN, DOB, ID, salary);
		
		 
		
		
		this.isSmoker = isSmoker;
		this.stringRegion = RegionCode.getRegion(region);
		
	}
	
	
	

	@Override
	public String toString() {
		return super.toString() + "\nregion: " + stringRegion + "\nisSmoker: " + isSmoker;
//		return "Employee \nfirstName: " + super.getFirstName() + "\nmiddleInitial: " + middleInitial + "\nlastName: " + lastName
//				+ "\nSSN: " + SSN + "\nDOB: " + DOB + "\nID: " + ID + "\nsalary: " + salary + "\nregion: " + region + "\nisSmoker: " + isSmoker;
//		String tempString = String.format("Employee: %s %s %s\nSSN: %s\nDOB: %s\nID: %s\nSalary: %s", getFirstName(), getMiddleInitial(), lastName, SSN, DOB, ID, salary);
//		return tempString;
	}


	
	/**
	 * @return the region
	 */
	public int getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(int region) {
		this.region = region;
	}
	/**
	 * @return the isSmoker
	 */
	public boolean isSmoker() {
		return isSmoker;
	}
	/**
	 * @param isSmoker the isSmoker to set
	 */
	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}
	
	
	

}
