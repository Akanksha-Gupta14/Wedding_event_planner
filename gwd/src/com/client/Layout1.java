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
//import com.google.gwt.material.design.client.ui;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.*;

public class Layout1 extends Composite {

	private static Layout1UiBinder uiBinder = GWT.create(Layout1UiBinder.class);
	GreetingServiceAsync a2 = GWT.create(GreetingService.class);

	interface Layout1UiBinder extends UiBinder<Widget, Layout1> {
	}

	public Layout1() {
		initWidget(uiBinder.createAndBindUi(this));
		login1.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("b").clear();
				RootPanel.get("a").clear();
				
				

				String k1 = t1.getText();
				String k2 = t2.getText();
				a2.loginU(k1, k2, new AsyncCallback<String>() {
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						if (result.equals("YES")) {
							MaterialToast.fireToast("Welcome");
							//Window.alert("Successful");
							RootPanel.get("a").add(new Dash1(k1));
							
							/*String u=t1.getText();
							MaterialToast.fireToast(u);*/
							

						} 
						else
						{
							RootPanel.get("b").clear();
							RootPanel.get("a").clear();
							RootPanel.get("a").add(new Layout2());
							//Window.alert("try again");
							MaterialToast.fireToast("Registered First or Check your credential");
							
						}
							
						   

					}

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
					}
				});
				//RootPanel.get("a").add(new Dash1());

			}
		});
	}

	@UiField
	MaterialButton login1;
	@UiField
	MaterialTextBox t1;
	@UiField
	MaterialTextBox t2;
	@UiField
	MaterialLink t3;
	@UiHandler("t3")
	void onClick(ClickEvent e) {
		RootPanel.get("b").clear();
		RootPanel.get("b").add(new UserReg());
	}

}
