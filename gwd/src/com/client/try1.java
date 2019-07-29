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

public class try1 extends Composite {

	private static try1UiBinder uiBinder = GWT.create(try1UiBinder.class);

	interface try1UiBinder extends UiBinder<Widget, try1> {
	}

	public try1() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	

}
