package com.SQLwebhat.JerseyWebservice;

import java.sql.SQLException;

public class DB_Final {
public static String PantryConstruct() throws SQLException {
	
	String dbFinal = "";
	dbFinal = Utitlity.constructSQLJSON(DB_probe.Itemlist(), DB_Quantity.Quantity()); 
	return dbFinal;
}

}
