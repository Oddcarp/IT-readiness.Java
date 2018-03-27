
public enum RegionCode {
	NorthEast,
	SouthEast,
	MidWest,
	SouthWest,
	NorthWest,
	NonContinentalUS;

	

	

	public static  String getRegion(int x) {
		
		String finalRegion = " ";
		switch (x) {
		case 0:
			finalRegion = "NorthEast";
			break;
		case 1:
			finalRegion = "SouthEast";
			break;
		case 2:
			finalRegion = "MidWest";
			break;
		case 3:
			finalRegion = "SouthWest";
			break;
		case 4:
			finalRegion = "NorthWest";
			break;
		case 5:
			finalRegion = "NonContinentalUS";
			break;
		default:
			finalRegion = "Unknown Region Code!";
			break;			
		}
		
		return finalRegion;

	}

	
	
	
	
	// 0 = NorthEast
	// 1 = SouthEast
	// 2 = MidWest
	// 3 = SouthWest
	// 4 = NorthWest
	// 5 = Non-Continental U.S.
}
