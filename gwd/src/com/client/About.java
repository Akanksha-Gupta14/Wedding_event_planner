package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextArea;

public class About extends Composite  {

	private static AboutUiBinder uiBinder = GWT.create(AboutUiBinder.class);

	interface AboutUiBinder extends UiBinder<Widget, About> {
	}

	public About() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
    @UiField
    MaterialDialog dialog;
	@UiField
	MaterialTextArea t1;
	@UiField
	MaterialButton btnCloseDialog;
	@UiField
	MaterialButton btnDialog;
	@UiHandler("btnDialog")
    void onDialog(ClickEvent e) {
        dialog.open();
    }
	@UiHandler("btnCloseDialog")
    void onCloseDialog(ClickEvent e){
        dialog.close();
    }
	
}
