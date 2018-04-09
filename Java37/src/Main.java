
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee("McKenzie", 'R', "Keller", "123456789", "03/04/1991", "73", 1000000);
		System.out.println(employee.toString());
		employee.setAddress("House","1201 N Mallard LN","","Rogers","AR", "USA","72756");
		employee.setAddress("Work","615 J B Hunt Corporate Dr","","Lowell","AR", "USA","72745");
		System.out.println(employee.getAddressList());
		
		
		System.out.println();
		
		SalespersonEmployee salespersonEmployee = new SalespersonEmployee("McKenzie", 'R', "Keller", "123456789", "03/04/1991", "73", 1000000, 5,false);
		System.out.println(salespersonEmployee.toString());
		
		System.out.println(Math.E);
	}



}
