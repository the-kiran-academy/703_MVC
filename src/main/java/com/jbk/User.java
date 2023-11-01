package com.jbk;

public class User {
	
	private String username;
	private String passwordd;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public String getPasswordd() {
		return passwordd;
	}

	public void setPasswordd(String passwordd) {
		this.passwordd = passwordd;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + passwordd + "]";
	}
	
	

}
