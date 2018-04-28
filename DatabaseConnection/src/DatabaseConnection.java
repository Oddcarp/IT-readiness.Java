import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.ArrayList;


public class DatabaseConnection {


    public static void main(String[] args) {

        
        final String DATABASE_URL = "jdbc:mysql://localhost:3306/java_class";
        final String SELECT_QUERY = "SELECT * FROM java_class.employee;";
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        
                
        
        
        try    {
                Connection connection = DriverManager.getConnection(DATABASE_URL, "root", "changeit");
                Statement statement = connection.createStatement();    
                ResultSet resultSet = statement.executeQuery(SELECT_QUERY);
                
                System.out.println("Connected!\n");            
         /*       
                CallableStatement cStmt = connection.prepareCall("{call java_class.first_name_ucase_and_trim(?, ?, ?)}");
                cStmt.setInt(1, 2);
                cStmt.setInt(2, 0);
                cStmt.registerOutParameter(3, Types.INTEGER);
                cStmt.executeQuery();
      */       //   ResultSet resultSet = cStmt.getResultSet();
                
         //       Integer outVariable = cStmt.getInt(3);
                
                ResultSetMetaData metadata = resultSet.getMetaData();
                
                int columnCount = metadata.getColumnCount();    
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(metadata.getColumnName(i) + " ");      
                }
                System.out.println("\n");
                
                while (resultSet.next()) {
                    String row = "";
                    String ID = "0";
                    String firstName = "";
                	char middleInitial = ' ';
                	String lastName = "";
                	String SSN = "";
                	String DOB = "";
                	double salary = 0.00;
                    
                    for (int i = 1; i <= columnCount; i++) {
                        row += resultSet.getString(i) + "   ";  
                        
                        switch (metadata.getColumnName(i)) {
                        case "employee_id":
                        	ID = resultSet.getString(i);
                        	
                        	break;
                        case "first_name":
                        	firstName = resultSet.getString(i);
                        	break;
                        case "middle_initial":
                        	try {
                        		middleInitial = resultSet.getString(i).charAt(0);                        		
                        	} catch (Exception e) {
                        		middleInitial = ' ';
                        	}
                        	break;
                        case "last_name":
                        	lastName = resultSet.getString(i);
                        	break;
                        case "ssn":
                        	SSN = resultSet.getString(i);
                        	break;
                        case "dob":
                        	DOB = resultSet.getString(i);
                        	break;
                        case "salary":
                        	salary = resultSet.getDouble(i);
                        	break;
                        default:
                        	System.out.println("Column name not found");
                        }
                    }
                    System.out.println(row);  
                    
                    Employee tempEmployee = new Employee(firstName, middleInitial, lastName, SSN, DOB, ID, salary);
                    employeeList.add(tempEmployee);
                    tempEmployee = null;
                }
                

                // cStmt.execute();
             //   cStmt.close();
                
            }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
            
        System.out.println();
        for (Employee e:employeeList) {
        	System.out.println(e);
        }

    }

}