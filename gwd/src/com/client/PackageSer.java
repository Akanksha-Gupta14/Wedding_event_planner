package com.client;

import com.google.gwt.core.client.GWT;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialListValueBox;
import gwt.material.design.client.ui.MaterialToast;

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

public class PackageSer extends Composite  {

	private static PackageSerUiBinder uiBinder = GWT.create(PackageSerUiBinder.class);

	interface PackageSerUiBinder extends UiBinder<Widget, PackageSer> {
	}

	public PackageSer() {
		initWidget(uiBinder.createAndBindUi(this));
		select.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				//RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("c").clear();
				MaterialToast.fireToast("Planner selected");
				RootPanel.get("a").add(new PlannerSer());
				
			}
		});
         /*Back.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				//RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("c").clear();
				 MaterialToast.fireToast("Exit");
				RootPanel.get("a").add(new Dash1());
				
			}
		});*/
	}
	
	@UiField
	MaterialListBox location1;
    @UiField
    MaterialButton select;
    /*@UiField
    MaterialButton Back;*/
}
