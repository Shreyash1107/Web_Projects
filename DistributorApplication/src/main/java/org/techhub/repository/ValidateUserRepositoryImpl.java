package org.techhub.repository;
import java.sql.*;
import org.techhub.model.LoginModel;

public class ValidateUserRepositoryImpl extends DBParent implements ValidateUserRepository
{
	public LoginModel isValidate(LoginModel model)
	{
		try
		{
			pstmt = conn.prepareStatement("select *from login where username = ? and Password = ?");
			pstmt.setString(1, model.getUsername());
			pstmt.setString(2, model.getPass());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				model.setsLogintype(rs.getString("logintype"));
			}
			return model;
		}
		catch(Exception ex)
		{
			System.out.println("Error is " + ex);
		}
		return null;
	}
	public static void main(String[] args) 
	{
		ValidateUserRepositoryImpl vrepoImpl = new ValidateUserRepositoryImpl();
		LoginModel lmodel = new LoginModel();
		lmodel.setUsername("abc");
		lmodel.setPass("abc");
		lmodel = vrepoImpl.isValidate(lmodel);
		System.out.println(lmodel);
	}
}
