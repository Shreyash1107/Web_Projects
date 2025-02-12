package org.techhub.model;

public class LoginModel 
{
		private String Username;
		private String Password;
		private String Logintype;
		public void setUsername(String Username)
		{
			this.Username = Username;
		}
		public String getUsername()
		{
			return Username;
		}
		public void setPass(String Password)
		{
			this.Password = Password;
		}
		public String getPass()
		{
			return Password;
		}
		public void setsLogintype(String Logintype)
		{
			this.Logintype = Logintype;
		}
		public String getLogintype()
		{
			return Logintype;
		}
		public String toString()
		{
			return "[" + Username + ", " + Password + ", " + Logintype + "]";
		}
		public int hashcode()
		{
			return Username.length()*1000;
		}
		public boolean equals(Object obj)
		{
			LoginModel lm = (LoginModel)obj;
			if(lm.Username.equals(this.Username) && lm.Password.equals(this.Password) && lm.Logintype.equals(this.Logintype))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
