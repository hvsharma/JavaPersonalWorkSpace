package com.harsh.jwtexploration;

import java.io.Serializable;

public class Role implements Serializable {
	
	private static final long serialVersionUID = 4228315299985898392L;
	

	private String roleGUID;		
	private String roleName;	
	private String roleShortName;

	public Role(String roleGUID, String roleName, String roleShortName) {
		super();
		this.roleGUID = roleGUID;
		this.roleName = roleName;
		this.roleShortName = roleShortName;
	}
	
	public Role() {
		
	}	

	@Override
	public String toString() {
		return "Role [" + (roleGUID != null ? "roleGUID=" + roleGUID + ", " : "")
				+ (roleName != null ? "roleName=" + roleName + ", " : "")
				+ (roleShortName != null ? "roleShortName=" + roleShortName + ", " : "");
	}

	public String getRoleGUID() {
		return roleGUID;
	}

	public void setRoleGUID(String roleGUID) {
		this.roleGUID = roleGUID;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleShortName() {
		return roleShortName;
	}

	public void setRoleShortName(String roleShortName) {
		this.roleShortName = roleShortName;
	}
		
}
