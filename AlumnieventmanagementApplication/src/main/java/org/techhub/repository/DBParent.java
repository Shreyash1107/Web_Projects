package org.techhub.repository;
import java.sql.*;
public class DBParent 
{
	public static String path;
	protected DBConfig db = DBConfig.getinstance(path);
	protected Connection conn = db.getConn();
	protected PreparedStatement pstmt = db.getstatement();
	protected ResultSet rs = db.getresult();
}
