package com.luv2code.springdemo.testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/TestDB")
public class TestDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
		String user = "springstudent";
		String pass = "springstudent";
		String Driver="com.mysql.jdbc.Driver";

		PrintWriter out = response.getWriter();
		try {
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(url, user, pass);
			connection.close();
			 out = response.getWriter();
			out.println("Success");
		} catch (Exception e) {
			out.println("This is a problem");
			e.printStackTrace();
			throw new ServletException(e);
		}

	}

}
