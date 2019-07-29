package com.shared;

import java.io.Serializable;

public class request implements Serializable{
	
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	
	String Uname;
	String Pname;
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	

}
