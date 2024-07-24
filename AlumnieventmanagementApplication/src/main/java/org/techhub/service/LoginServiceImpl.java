package org.techhub.service;

import org.techhub.model.LoginModel;
import org.techhub.repository.LoginRepository;
import org.techhub.repository.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService 
{
	LoginRepository lrepo = new LoginRepositoryImpl();
	public LoginModel isLoginSuccess(LoginModel model) 
	{
		return lrepo.isLoginSuccess(model);
	}
}