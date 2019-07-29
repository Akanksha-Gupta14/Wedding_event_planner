package com.client;

import com.shared.FieldVerifier;

import gwt.material.design.client.ui.MaterialButton;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


public class gwd implements EntryPoint {
 
  public void onModuleLoad() {
  
	//  RootPanel.get("a").add(new try2());
	  
	Layout2 l2=new Layout2();
      RootPanel.get("a").add(l2);
    /* l2.l.addClickHandler(new ClickHandler() {
		
		@Override
		public void onClick(ClickEvent event) {
			Layout1 l1=new Layout1();
			RootPanel.get("b").add(l1);
			
			
			
		}
	});*/
  }
}

