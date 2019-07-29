package com.client;

import com.google.gwt.core.client.GWT;
import com.shared.aka;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class Plannerlogin extends Composite{

	private static PlannerloginUiBinder uiBinder = GWT.create(PlannerloginUiBinder.class);
    GreetingServiceAsync a4=GWT.create(GreetingService.class);
	interface PlannerloginUiBinder extends UiBinder<Widget, Plannerlogin> {
	}

	public Plannerlogin() {
		initWidget(uiBinder.createAndBindUi(this));
		login2.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("b").clear();
				RootPanel.get("a").clear();
				
				

				String k3 = t3.getText();
				String k4 = t4.getText();
				a4.loginP(k3, k4, new AsyncCallback<String>() {
					@Override
					public void onSuccess(String result) {
						// TODO Auto-generated method stub
						if (result.equals("YES")) {
							MaterialToast.fireToast("Welcome");
							//Window.alert("Successful");
														
							RootPanel.get("a").add(new Dash2(k3));

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
	MaterialButton login2;
	@UiField
	MaterialTextBox t3;
	@UiField
	MaterialTextBox t4;
	@UiField
	MaterialLink t5;
	@UiHandler("t5")
	void onClick(ClickEvent e) {
		RootPanel.get("b").clear();
		RootPanel.get("b").add(new PlannerReg());
	}


}
