	package com.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.client.GreetingService;
import com.fourspaces.couchdb.Database;
import com.fourspaces.couchdb.Document;
import com.fourspaces.couchdb.Session;
import com.shared.FieldVerifier;
import com.shared.abc;
import com.shared.aka;
import com.shared.pb;
import com.shared.request;
import com.shared.xyz;

import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.MaterialToast;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {
	Connection con = null;
	Statement st = null;

	public void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin", "root", "mysql");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//loginU
	@Override
	public String loginU(String s1, String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String ss = "NO";
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select * from user where email='" + s1 + "'and pass='" + s2 + "'");
			if (rs.next()) {
				ss = "YES";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return ss;
	}
	//loginP
	@Override
	public String loginP(String s3,String s4)throws IllegalArgumentException
	{
		init();
		
		String sr="No";
		ResultSet rr = null;
		try
		{
			rr = st.executeQuery("select * from planner where cname='" + s3 + "'and cpass='" + s4 + "'");
			if(rr.next())
			{
				sr="YES";
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return sr;
	}
	//user
	@Override
	public xyz user(xyz x1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		xyz yy=x1;
		String s1=x1.getFullName();
		String s2=x1.getEmail();
		String s3=x1.getAddress();
		String s4=x1.getMobileNo();
		String s5=x1.getPassword();
		String s6=x1.getConPass();
		
		String query = "INSERT INTO `user` (`name`, `email`, `address`, `mobile`, `pass`, `conpass`)"
		        + " values (?, ?, ?, ?, ?,?)";		
		PreparedStatement preparedStmt;
		try {
			 	preparedStmt = con.prepareStatement(query);
			 	preparedStmt.setString(1, s1);
		      preparedStmt.setString(2, s2);
		      preparedStmt.setString(3,s3);
		      preparedStmt.setString(4, s4);
		      preparedStmt.setString (5, s5);
		      preparedStmt.setString (6,s6);
		    
		      preparedStmt.execute();
		      System.out.println("query fired");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yy;
	}
	//package
	@Override
	public pb plannerName(String s1,String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		try
		{
			int i=0;
			int t=Integer.parseInt(s2);
			ResultSet rt;
			rt=st.executeQuery("select cname from service where clocation='" + s1 +"' and total <='" +t+"'");
			rt.last();
			int n=rt.getRow();
			rt.beforeFirst();
			String data[] = new String[n];
			pb pb1=new pb();
			pb1.setN(n);
			//System.out.println(n+"\n");
			while(rt.next())
			{
				data[i]=rt.getString(1);// enter the no. of name column
				//System.out.println(data[i]);
				i++;
			}
			pb1.setA(data);
			return pb1;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}

	//palnner
	
	@Override
	public abc planner(abc x2) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		
		abc yz=x2;
		String s1=x2.getCname();
		String s2=x2.getCemail();
		//String s3=x2.getCaddress();
		String s4=x2.getCmobileNo();
		String s5=x2.getCpassword();
		String s6=x2.getCconPass();
		String s7=x2.getCgstd();
		String s8=x2.getPayment();
		//String s8=x2.getClocation();
		String query = "INSERT INTO `planner` (`cname`, `cemail`, `cmobile`, `cpass`, `cconpass`,`cgstd`,`payment`)"
		        + " values (?, ?, ?, ?, ?,?,?)";		
		PreparedStatement preparedStmt;
		try {
			 	preparedStmt = con.prepareStatement(query);
			 	preparedStmt.setString(1, s1);
		      preparedStmt.setString(2, s2);
		     // preparedStmt.setString(3,s3);
		      preparedStmt.setString(3, s4);
		      preparedStmt.setString (4, s5);
		      preparedStmt.setString (5,s6);
		      preparedStmt.setString (6,s7);
		      preparedStmt.setString (7,s8);
		      
		    
		      preparedStmt.execute();
		      System.out.println("query fired");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return yz;
	}
	//UserServices
	
	@Override
	public aka UServices(String s1) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		ResultSet rr = null;
		aka a=new aka();
		try
		{
			rr = st.executeQuery("select * from service where cname='" + s1+  "'");
			while(rr.next())
			{
				
				a.setGathering(rr.getString(1));
				a.setVenue(rr.getString(2));
				a.setDecoration(rr.getString(3));
				a.setCaterer(rr.getString(4));
				a.setLabour(rr.getString(5));
				a.setAddon(rr.getString(6));
				a.setTotal(rr.getString(7));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return a;
	}
		
	
	//Plannerservices
	@Override
	public aka services(aka x3) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
	  
		//aka xw=x3;
		
		String s1=x3.getGathering();
		String s2=x3.getVenue();
		String s3=x3.getDecoration();
		String s4=x3.getCaterer();
		String s5=x3.getLabour();
		String s6=x3.getAddon();
		String s7=x3.getTotal();
		String s8=x3.getCname();
		String s9=x3.getClocation();
		
		String query = "INSERT INTO `service` (`gathering`, `venue`, `decoration`, `caterer`, `labour`, `addon`,`total`,`cname`,`clocation`)"
		        + " values (?,?, ?, ?, ?, ?,?,?,?)";		
		PreparedStatement preparedStmt;
		try {
			 	preparedStmt = con.prepareStatement(query);
			 	
			 
			  preparedStmt.setString(1,s1);
		      preparedStmt.setString(2, s2);
		      preparedStmt.setString(3,s3);
		      preparedStmt.setString(4, s4);
		      preparedStmt.setString (5, s5);
		      preparedStmt.setString (6,s6);
		      preparedStmt.setString (7,s7);
		      preparedStmt.setString(8,s8);
		      preparedStmt.setString(9,s9);
		    
		      preparedStmt.execute();
		      System.out.println("query fired");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x3;
	}

	
	//UserRequest
	
	@Override
	public String UserRequest(String r ,String s) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		
		String query ="INSERT INTO `UserR` (`planner`,`user`)"
		        + " values (?,?)";
		       	
		PreparedStatement preparedStmt;
		try {
			 	preparedStmt = con.prepareStatement(query);
			 	
			 
			  preparedStmt.setString(1,r);
			  preparedStmt.setString(2, s);
		     
		    
		      preparedStmt.execute();
		      System.out.println("query fired");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
		
	}

	
	//PlannerRequest
	@Override
	public pb PlannerR(String p) {
		// TODO Auto-generated method stub
		
		init();
		try
		{
			int i=0;
			ResultSet rt;
			rt=st.executeQuery("select user from UserR where planner='" + p +  "'");
			rt.last();
			int n=rt.getRow();
			rt.beforeFirst();
			String data[] = new String[n];
			pb pb1=new pb();
			pb1.setN(n);
			//System.out.println(n+"\n");
			while(rt.next())
			{
				data[i]=rt.getString(1);// enter the no. of name column
				//System.out.println(data[i]);
				i++;
			}
			pb1.setA(data);
			return pb1;
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	/*//PlannerRequest
	@Override
	public request PlannerR(String p) {
		// TODO Auto-generated method stub
		
		init();
		request r=new request();
		ResultSet rr = null;
		String s1="";
		try
		{
			rr = st.executeQuery("select * from UserR where planner='" + p +  "'");
			while(rr.next())
			{
				r.setUname(rr.getString(1));
				s1=s1+rr.getString(2);
			}
			r.setUname(s1);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return r;
		
	}*/
}

/*
 * @Override public String user(String name, String address, String email,
 * String password, String confirm) throws IllegalArgumentException { Session
 * dbSession=new Session("localhost",5984); String dbname="JFY";
 * dbSession.createDatabase(dbname); Database db=dbSession.getDatabase(dbname);
 * Document doc=new Document(); doc.setId("email"); doc.put("name", "1");
 * doc.put("address", "2"); doc.put("email", "3"); doc.put("password", "4");
 * doc.put("confirm","5"); db.saveDocument(doc); Document
 * d=db.getDocument("email"); System.out.println(d.toString());
 */




