package org.techhub.repository;
import java.sql.*;
public class DBParent 
{
	protected DBConfig config = DBConfig.getinstance();
	protected Connection conn = config.getConnection();
	protected PreparedStatement pstmt = config.getstatement();
	protected ResultSet rs = config.getresultset();
}
