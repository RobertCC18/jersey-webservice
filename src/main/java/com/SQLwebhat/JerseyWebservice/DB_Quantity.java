package com.SQLwebhat.JerseyWebservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Quantity {
	public	static String Quantity() throws SQLException {
		String quantity = "";
			String user = "appdatacheck";
			String password = "rgAr3C00l";
			
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
				System.out.println("Driver Found!");
				e.printStackTrace();
			}
			
	    try (Connection dbConnection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=master",user, password)) {
	        System.out.println("opened connection");

	        try (Statement statement = dbConnection.createStatement()) {
	        	 System.out.println("Started Query");

	            System.out.println("executing command...");
	            ResultSet rs    =   statement.executeQuery("use PantryList DECLARE @result varchar(1000) SET @result = '' SELECT @result = @result + Quantity + ', ' FROM Pantry_List select substring(@result, 0, len(@result) - 1)");
	            
	            System.out.println("completed command");
	        
	        
	            while (rs.next()) {
	              quantity =rs.getString(1);
	            }
	            return quantity;
	            
	        }
	     
	    } 
	  
		}
}
