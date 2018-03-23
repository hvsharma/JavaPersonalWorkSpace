package com.harsh.jwtexploration;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	
	private static final long serialVersionUID = -64229053147851757L;
	
	private String userGUID;	
	private String name;		
	private String email;	
	private List<Role> roles;	
	
	public User(String userGUID, String name, String email, List<Role> roles) {
		this.userGUID = userGUID;
		this.name = name;
		this.email = email;
		this.roles = roles;	
	}
	
	public User() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [");
		if (userGUID != null)
			builder.append("userGUID=").append(userGUID).append(", ");
		if (name != null)
			builder.append("name=").append(name).append(", ");
		if (email != null)
			builder.append("email=").append(email).append(", ");
		if (roles != null)
			builder.append("roles=").append(roles).append(", ");
		builder.append("]");
		return builder.toString();

	}

	public String getUserGUID() {
		return userGUID;
	}
	
	public void setUserGUID(String userGUID) {
		this.userGUID = userGUID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
			
}
