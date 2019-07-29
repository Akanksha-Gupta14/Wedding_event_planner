package com.client;

import com.google.gwt.core.client.GWT;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.data.component.*;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.*;
import gwt.material.design.addins.client.*;
import gwt.material.design.addins.client.window.MaterialWindow;

import gwt.material.design.client.ui.MaterialLink;

public class slider extends Composite  {

	private static sliderUiBinder uiBinder = GWT.create(sliderUiBinder.class);

	interface sliderUiBinder extends UiBinder<Widget, slider> {
	}
	@UiField
	MaterialSlider slider1;

}
