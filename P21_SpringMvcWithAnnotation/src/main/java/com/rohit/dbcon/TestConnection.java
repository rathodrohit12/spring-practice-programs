package com.rohit.dbcon;

import java.sql.Connection;

public class TestConnection {
public static void main(String[] args) {
	Connection conn = ConnectionProvider.getConn();
	System.out.println(conn);
}
}
