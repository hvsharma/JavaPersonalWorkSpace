package com.harsh.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Hashtable;
import com.harsh.demo.Constants;
import com.harsh.model.AppUser;
import com.harsh.model.Login;


public class LoginDAO 
{
	public static AppUser validateCredentials(Login loginObj) throws SQLException
	{
		AppUser user = null;
		
		try(
			 Connection connection = DatabaseConnection.getConnection();				
			 CallableStatement callableStatement = connection.prepareCall(Constants.validateCredentialsSP);
	       )
		{
			Hashtable<String, Class<?>> newMap = new Hashtable<String, Class<?>>();
			try 
			{
				newMap.put("DEMOJSFAPP.APPUSER_TYPE", Class.forName("com.harsh.model.AppUser"));
				connection.setTypeMap(newMap);
			} 
			catch (ClassNotFoundException e) 
			{				
				e.printStackTrace();
			}
			 
			callableStatement.setObject(1, loginObj.getUsername());
			callableStatement.setObject(2, loginObj.getPassword());
			callableStatement.registerOutParameter(3, Types.STRUCT, "APPUSER_TYPE" );
			callableStatement.execute();
			
			user = (AppUser) callableStatement.getObject(3);
		}
		catch(Exception ex)
		{
			throw ex;
		}
		
		return user;
	}
}
