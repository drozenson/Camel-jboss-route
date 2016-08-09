package com.smartflow.smartflow.mail;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.camel.Properties;
import org.apache.camel.util.MessageDump.Body;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DynamicRouting {

	@SuppressWarnings("resource")
	public String Slip(String body, @Properties Map<String, Object> properties) {
	    // System.out.print(body+"\r\n");
		JSONParser parser = new JSONParser();
		try {
			int invoked=0; 
			
			Object current = properties.get("invoked");
		    if (current != null) {
		        invoked = Integer.valueOf(current.toString());
		    }
		    invoked++;
		    properties.put("invoked", invoked);

		    
			JSONObject json = (JSONObject) parser.parse(body);
			String TargetID = (String) json.get("TargetID");
			Long PublicationID = (Long) json.get("PublicationID");
			String Source = (String) json.get("Source");
	
			MysqlDataSource ds = null;

			ds = new MysqlDataSource();
			ds.setURL("jdbc:mysql://localhost:3306/epo");
			ds.setUser("root");
			ds.setPassword("Password123");
			
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			try {
				con = (Connection) ds.getConnection();
				stmt = (Statement) con.createStatement();
				rs = stmt.executeQuery("select account_number, publication_id, active from subscription where Publication_ID="+PublicationID.toString() + " and active=true");
				String account_number="rejected";
				
				while(rs.next()){
					//System.out.println("account_number="+rs.getString("account_number")+", publication_id="+rs.getString("publication_id")+", active="+rs.getBoolean("active"));
					if(TargetID.equals(rs.getString("account_number")))
					{
						account_number=TargetID;
						
					}
					
				}
				if(account_number.equalsIgnoreCase("rejected")){
					json.replace("TargetID", account_number);
					body=json.toString();
				
				}
				System.out.println("*"+TargetID+"*"+invoked);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
					try {
						if(rs != null) rs.close();
						if(stmt != null) stmt.close();
						if(con != null) con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
			 
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // no more so return null

	    
	    return null;
	    }
}
