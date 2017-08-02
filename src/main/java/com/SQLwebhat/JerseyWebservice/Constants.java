package com.SQLwebhat.JerseyWebservice;


//Change these parameters according to your DB
public class Constants {
	public static String dbClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String dbName= "database=master";
	public static String dbUrl = "jdbc:sqlserver://192.168.0.178:1433;"+dbName;
	public static String dbUser = "appdatacheck";
	public static String dbPwd = "rgAr3C00l";
}
