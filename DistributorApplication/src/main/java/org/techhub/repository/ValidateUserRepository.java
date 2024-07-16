package org.techhub.repository;

import org.techhub.model.LoginModel;

public interface ValidateUserRepository 
{
	public LoginModel isValidate(LoginModel model);
}
