package org.techhub.repository;
import java.sql.*;
import java.util.Properties;

import static java.lang.System.*;

import java.io.File;
import java.io.FileInputStream;
public class DBConfig 
{
	private static Connection conn;
	private static ResultSet rs;
	private static PreparedStatement pstmt;
	private static DBConfig db = null;
	public DBConfig(String path)
	{
		try
		{  
			FileInputStream finf = new FileInputStream(path);
			out.println(path);
			Properties p = new Properties();
			p.load(finf);
			String username = p.getProperty("db.username");
			String Password = p.getProperty("db.password");
			String url = p.getProperty("db.url");
			String driverclass = p.getProperty("driver.className");
			conn = DriverManager.getConnection(url, username, Password);
			if(conn!=null)
			{
				out.println("Database has been Connected......");
			}
			else
			{
				out.println("Database has not been Connected");
			}
		}
		catch(Exception ex)
		{
			out.println("Error is " + ex);
			ex.printStackTrace();
		}
	}
//	public static void main(String[] args) {
//		new DBConfig();
//	}
	public static DBConfig getinstance(String Path)
	{
		if(db==null)
		{
			db = new DBConfig(Path);
		}
		return db;
	}
	public static Connection getConn()
	{
		return conn;
	}
	public static PreparedStatement getstatement()
	{
		return pstmt;
	}
	public static ResultSet getresult()
	{
		return rs;
	}
}