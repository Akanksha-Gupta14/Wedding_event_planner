package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.xyz;
import com.shared.aka;
import gwt.material.design.client.ui.*;

public class PlannerSer extends Composite {

	private static P_serivicesUiBinder uiBinder = GWT.create(P_serivicesUiBinder.class);
    GreetingServiceAsync a5=GWT.create(GreetingService.class);
	interface P_serivicesUiBinder extends UiBinder<Widget, PlannerSer> {
	}
int x=0,a=0,b=0,c=0,y=0,e=0;
String s1,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,s2,s3,s4,s6;

	public PlannerSer() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
		t19.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
                s1=t1.getText();
				 s4=t20.getText();
        		s6=t21.getText();
				if(t2.isChecked()){
					//do what you want 
					 d1="open area";
				 x=100000;
				}
				
				else if(t3.isChecked()){
					//do what you want 
					 d1="closed area";
				 x=100000;
				}
				
				
				if(t4.isChecked()){
					//do what you want 
					 d2="gold ";
				 a=200000;
				}
				
				else if(t5.isChecked()){
					//do what you want 
					 d2="silver";
				 a=200000;
				}
				
				else if(t6.isChecked()){
					//do what you want 
					 d2="platinum";
				 a=20000;
				}
				
				
				if(t7.isChecked()){
					//do what you want 
					 d3="Breakfast";
				 b=150000;
				}
				
				else if(t8.isChecked()){
					//do what you want 
					 d3="lunch";
				 b=200000;
				}
				
				else if(t9.isChecked()){
					//do what you want 
					 d3="dinner";
				 b=250000;
				}
				
				
				if(t10.isChecked()){
					//do what you want 
					 d4="10";
				 c=100000;
				}
				
				
				else if(t11.isChecked()){
					//do what you want 
					 d4="20";
				 c=200000;
				}
				
				else if(t12.isChecked()){
					//do what you want 
					 d4="30";
				 c=300000;
				}
				
				
				
				if(t13.isChecked()){
					//do what you want 
					 d5="all check";
				 e=100000;
				}
									
				else if(t14.isChecked()){
					//do what you want 
					 d5="trasport";
				 e=200000;
				}
				
				else if(t15.isChecked()){
					//do what you want 
					 d5="Dj";
				 e=300000;
				}
				
				else if(t16.isChecked()){
					//do what you want 
					 d6="special guest(celebrity)";
				 e=300000;
				}
				
				int d=x+a+b+c+y+e;
				
				String s5=Integer.toString(d);
				aka x3=new aka();
				x3.setCname(s4);
				x3.setGathering(s1);
				x3.setVenue(d1);
				x3.setDecoration(d2);
				x3.setCaterer(d3);
				x3.setLabour(d4);
				x3.setAddon(d5);
				x3.setTotal(s5);
				x3.setClocation(s6);

				MaterialToast.fireToast("Total amount"+s5);
				a5.services(x3, new AsyncCallback<aka>() {
					@Override
					public void onSuccess(aka result) {
						// TODO Auto-generated method stub
						//if (result.equals("YES")) {
							//MaterialToast.fireToast("services entered");
							Window.alert("Successful");
							//RootPanel.get("a").add(new Dash1());

						//} 
						/*else
						{
							RootPanel.get("b").clear();
							RootPanel.get("a").clear();
							RootPanel.get("a").add(new Layout2());
							Window.alert("something went wrong");
							
						}*/
							
						   

					}

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						Window.alert("caught");
					}

					
				});
				
			}
		});
           
		t19.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				MaterialToast.fireToast("Successful");
				RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("c").clear();
				RootPanel.get("a").add(new Dash1());
				
			}
		});
		 /*Back1.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
				
					RootPanel.get("a").clear();
					RootPanel.get("b").clear();
					RootPanel.get("c").clear();
					 MaterialToast.fireToast("Exit");
					RootPanel.get("a").add(new Dash1());
					
				}
			});*/
		
	}
	
	
@UiField
MaterialButton t19;



@UiField
MaterialTextBox t20;

@UiField
MaterialTextBox t21;


@UiField
MaterialTextBox t1;

@UiField
MaterialRadioButton t2;

@UiField
MaterialRadioButton t3;

@UiField
MaterialRadioButton t4;

@UiField
MaterialRadioButton t5;

@UiField
MaterialRadioButton t6;

@UiField
MaterialRadioButton t7;

@UiField
MaterialRadioButton t8;

@UiField
MaterialRadioButton t9;

@UiField
MaterialRadioButton t10;

@UiField
MaterialRadioButton t11;

@UiField
MaterialRadioButton t12;

@UiField
MaterialCheckBox t13;

@UiField
MaterialCheckBox t14;

@UiField
MaterialCheckBox t15;

@UiField
MaterialCheckBox t16;

@UiField
MaterialCheckBox t17;
/*@UiField
MaterialButton Back1;*/


}
