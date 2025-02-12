package org.techhub.repository;

import org.techhub.model.LoginModel;
import static java.lang.System.*;

public class LoginRepositoryImpl extends DB implements LoginRepository 
{
	public LoginModel isLoginSuccess(LoginModel model)
	{
		try
		{
			pstmt = conn.prepareStatement("select *from alumnilogin where username = ? and Password = ?");
			pstmt.setString(1, model.getUsername());
			pstmt.setString(2, model.getPassword());
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				model.setLogintype(rs.getString("Logintype"));
			}
			return model;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
}
