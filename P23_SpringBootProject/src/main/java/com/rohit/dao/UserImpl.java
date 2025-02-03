package com.rohit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.rohit.dbcon.ConnectionProvider;
import com.rohit.model.User;

public class UserImpl implements UserDao  {
	static int rowAfected;

	@Override
	public int registerUser(User user) {
		String name = user.getName();
		String email = user.getEmail();
		String mobile = user.getMobile();
		String pass = user.getPass();

		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = ConnectionProvider.getConn();
			String query = "insert into user(name, email, mobile, pass) values (?, ?, ?, ?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, mobile);
			ps.setString(4, pass);

			rowAfected = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return rowAfected;

	}

	@Override
	public String loginUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}	
//
//	public static String loginUser(User user) {
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rst = null;
//		String userName = null;
//
//
//		try {
//			conn = ConnectionProvider.getConn();
//			ps = conn.prepareStatement("select * from user where email = ? and pass = ?");
//			ps.setString(1, user.getEmail());
//			ps.setString(2, user.getPass());
//
//			rst = ps.executeQuery();
//
//			if (rst.next()) {
//				
//				userName = rst.getString("name");
//				System.out.println("Login successful..");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		
//		return userName;
//
//	}
//
//}


