
public interface Person {
	
	static final int COMPANY_ID = 7;
	
	public String getLastName();
	public void setLastName(String lastName);
	public String getSSN();
	public void setSSN(String sSN);
	public String getDOB();
	public void setDOB(String dOB);
	public String getID();
	public void setID(String iD);
	public String getFirstName();
	public void setFirstName(String firstName);
	public char getMiddleInitial();
	public void setMiddleInitial(char middleInitial);
	public void setAddress(String addressType, String streetLine1, String streetLine2, String city, String stateCode, String countryCode, String postalCode);
	
	
/*	
	public String getAddressType();
	public void setAddressType(String addressType);
	public String getStreetLine1();
	public void setStreetLine1(String streetLine1);
	public String getStreetLine2();
	public void setStreetLine2(String streetLine2);
	public String getCity();
	public void setCity(String city);
	public String getStateCode();
	public void setStateCode(String stateCode);
	public String getCountryCode();
	public void setCountryCode(String countryCode);
	public String getPostalCode();
	public void setPostalCode(String postalCode);
*/
}
