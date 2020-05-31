package homework7_singleton;


import java.sql.DriverManager;
import java.sql.Connection;
 import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
  private static Database Instance;
private Connection connection;
  private Database() {
	  try{  
		  Class.forName("com.mysql.jdbc.Driver");  
		  java.sql.Connection con=DriverManager.getConnection(  
		  "jdbc:mysql://localhost:3306/mydatabase","zhanel","1234");  
		  }
	  catch(Exception e){
		  System.out.println("Connection Failed! Check output console");
		  e.printStackTrace();
		  return;
		  } 

      }
  public static Database getInstance() {
	  if (Database.Instance == null) 
		  Database.Instance = new Database();
			return Database.Instance;
		
	  }
	  public void query(String sql) {
		  try {
				Statement statement = connection.createStatement();
				 ResultSet resultSet = statement.executeQuery(sql);
				 while(resultSet.next())
					 System.out.printf("");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	  } 
  

