package com.prac.demo;

import java.sql.*;

public class JDBC_OracleDB_Connection {
	public static void main(String args[]) {
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//step2 create  the connection object  
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CAMPUS", "CAMPUS");

			//step3 create the statement object  
			Statement stmt = con.createStatement();

			//step4 execute query  
			ResultSet rs = stmt.executeQuery("Select * from IUser");
			int count=0;
			while (rs.next()) {
				count++;
				System.out.println(rs.getInt("userid") + "  " + rs.getString("username") + "  " + rs.getString("email"));
			}
			System.out.println("count :"+count);
			//step5 close the connection object  
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}