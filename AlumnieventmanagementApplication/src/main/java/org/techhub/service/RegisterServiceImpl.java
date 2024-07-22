package org.techhub.service;

import org.techhub.model.LoginModel;
import org.techhub.repository.DBParent;
import org.techhub.repository.Registerrepository;
import org.techhub.repository.RegisterrepositoryImpl;

public class RegisterServiceImpl extends DBParent implements RegisterService
{
	Registerrepository regrepo = new RegisterrepositoryImpl();
	public LoginModel isaAlumniregister(LoginModel model)
	{
		return regrepo.isalumniRegister(model);
	}
}
