package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.abc;
import com.shared.xyz;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRadioButton;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class PlannerReg extends Composite  {

	private static NavUiBinder uiBinder = GWT.create(NavUiBinder.class);
	 GreetingServiceAsync a3 = GWT.create(GreetingService.class); 

	interface NavUiBinder extends UiBinder<Widget,PlannerReg> {
	}
	String d1;
	public PlannerReg() {
		
		initWidget(uiBinder.createAndBindUi(this));
		t8.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				//RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				MaterialToast.fireToast("Registration Successful");
				RootPanel.get("b").add(new Plannerlogin());
				if(t9.isChecked()){
					//do what you want 
					 d1="credit card";
				 
				}
				
				else if(t10.isChecked()){
					//do what you want 
					 d1="debit card";
				 
				}
				abc x2=new abc();
				x2.setCname(t1.getText());
				x2.setCemail(t2.getText());
				//x2.setCaddress(t3.getText());
				x2.setCmobileNo(t11.getText());
				//x2.setClocation(t7.getText());
				x2.setCpassword(t4.getText());
				x2.setCconPass(t5.getText());
				x2.setCgstd(t6.getText());
				x2.setPayment(d1);
				
				a3.planner(x2,new AsyncCallback<abc>() {
					
					@Override
					public void onSuccess(abc result) {
						// TODO Auto-generated method stub
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
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	/*@UiField
	MaterialTextBox t3;*/
	@UiField
	MaterialTextBox t4;
	@UiField
	MaterialTextBox t5;
	@UiField
	MaterialTextBox t6;
	@UiField
	MaterialTextBox t11;
	/*@UiField
	MaterialTextBox t7;
*/	@UiField
	MaterialButton t8;
	@UiField
	MaterialRadioButton t9;
	@UiField
	MaterialRadioButton t10;
	
	
	
	
	
		
	}


