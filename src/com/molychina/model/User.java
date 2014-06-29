package com.molychina.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1755239720936610118L;

	private int userId;
	private String uname;
	private String passwd;
	private String address;
	private String email;
	
	/**
	 * 是否通过认证
	 */
	private String pass;
	
	/**
	 * 注册时间
	 */
	private String regDate;
	
	/**
	 * 账户过期时间
	 */
	private String endDate;
	
	/**
	 * 最后一次登录时间
	 */
	private String lastLoginDate;
	
	private String IP;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
