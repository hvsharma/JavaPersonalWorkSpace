package com.harsh.model;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class AppUser implements SQLData
{
	private String userID;
	private String username;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String authLevel;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAuthLevel() {
		return authLevel;
	}
	public void setAuthLevel(String authLevel) {
		this.authLevel = authLevel;
	}
	
	public AppUser(String userID, String username, String firstName, String middleName, String lastName, String email,
			String authLevel) {
		
		this.userID = userID;
		this.username = username;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.authLevel = authLevel;
	}
	
	public AppUser()
	{
		
	}
	
	@Override
	public String getSQLTypeName() throws SQLException {
		return "APPUSER_TYPE";
	}
	@Override
	public void readSQL(SQLInput stream, String typeName) throws SQLException {
		this.userID = stream.readString();
		this.username = stream.readString();
		this.firstName = stream.readString();
		this.middleName = stream.readString();
		this.lastName = stream.readString();
		this.email = stream.readString();
		this.authLevel = stream.readString();		
	}
	@Override
	public void writeSQL(SQLOutput stream) throws SQLException {
		stream.writeString(this.userID);
		stream.writeString(this.username);
		stream.writeString(this.firstName);
		stream.writeString(this.middleName);
		stream.writeString(this.lastName);
		stream.writeString(this.email);
		stream.writeString(this.authLevel);		
	}	
	
}
