package com.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.shared.abc;
import com.shared.aka;
import com.shared.pb;
import com.shared.request;
import com.shared.xyz;

import gwt.material.design.client.ui.MaterialTextBox;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	pb plannerName(String s1,String s2)throws IllegalArgumentException;
	String loginU(String s1,String s2) throws IllegalArgumentException;
	String loginP(String s3,String s4) throws IllegalArgumentException;
	aka services(aka x3)throws IllegalArgumentException;
	aka UServices(String s1)throws IllegalArgumentException;
	 xyz user(xyz x1)throws IllegalArgumentException;
	abc planner(abc x2)throws IllegalArgumentException;
	String UserRequest(String r,String s)throws IllegalArgumentException;
	//request PlannerR(String p)throws IllegalArgumentException;
	pb PlannerR(String p)throws IllegalArgumentException;
	
 // String user(String name,String address,String email,String password,String confirm)throws IllegalArgumentException;
}
