package enumTest;

public enum ShippingType {
	UPS_Next_Day,
	UPS_Second_Day, 
	UPS_Sunday,
	UPS_Ground;
	
	
	@Override
	public String toString() {
		String s = "";
		switch(name()) {
			case "UPS_Next_Day": 
				s = "UPS NEXT DAY (1 business day)";
				break;
			case "UPS_Second_Day": 
				s = "UPS SECOND DAY (2 business days)";
				break;
			case "UPS_Sunday": 
				s = "UPS SUNDAY (1 day - including Sundays)";
				break;
			case "UPS_Ground": 
				s = "UPS GROUND (5-7 business days)";
				break;
			default: 
				s = "INVALID SELECTION";
				break;
		}
		return s;
	}
	
	
}
