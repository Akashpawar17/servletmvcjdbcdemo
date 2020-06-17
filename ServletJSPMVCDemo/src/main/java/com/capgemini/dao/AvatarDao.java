package com.capgemini.dao;

import com.capgemini.model.Avatar;
import java.sql.*;

public class AvatarDao {
	
	
	public Avatar getAvatar(int aid) throws SQLException {
		Avatar a = new Avatar();
		
		
		/*avatar.setAid(101);
		avatar.setAname("akash");
		avatar.setTech("android");
		*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/akash","root","aA@12345");
			Statement st  =conn.createStatement();
		ResultSet rs = 	st.executeQuery("select * from avatar where aid=" +aid);
		
		if(rs.next()) {
			a.setAid(rs.getInt("aid"));
			a.setAname(rs.getString("aname"));
			a.setTech(rs.getString("tech"));
			
		}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return a;
		
	}
	


}
