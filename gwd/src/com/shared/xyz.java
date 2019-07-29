package com.shared;

import java.io.Serializable;

public class xyz implements Serializable{

	public String FullName;
	public String Email;
	public String Address;
	public String MobileNo;
	public String Password;
	public String ConPass;
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConPass() {
		return ConPass;
	}
	public void setConPass(String conPass) {
		ConPass = conPass;
	}
}
