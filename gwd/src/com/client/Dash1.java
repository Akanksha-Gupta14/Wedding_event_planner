package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavSection;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialDialog;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.client.ui.animate.MaterialAnimation;
import gwt.material.design.client.ui.animate.Transition;

public class Dash1 extends Composite {

	private static Nav1UiBinder uiBinder = GWT.create(Nav1UiBinder.class);

	interface Nav1UiBinder extends UiBinder<Widget, Dash1> {
	}

	String k1;

	public Dash1(String k1) {
		initWidget(uiBinder.createAndBindUi(this));
		fun();
		this.k1 = k1;
		
	}

	public Dash1() {
		initWidget(uiBinder.createAndBindUi(this));
		fun();

	}

	void fun() {
		GWT.runAsync(new RunAsyncCallback() {
			
			@Override
			public void onSuccess() {
				// TODO Auto-generated method stub
				logout.addClickHandler(new ClickHandler() {

					@Override
					public void onClick(ClickEvent event) {

						RootPanel.get("a").clear();
						RootPanel.get("b").clear();
						MaterialToast.fireToast("Thank you");
						RootPanel.get("a").add(new Layout2());

					}
				});
				Package1.addClickHandler(new ClickHandler() {

					@Override
					public void onClick(ClickEvent event) {

						RootPanel.get("b").clear();
						RootPanel.get("b").add(new Package(k1));

					}
				});

				
			}
			
			@Override
			public void onFailure(Throwable reason) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		RootPanel.get("b").add(cards);

	}

	MaterialHeader header;
	@UiField
	MaterialLink home;
	@UiField
	MaterialLink Package1;
	@UiField
	MaterialLink logout;
	/*
	 * @UiField MaterialLink PServices;
	 */
	@UiField
	MaterialRow cards;
	
	 @UiField
	 MaterialListBox lstAnimations;
	 @UiHandler("lstAnimations")
	    void onAnimateWithListBox(ValueChangeEvent<String> e) {
	        animate();
	    }

	    private void animate() {
	        String value = lstAnimations.getSelectedValue();
	        Transition transition = Transition.fromStyleName(value);
	        MaterialAnimation animation = new MaterialAnimation();
	        animation.setTransition(transition);
	        animation.setDelay(0);
	        animation.setDuration(1000);
	        animation.setInfinite(false);
	        animation.animate(cards);
	    }
	    @Override
	    protected void onAttach() {
	        super.onAttach();
	        lstAnimations.addItem("bounce", "bounce");
	        lstAnimations.addItem("flash", "flash");
	        lstAnimations.addItem("pulse", "pulse");
	        lstAnimations.addItem("rubberBand", "rubberBand");
	        lstAnimations.addItem("shake", "shake");
	        lstAnimations.addItem("headShake", "headShake");
	        lstAnimations.addItem("swing", "swing");
	        lstAnimations.addItem("tada", "tada");
	        lstAnimations.addItem("wobble", "wobble");
	        lstAnimations.addItem("jello", "jello");
	        lstAnimations.addItem("jello", "jello");
	        lstAnimations.addItem("bounceIn", "bounceIn");
	        lstAnimations.addItem("bounceInDown", "bounceInDown");
	        lstAnimations.addItem("bounceInLeft", "bounceInLeft");
	        lstAnimations.addItem("bounceInRight", "bounceInRight");
	        lstAnimations.addItem("bounceInUp", "bounceInUp");
	        lstAnimations.addItem("bounceOut", "bounceOut");
	        lstAnimations.addItem("bounceOutDown", "bounceOutDown");
	        lstAnimations.addItem("bounceOutLeft", "bounceOutLeft");
	        lstAnimations.addItem("bounceOutRight", "bounceOutRight");
	        lstAnimations.addItem("bounceOutUp", "bounceOutUp");
	        lstAnimations.addItem("fadeIn", "fadeIn");
	        lstAnimations.addItem("fadeInDown", "fadeInDown");
	        lstAnimations.addItem("fadeInDownBig", "fadeInDownBig");
	        lstAnimations.addItem("fadeInLeft", "fadeInLeft");
	        lstAnimations.addItem("fadeInLeftBig", "fadeInLeftBig");
	        lstAnimations.addItem("fadeInRight", "fadeInRight");
	        lstAnimations.addItem("fadeInRightBig", "fadeInRightBig");
	        lstAnimations.addItem("fadeInUp", "fadeInUp");
	        lstAnimations.addItem("fadeInUpBig", "fadeInUpBig");
	        lstAnimations.addItem("fadeOut", "fadeOut");
	        lstAnimations.addItem("fadeOutDown", "fadeOutDown");
	        lstAnimations.addItem("fadeOutDownBig", "fadeOutDownBig");
	        lstAnimations.addItem("fadeOutLeft", "fadeOutLeft");
	        lstAnimations.addItem("fadeOutLeftBig", "fadeOutLeftBig");
	        lstAnimations.addItem("fadeOutRight", "fadeOutRight");
	        lstAnimations.addItem("fadeOutRightBig", "fadeOutRightBig");
	        lstAnimations.addItem("fadeOutUp", "fadeOutUp");
	        lstAnimations.addItem("fadeOutUpBig", "fadeOutUpBig");
	        lstAnimations.addItem("flipInX", "flipInX");
	        lstAnimations.addItem("flipInY", "flipInY");
	        lstAnimations.addItem("flipOutX", "flipOutX");
	        lstAnimations.addItem("flipOutY", "flipOutY");
	        lstAnimations.addItem("lightSpeedIn", "lightSpeedIn");
	        lstAnimations.addItem("lightSpeedOut", "lightSpeedOut");
	        lstAnimations.addItem("rotateIn", "rotateIn");
	        lstAnimations.addItem("rotateInDownLeft", "rotateInDownLeft");
	        lstAnimations.addItem("rotateInDownRight", "rotateInDownRight");
	        lstAnimations.addItem("rotateInUpLeft", "rotateInUpLeft");
	        lstAnimations.addItem("rotateInUpRight", "rotateInUpRight");
	        lstAnimations.addItem("rotateOut", "rotateOut");
	        lstAnimations.addItem("rotateOutDownLeft", "rotateOutDownLeft");
	        lstAnimations.addItem("rotateOutDownRight", "rotateOutDownRight");
	        lstAnimations.addItem("rotateOutUpLeft", "rotateOutUpLeft");
	        lstAnimations.addItem("rotateOutUpRight", "rotateOutUpRight");
	        lstAnimations.addItem("hinge", "hinge");
	        lstAnimations.addItem("rollIn", "rollIn");
	        lstAnimations.addItem("rollOut", "rollOut");
	        lstAnimations.addItem("zoomIn", "zoomIn");
	        lstAnimations.addItem("zoomInDown", "zoomInDown");
	        lstAnimations.addItem("zoomInLeft", "zoomInLeft");
	        lstAnimations.addItem("zoomInRight", "zoomInRight");
	        lstAnimations.addItem("zoomInUp", "zoomInUp");
	        lstAnimations.addItem("zoomOut", "zoomOut");
	        lstAnimations.addItem("zoomOutDown", "zoomOutDown");
	        lstAnimations.addItem("zoomOutLeft", "zoomOutLeft");
	        lstAnimations.addItem("zoomOutRight", "zoomOutRight");
	        lstAnimations.addItem("zoomOutUp", "zoomOutUp");
	        lstAnimations.addItem("slideInDown", "slideInDown");
	        lstAnimations.addItem("slideInLeft", "slideInLeft");
	        lstAnimations.addItem("slideInRight", "slideInRight");
	        lstAnimations.addItem("slideInUp", "slideInUp");
	        lstAnimations.addItem("slideOutDown", "slideOutDown");
	        lstAnimations.addItem("slideOutLeft", "slideOutLeft");
	        lstAnimations.addItem("slideOutRight", "slideOutRight");
	        lstAnimations.addItem("slideOutUp", "slideOutUp");
	    }
	@UiHandler("home")
	void onClick(ClickEvent e) {
		RootPanel.get("b").clear();
		RootPanel.get("b").add(cards);
	}

}
