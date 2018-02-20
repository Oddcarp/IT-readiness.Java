
public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int productID = 2;
		switch (productID) {
		case 1:
			System.out.println("Hammer");
			break;
		default:
			System.out.println("Product not Found!");
			break;
		case 2:
			System.out.println("Nails");
			break;
		}
		
		
		int specialProductID = 0;
		int productID2 = 1;
		
		if (productID2 == 1) {
			System.out.println("Hammer");
		} else if (productID2 == 2) {
			System.out.println("Nails");
		} else {
			if (specialProductID>0) {
				System.out.println("Special Product");
			} else {
				System.out.println("Product not Found!");
			}
		}
			
		final int TIMES_BY = 12;
		int times = 1;
		final int MAX_TIMES = 12;
		int i = 1;
		for (;;) {
			System.out.println(i + " times " + TIMES_BY + " = " +(i *TIMES_BY));
			times++;
		} 
		
	}

}


