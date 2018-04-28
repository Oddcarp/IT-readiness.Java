
public class WhizBang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 20;
		int end = 30;
		outputWhizBang(start, end);
	}

	public static void outputWhizBang(int start, int end) {

		if (start < 0 || end < 0) {
			System.out.print("all parameters must be greater than zero");
			
			//Could not remember how to throw an exception
		} else if (end > start) {
			for (int i = start; i <= end; i++) {
				String currentResult = String.valueOf(i);
				if (i % 4 == 0 && i % 5 == 0) {
					currentResult = "WhizBang";
				} else if (i % 4 == 0) {
					currentResult = "Whiz";
				} else if (i % 5 == 0) {
					currentResult = "Bang";
				}
				System.out.println(currentResult);
			}
		} else if (end < start) {
			for (int i = start; i >= end; i--) {
				String currentResult = String.valueOf(i);
				if (i % 4 == 0 && i % 5 == 0) {
					currentResult = "WhizBang";
				} else if (i % 4 == 0) {
					currentResult = "Whiz";
				} else if (i % 5 == 0) {
					currentResult = "Bang";
				}
				System.out.println(currentResult);
			}
		}
	}

}
