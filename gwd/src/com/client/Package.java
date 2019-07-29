package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shared.aka;
import com.shared.pb;

import gwt.material.design.client.ui.MaterialListBox;
import gwt.material.design.client.ui.MaterialListValueBox;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavSection;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialCollection;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialColumn;
import gwt.material.design.client.ui.MaterialDropDown;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialSearch;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

public class Package extends Composite  {

	private static Nav1UiBinder uiBinder = GWT.create(Nav1UiBinder.class);
    GreetingServiceAsync a1=GWT.create(GreetingService.class);
    GreetingServiceAsync a2=GWT.create(GreetingService.class);
	interface Nav1UiBinder extends UiBinder<Widget, Package> {
	}
    String s1,s2,s3,s4,s5,s6,k4;
    
    public Package(String k4) {
		initWidget(uiBinder.createAndBindUi(this));
		this.k4=k4;
		 fun1(k4);
       
	}
    
    
	public Package() {
		initWidget(uiBinder.createAndBindUi(this));
		 fun1(k4);
       
	}
	@UiField
	MaterialListBox location,budget;
	@UiField
	MaterialCollection t1;
	@UiField
	MaterialButton b1;
	
	String fun1(String k4) {
		
            b1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				
				
				
					
							
				    //MaterialToast.fireToast(k4);
					
					String l=location.getSelectedItemText();
					String b=budget.getSelectedItemText();
					//MaterialToast.fireToast(l);
					//MaterialToast.fireToast(b);
					a1.plannerName(l, b, new AsyncCallback<pb>() {
						
						@Override
						public void onSuccess(pb result) {
							// TODO Auto-generated method stub
							int n;
							n=result.getN();
							String a[]=new String[n];
							a=result.getA();
							for(int i=0;i<n;i++)
							{
								MaterialCollectionItem mci=new MaterialCollectionItem();
								MaterialLink ml=new MaterialLink();
								ml.setText(a[i]);
								ml.setTextColor(Color.PINK_DARKEN_3);
								mci.add(ml);
								t1.add(mci);
								mci.addClickHandler(new ClickHandler() {
									
									@Override
									public void onClick(ClickEvent event) {
										// TODO Auto-generated method stub
										String x=ml.getText();
										UserSer u=new UserSer(k4);
										RootPanel.get("b").clear();
										RootPanel.get("b").add(u);
										
										u.t1.setText(x);
										u.t1.setReadOnly(true);
										a2.UServices(x, new AsyncCallback<aka>() {
											
											@Override
											public void onSuccess(aka r) {
												// TODO Auto-generated method stub
												u.t7.setText(r.getGathering());
												u.t7.setReadOnly(true);
												u.t2.setText(r.getVenue());
												u.t2.setReadOnly(true);
												u.t3.setText(r.getDecoration());
												u.t3.setReadOnly(true);
												u.t4.setText(r.getCaterer());
												u.t4.setReadOnly(true);
												u.t5.setText(r.getLabour());
												u.t5.setReadOnly(true);
												u.t6.setText(r.getAddon());
												u.t6.setReadOnly(true);
												u.t8.setText(r.getTotal());
												u.t8.setReadOnly(true);
												
											}
											
											@Override
											public void onFailure(Throwable caught) {
												// TODO Auto-generated method stub
												
											}
										});

										
										
									}
								});
						
							}
							
						}
						
						@Override
						public void onFailure(Throwable caught) {
							// TODO Auto-generated method stub
							
						}
					});
					
				}
				
				
				
				
				
			
		});
			return k4;
		
		
	}
	
}
	
	
	
		/*@UiHandler("b1")
		void  onClick(ClickEvent e) 
		{
			
					
			
			
			String l=location.getSelectedItemText();
			String b=budget.getSelectedItemText();
			MaterialToast.fireToast(l);
			MaterialToast.fireToast(b);
			a1.plannerName(l, b, new AsyncCallback<pb>() {
				
				@Override
				public void onSuccess(pb result) {
					// TODO Auto-generated method stub
					int n;
					n=result.getN();
					String a[]=new String[n];
					a=result.getA();
					for(int i=0;i<n;i++)
					{
						MaterialCollectionItem mci=new MaterialCollectionItem();
						MaterialLink ml=new MaterialLink();
						ml.setText(a[i]);
						ml.setTextColor(Color.BLUE);
						mci.add(ml);
						t1.add(mci);
						mci.addClickHandler(new ClickHandler() {
							
							@Override
							public void onClick(ClickEvent event) {
								// TODO Auto-generated method stub
								String x=ml.getText();
								UserSer u=new UserSer();
								RootPanel.get("b").clear();
								RootPanel.get("b").add(u);
								u.t1.setText(x);
								u.t1.setReadOnly(true);
								a2.UServices(x, new AsyncCallback<aka>() {
									
									@Override
									public void onSuccess(aka r) {
										// TODO Auto-generated method stub
										u.t7.setText(r.getGathering());
										u.t7.setReadOnly(true);
										u.t2.setText(r.getVenue());
										u.t2.setReadOnly(true);
										u.t3.setText(r.getDecoration());
										u.t3.setReadOnly(true);
										u.t4.setText(r.getCaterer());
										u.t4.setReadOnly(true);
										u.t5.setText(r.getLabour());
										u.t5.setReadOnly(true);
										u.t6.setText(r.getAddon());
										u.t6.setReadOnly(true);
										u.t8.setText(r.getTotal());
										u.t8.setReadOnly(true);
										
									}
									
									@Override
									public void onFailure(Throwable caught) {
										// TODO Auto-generated method stub
										
									}
								});

								
								
							}
						});
				
					}
					
				}
				
				@Override
				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					
				}
			});
			
		}*/
	
	
	
		/*t1.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("c").clear();
				 MaterialToast.fireToast("You clicked me");
				RootPanel.get("c").add(new PackageSer());
			}
		});
        t2.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("c").clear();
				 MaterialToast.fireToast("You clicked me");
				RootPanel.get("c").add(new PackageSer());
			}
		});
        t3.addClickHandler(new ClickHandler() {
	
	     @Override
	     public void onClick(ClickEvent event) {
	    	 RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("c").clear();
		 RootPanel.get("c").add(new PackageSer());
	     }
         });*/
		
	

	
	/*@UiField
	MaterialButton t1;
	@UiField
	MaterialButton t2;
	@UiField
	MaterialButton t3;*/
	
	
	
	

