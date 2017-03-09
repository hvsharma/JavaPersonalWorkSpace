package com.harsh.demo;

import java.sql.SQLException;
import com.harsh.dao.LoginDAO;
import com.harsh.model.AppUser;
import com.harsh.model.Login;


public class LoginUtil 
{
	private String username;
	private String pwd;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String attemptLogIn()
	{
		AppUser user=null;
		Login loginObj = new Login(this.username, this.pwd);
		
		try 
		{
			
			user = LoginDAO.validateCredentials(loginObj);
			
			if(user!=null)
			{
				SessionUtils.getSession().setAttribute("user", user);
				System.out.println("Success...!");
				return Constants.loginSuccess;
			}
			else
			{
				System.out.println("Failure...!");
				return Constants.loginError;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return Constants.loginError;
		}
				
	}
	
	public String logOut()
	{
		if(SessionUtils.getSession().getAttribute("user")!=null)
		{
			SessionUtils.getSession().setAttribute("user", null);				
		}		
		
		return "login";
	}
}
