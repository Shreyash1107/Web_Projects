package org.techhub.service;

import org.techhub.model.LoginModel;
import org.techhub.repository.ValidateUserRepository;
import org.techhub.repository.ValidateUserRepositoryImpl;
public class ValidateUserserviceImpl implements  Validateuserservice
{
	ValidateUserRepository validrepo = new ValidateUserRepositoryImpl();
	public LoginModel isValidate(LoginModel model)
	{
		return validrepo.isValidate(model);
	}
}