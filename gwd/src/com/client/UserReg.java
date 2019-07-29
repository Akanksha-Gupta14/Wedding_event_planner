package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.xyz;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class UserReg extends Composite  {

	private static NavUiBinder uiBinder = GWT.create(NavUiBinder.class);
	 GreetingServiceAsync a1 = GWT.create(GreetingService.class); 

	interface NavUiBinder extends UiBinder<Widget,UserReg> {
	}

	public UserReg() {
		initWidget(uiBinder.createAndBindUi(this));
           t9.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				
				//RootPanel.get("a").clear();
				
				 
				 RootPanel.get("b").clear();
				RootPanel.get("b").add(new Layout1());
				
				xyz x1=new xyz();
				x1.setFullName(t3.getText());
				x1.setEmail(t4.getText());
				x1.setAddress(t5.getText());
				x1.setMobileNo(t6.getText());
				x1.setPassword(t7.getText());
				x1.setConPass(t8.getText());
				
				a1.user(x1,new AsyncCallback<xyz>() {
					
					@Override
					public void onSuccess(xyz result) {
						// TODO Auto-generated method stub
						MaterialToast.fireToast("Registration Successful");
						Window.alert("success");
					}
					
					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						Window.alert("caught");
					}
				});
				
				
			}
		});
	}

	
	@UiField
	MaterialTextBox t3;
	@UiField
	MaterialTextBox t4;
	@UiField
	MaterialTextBox t5;
	@UiField
	MaterialTextBox t6;
	@UiField
	MaterialTextBox t7;
	@UiField
	MaterialTextBox t8;
	
	@UiField
	MaterialButton t9;
	
	
	
		
	}


