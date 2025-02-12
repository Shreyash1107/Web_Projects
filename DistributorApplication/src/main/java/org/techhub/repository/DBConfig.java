package org.techhub.repository;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBConfig 
{
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs ;
	private static DBConfig db = null;
	private DBConfig()
	{
		try
		{
			File f = new File(".");
			String path = f.getAbsolutePath().substring(0, f.getAbsolutePath().length()-1) + "src\\db.properties";
			System.out.println(path);
			FileInputStream fin = new FileInputStream(path);
			Properties p = new Properties();
			p.load(fin);
			String username = p.getProperty("db.username");
			String Password = p.getProperty("db.password");
			String url = p.getProperty("db.url");
			String driverclass = p.getProperty("db.DriverClassName");
			System.out.println(username);
			System.out.println(Password);
			System.out.println(url);
			System.out.println(driverclass);
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url,username,Password);
			if(conn!=null)
			{
				System.out.println("Database Connected");
			}
			else
			{
				System.out.println("Database Not Connected");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is " + ex);
		}
	}
	public static DBConfig getinstance()
	{
		if(db==null)
		{
			db = new DBConfig();
		}
		return db;
	}
	public Connection getConnection()
	{
		return conn;
	}
	public PreparedStatement getstatement()
	{
		return pstmt;
	}
	public ResultSet getresultset()
	{
		return rs;
	}
	
}
