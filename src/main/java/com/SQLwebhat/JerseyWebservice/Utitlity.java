package com.SQLwebhat.JerseyWebservice;


import java.sql.SQLException;

import org.codehaus.jettison.json.JSONException;
import com.google.gson.*;
import org.codehaus.jettison.json.JSONObject;

public class Utitlity {
	/**
	 * Null check Method
	 * 
	 * @param txt
	 * @return
	 */
	public static boolean isNotNull(String txt) {
		// System.out.println("Inside isNotNull");
		return txt != null && txt.trim().length() >= 0 ? true : false;
	}

	public static String constructSQLJSON1(String tag, String string) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("Quantity", tag);
			obj.put("status", new String(string));
		} catch (JsonIOException | JSONException e) {
			// TODO Auto-generated catch block
		}
		return obj.toString();
	}
	/**
	 * Method to construct JSON
	 * 
	 * @param tag
	 * @param string
	 * @return
	 */
	public static String constructSQLJSON(String tag, String string) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("Items", tag);
			obj.put("Quantity", new String(string));
		} catch (JsonIOException | JSONException e) {
			// TODO Auto-generated catch block
		}
		return obj.toString();
	}

	
	/**
	 * Method to construct JSON with Error Msg
	 * 
	 * @param tag
	 * @param status
	 * @param err_msg
	 * @return
	 */
	public static String constructJSON(String tag, boolean status,String err_msg) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("tag", tag);
			obj.put("status", new Boolean(status));
			obj.put("error_msg", err_msg);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
		}
		return obj.toString(); 
	}

	public static String constructJSON(String string, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
