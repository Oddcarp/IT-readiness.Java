
public class Address {
	
	protected String addressType;
	protected String streetLine1;
	protected String streetLine2;
	protected String city;
	protected String stateCode;
	protected String countryCode;
	protected String postalCode;
	
	
	
	
	
	public Address(String addressType, String streetLine1, String streetLine2, String city, String stateCode,
			String countryCode, String postalCode) {
		this.setAddressType(addressType);
		this.setStreetLine1(streetLine1);
		this.setStreetLine2(streetLine2);
		this.setCity(city);
		this.setStateCode(stateCode);
		this.setCountryCode(countryCode);
		this.setPostalCode(postalCode);
	}
	/**
	 * @return the addressType
	 */
	public String getAddressType() {
		return addressType;
	}
	/**
	 * @param addressType the addressType to set
	 */
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	/**
	 * @return the streetLine1
	 */
	public String getStreetLine1() {
		return streetLine1;
	}
	/**
	 * @param streetLine1 the streetLine1 to set
	 */
	public void setStreetLine1(String streetLine1) {
		this.streetLine1 = streetLine1;
	}
	/**
	 * @return the streetLine2
	 */
	public String getStreetLine2() {
		return streetLine2;
	}
	/**
	 * @param streetLine2 the streetLine2 to set
	 */
	public void setStreetLine2(String streetLine2) {
		this.streetLine2 = streetLine2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the stateCode
	 */
	public String getStateCode() {
		return stateCode;
	}
	/**
	 * @param stateCode the stateCode to set
	 */
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address In the Address class [addressType=" + addressType + ", streetLine1=" + streetLine1 + ", streetLine2=" + streetLine2
				+ ", city=" + city + ", stateCode=" + stateCode + ", countryCode=" + countryCode + ", postalCode="
				+ postalCode + "]";
	}

	
}
