package org.techhub.repository;

import static java.lang.System.*;
import org.techhub.model.LoginModel;

public class RegisterrepositoryImpl extends DB implements Registerrepository {
	public LoginModel isalumniRegister(LoginModel model) {
		int val;
		try 
		{
			pstmt = conn.prepareStatement("insert into alumnilogin values (?,?,?,?,?)");
			pstmt.setString(1, model.getUsername());
			pstmt.setString(2, model.getPassword());
			pstmt.setString(3, model.getContact());
			pstmt.setString(4, model.getEmail());
			pstmt.setString(5, model.getLogintype());
			val = pstmt.executeUpdate();
			return val>0?model:null;
		} 
		catch (Exception ex) 
		{
			out.println("Error is " + ex);
			ex.printStackTrace();
		}
		return model;
	}
}
