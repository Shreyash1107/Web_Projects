package org.techhub.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB 
{
	protected Connection conn;
	protected ResultSet rs;
	protected PreparedStatement pstmt;
	public DB() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alumnimanagement", "root", "Shreyash@123");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}