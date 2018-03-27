package enumTest;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ShippingType myPackageShipping = ShippingType.UPS_Ground;
			System.out.println(myPackageShipping);
			System.out.println(myPackageShipping.name());
			System.out.println(myPackageShipping.ordinal());
			System.out.println(myPackageShipping.toString());
	}

}