package com.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.shared.abc;
import com.shared.aka;
import com.shared.pb;
import com.shared.request;
import com.shared.xyz;


import gwt.material.design.client.ui.MaterialTextBox;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	
	void UServices(String s1,AsyncCallback<aka> asyncCallback) throws IllegalArgumentException;
	void plannerName(String s1,String s2,AsyncCallback<pb> asyncCallback) throws IllegalArgumentException;
	void loginU(String s1,String s2, AsyncCallback<String> asyncCallback) throws IllegalArgumentException;
	void loginP(String s3,String s4, AsyncCallback<String> asyncCallback) throws IllegalArgumentException;
	void services(aka xz, AsyncCallback<aka> callback)throws IllegalArgumentException;
	void user(xyz xx, AsyncCallback<xyz> callback)throws IllegalArgumentException;
	void planner(abc xy, AsyncCallback<abc> callback)throws IllegalArgumentException;
	void UserRequest(String r,String s, AsyncCallback<String> asyncCallback);
   // void PlannerR(String p,AsyncCallback<request> asyncCallback);
	void PlannerR(String p,AsyncCallback<pb> asyncCallback);
  //void user(String name,String address,String email,String password,String confirm,AsyncCallback<String> callback)throws IllegalArgumentException;
}
