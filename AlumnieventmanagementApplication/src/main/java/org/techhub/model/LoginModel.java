package org.techhub.model;

public class LoginModel 
{
	private String username;
	private String Password;
	private String Contact;
	private String Email;
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
	public void setContact(String Contact)
	{
		this.Contact = Contact;
	}
	public String getContact()
	{
		return Contact;
	}
	public void setemail(String Email)
	{
		this.Email = Email;
	}
	public String getEmail()
	{
		return Email;
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
