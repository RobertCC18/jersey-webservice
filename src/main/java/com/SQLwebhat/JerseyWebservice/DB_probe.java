package com.SQLwebhat.JerseyWebservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.json.Json;
import javax.json.JsonArrayBuilder;

public class DB_probe {

	public static String Itemlist() throws SQLException {
	String ingred = "";
		String user = "yourtablename";
		String password = "******";
		String query = "use PantryList DECLARE @result varchar(1000), @result2 varchar(1000) SET @result = '' SELECT @result = @result + Items + ', ' FROM Pantry_List select substring(@result, 0, len(@result) - 1) SET @result2 = '' SELECT @result2 = @result2 + Quantity + ',' FROM Pantry_List select substring(@result2, 0, len(@result2) - 1)";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Found!");
			e.printStackTrace();
		}
		
    try (Connection dbConnection = DriverManager.getConnection("jdbc:sqlserver://192.168.0.178;database=master",user, password)) {
        System.out.println("opened connection");

        try (Statement statement = dbConnection.createStatement()) {
        	 System.out.println("Started Query");

            System.out.println("executing command...");
            ResultSet rs    =   statement.executeQuery(query);
         
            System.out.println("completed command");
        
        
            while (rs.next()) {
              ingred = rs.getString(1);
            }
            return ingred;
            
        }
     
    } 
  
	}
	

		
}
