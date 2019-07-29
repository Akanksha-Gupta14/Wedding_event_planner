package com.client;

import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class myspace {
	static myspace me=null;
	UserReg u=null;
	PlannerReg p=null;
	Layout1 ul=null;  //user login
	Plannerlogin pl=null;
	private myspace()
	{
		
	}
	static myspace getInstance()
	{
		if(me==null)
		{
			 me=new myspace();
		}
		return me;
		
	}
	public void koiFunction()
	{
		if(History.getToken().equals("aa"))
		{
			RootPanel.get("b").clear();
			RootPanel.get("b").add(getUserReg());
		}
		else if(History.getToken().equals("bb"))
		{
			RootPanel.get("b").clear();
			RootPanel.get("b").add(getPlannerReg());
		}
		else if(History.getToken().equals("cc"))
		{
			RootPanel.get("b").clear();
			RootPanel.get("b").add(getLayout1());
		}
		else if(History.getToken().equals("dd"))
		{
			RootPanel.get("b").clear();
			RootPanel.get("b").add(getPlannerlogin());
		}
	}
	UserReg getUserReg() {
		// TODO Auto-generated method stub
		if(u==null)
		{
			u=new UserReg();
		}
		return u;
	}
	PlannerReg getPlannerReg()
	{
		if(p==null)
		{
			p=new PlannerReg();
		}
		return p;
		
	}
	
	Layout1 getLayout1()
	{
		if(ul==null)
		{
			ul=new Layout1();
		}
		return ul;
		
	}
	Plannerlogin getPlannerlogin()
	{
		if(pl==null)
		{
			pl=new Plannerlogin();
		}
		return pl;
		
	}
	

}
