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
import com.google.gwt.user.client.ui.ButtonBase;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.pb;
import com.shared.request;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class UserSer extends Composite  {

	private static UserSerUiBinder uiBinder = GWT.create(UserSerUiBinder.class);
    
	 GreetingServiceAsync a2=GWT.create(GreetingService.class);
	String k5;
	interface UserSerUiBinder extends UiBinder<Widget, UserSer> {
	}
    public UserSer(String k5)
    {
    	initWidget(uiBinder.createAndBindUi(this));
    	this.k5=k5;
    	fun2(k5);
    }
	
	
		
	public UserSer() {
		
		initWidget(uiBinder.createAndBindUi(this));
		fun2(k5);
          /* select.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				
				
				String p=t1.getText();
				MaterialToast.fireToast(p);
				
				RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("a").add(new Dash1());
				
				
			}
		});*/
	}

	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t7;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialTextBox t3;
	@UiField
	MaterialTextBox t4;
	@UiField
	MaterialTextBox t5;
	@UiField
	MaterialTextBox t6;
	@UiField
	MaterialTextBox t8;
	@UiField
	MaterialButton select;
	String fun2(String k5)
	{
		select.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				//
				
				MaterialToast.fireToast(k5);
				
				Layout1 l1=new Layout1();
				String u=l1.t1.getText();
				//MaterialToast.fireToast(u);
				String p=t1.getText();
				//MaterialToast.fireToast(p);
				Dash2 d=new Dash2(p);
				RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("a").add(new Dash1());
				a2.UserRequest(p,k5,new AsyncCallback<String>() {

							@Override
							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								
							}

							

							@Override
							public void onSuccess(String result) {
								// TODO Auto-generated method stub
								
								Window.alert("Thank you for selecting");
								
							}
							
							
							
							
						});
						
				
				
				
			}
		});
		return k5;
	}
	
	/*@UiHandler("select")
	void onClick(ClickEvent e) {
		a2.UPname(String k1,String k2,new AsyncCallback<pb>())
		{
			
		}
		
		
		
	}
	*/
	

	


	/*public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}*/

}
