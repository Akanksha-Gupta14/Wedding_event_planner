package com.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
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
import com.shared.aka;
import com.shared.pb;
import com.shared.request;

import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCollectionItem;
import gwt.material.design.client.ui.MaterialHeader;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.design.client.ui.MaterialToast;

public class Dash2 extends Composite  {

	private static Dash2UiBinder uiBinder = GWT.create(Dash2UiBinder.class);

	GreetingServiceAsync a1 = GWT.create(GreetingService.class);
	
	interface Dash2UiBinder extends UiBinder<Widget, Dash2> {
	}
	String k6;

	public Dash2(String k6)
	{
		initWidget(uiBinder.createAndBindUi(this));
		this.k6=k6;
		
		fun3(k6);
		
	}
	
	
	public Dash2() {
		initWidget(uiBinder.createAndBindUi(this));
		this.k6=k6;
		fun3(k6);
		/*GWT.runAsync(new RunAsyncCallback() {
			
			@Override
			public void onSuccess() {
				// TODO Auto-generated method stub
				logout.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						
						RootPanel.get("a").clear();
						RootPanel.get("b").clear();
						 MaterialToast.fireToast("logged out");
						RootPanel.get("a").add(new Layout2());
						
					}
				});
				PServices.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						
						//RootPanel.get("a").clear();
						RootPanel.get("b").clear();
						RootPanel.get("b").add(new PlannerSer());
						
					}
				});
				request.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
					
						
						RootPanel.get("a").clear();
						RootPanel.get("b").clear();
						RootPanel.get("c").clear();
						RootPanel.get("a").add(new PRequest());
						UserSer u=new UserSer();
						String y=u.t1.getText();
						MaterialToast.fireToast(y);
						PRequest pr=new PRequest();
						a1.PlannerR(y, new AsyncCallback<request>() {
							
							@Override
							public void onSuccess(request re) {
								// TODO Auto-generated method stub
								pr.t1.setText(re.getUname());
								pr.t1.setReadOnly(true);
								
							}
							
							@Override
							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								
							}
						});

						
					}
				});
				
			}
			
			@Override
			public void onFailure(Throwable reason) {
				// TODO Auto-generated method stub
				
			}
		});
		
	 
	  RootPanel.get("b").add(cards);
		 */
	 
	}
	String fun3(String k6)
	{
		this.k6=k6;
		logout.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				 MaterialToast.fireToast("Thank You");
				RootPanel.get("a").add(new Layout2());
				
			}
		});
		PServices.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				
				//RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("b").add(new PlannerSer());
				
			}
		});
		request.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
			
				String s=k6;
				PRequest pr=new PRequest();
				/*pr.t1.setText(s);
				pr.t1.setReadOnly(true);*/
				//RootPanel.get("a").clear();
				RootPanel.get("b").clear();
				RootPanel.get("c").clear();
				RootPanel.get("b").add(pr);
				
				MaterialToast.fireToast(k6);
				
				a1.PlannerR(s, new AsyncCallback<pb>() {

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub
						
					}					
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
							pr.t1.add(mci);
							
					
						}
						
					}
					

				});
			}
		});
       /* GWT.runAsync(new RunAsyncCallback() {
			
			@Override
			public void onSuccess() {
				// TODO Auto-generated method stub
				logout.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						
						RootPanel.get("a").clear();
						RootPanel.get("b").clear();
						 MaterialToast.fireToast("Thank You");
						RootPanel.get("a").add(new Layout2());
						
					}
				});
				PServices.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						
						//RootPanel.get("a").clear();
						RootPanel.get("b").clear();
						RootPanel.get("b").add(new PlannerSer());
						
					}
				});
				request.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
					
						String s=k6;
						PRequest pr=new PRequest();
						pr.t1.setText(s);
						pr.t1.setReadOnly(true);
						RootPanel.get("a").clear();
						RootPanel.get("b").clear();
						RootPanel.get("c").clear();
						RootPanel.get("a").add(pr);
						
						MaterialToast.fireToast(k6);
						
						a1.PlannerR(s, new AsyncCallback<pb>() {

							@Override
							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								
							}

							@Override
							public void onSuccess(pb result) {
								// TODO Auto-generated method stub
								
							}
							
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
									pr.t1.add(mci);
									
							
								}
								
							}
							

						});
					}
				});
			}
			
			@Override
			public void onFailure(Throwable reason) {
				// TODO Auto-generated method stub
				
			}
		});*/
	  RootPanel.get("b").add(cards);
		 return k6;
	}
	

MaterialHeader header;
@UiField
MaterialLink home;
@UiField
MaterialLink logout;
@UiField
MaterialLink PServices;
@UiField
MaterialRow cards;
@UiField
MaterialLink request;


@UiHandler("home")
void onClick(ClickEvent e) {
RootPanel.get("b").clear();	
	RootPanel.get("b").add(cards);	
	}

}
