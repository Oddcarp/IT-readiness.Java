import java.lang.Math;



public class Java33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(raiseThenAdd(3,3,3));

		int a = 2;
		int b = 2;
		int c = 10;


		System.out.println(raiseThenAdd(a,b,c));
		
		
		
		String name1 = "Banasree";
		String name2 = "Ray";
		String name3 = "Cory";
		
		String[] nameArray = new String[3];
		nameArray[0] = "Banasree";
		nameArray[1] = "Ray";
		nameArray[2] = "Cory";
		
		for (int i = 0; i < nameArray.length; i++) {
			nameArray[i] = nameArray[i].toUpperCase();
			System.out.println(nameArray[i]);
		}
		
		for (String name: nameArray) {
			name = name.toUpperCase();
			System.out.println(name);
		}
		
		
		// System.out.println(nameArray);
		
	}



	public static int raiseThenAdd(int num1, int num2, int num3) {
		int total = (int) Math.pow(num1, num2);
		total += num3;
		num1 += 100;
		
		return total;

	}

}
