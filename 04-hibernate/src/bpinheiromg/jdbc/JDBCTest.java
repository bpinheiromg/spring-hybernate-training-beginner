package bpinheiromg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String username = "hbstudent";
		String password = "hbstudent";
		
		try {
			Connection myConn = DriverManager.getConnection(jdbcUrl,username,password);
			System.out.println("Connection Successful! "+myConn.getCatalog());
			
		} catch (Exception e) {
			System.err.println("Connection failed: "+e.getLocalizedMessage());
		}
	}
}
