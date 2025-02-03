package com.rohit.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;


import com.rohit.utils.PropertyReader;

public final class ConnectionProvider {
 
	static Connection con = null;
	public static synchronized Connection getConn() {
		try {
			if(con == null) {
				Class.forName(PropertyReader.getDataProperty("driver"));
				con = DriverManager.getConnection(PropertyReader.getDataProperty("url"), PropertyReader.getDataProperty("user"), PropertyReader.getDataProperty("password"));
				
				return con;
			}else {
				return con;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
	
	
}
