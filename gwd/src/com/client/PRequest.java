package com.client;

import com.google.gwt.core.client.GWT;
import gwt.material.design.client.ui.*;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class PRequest extends Composite  {

	private static pqrUiBinder uiBinder = GWT.create(pqrUiBinder.class);
     
	GreetingServiceAsync a1=GWT.create(GreetingService.class);
	
	interface pqrUiBinder extends UiBinder<Widget, PRequest> {
	}

	String k7;
	public PRequest() {
		initWidget(uiBinder.createAndBindUi(this));
		
           
	}

	@UiField
	MaterialCollection t1;
	

}