package com.pda.springdemobm.model;

public class AppUser {
	private Long userID;
	private String userName;
	private String encrytedPassword;
	
	public AppUser() {
		
	}

	public AppUser(Long userID, String userName, String encrytedPassword) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}
	
	@Override
    public String toString() {
        return this.userName + "/" + this.encrytedPassword;
    }
}
