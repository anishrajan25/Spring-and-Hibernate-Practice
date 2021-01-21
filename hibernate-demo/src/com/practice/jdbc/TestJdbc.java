package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("Connecting to database");
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successfull");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}