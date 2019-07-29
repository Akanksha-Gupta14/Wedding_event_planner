package com.shared;
import java.io.Serializable;

public class abc implements Serializable {
	public String cname;
	public String cemail;
	public String caddress;
	public String cmobileNo;
	public String clocation;
	public String getClocation() {
		return clocation;
	}
	public void setClocation(String clocation) {
		this.clocation = clocation;
	}
	public String cpassword;
	public String cconPass;
	public String cgstd;
	public String payment;
	
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCmobileNo() {
		return cmobileNo;
	}
	public void setCmobileNo(String cmobileNo) {
		this.cmobileNo = cmobileNo;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getCconPass() {
		return cconPass;
	}
	public void setCconPass(String cconPass) {
		this.cconPass = cconPass;
	}
	
	public String getCgstd() {
		return cgstd;
	}
	public void setCgstd(String cgstd) {
		this.cgstd = cgstd;
	}

}
