package org.techhub.model;

public class LoginModel 
{
	private String username;
	private String Password;
	private String Logintype;
	public void setusername(String username)
	{
		this.username = username;
	}
	public String getusername()
	{
		return username;
	}
	public void setsetpass(String Password)
	{
		this.Password = Password;
	}
	public String getPassword()
	{
		return Password;
	}
	public void setLogintype(String Logintype)
	{
		this.Logintype = Logintype;
	}
	public String getLogintype()
	{
		return Logintype;
	}
}
