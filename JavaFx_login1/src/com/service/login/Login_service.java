package com.service.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Interface.Login_Interface;

import application.AlertMessage;

public class Login_service implements Login_Interface {
	AlertMessage alert=new AlertMessage();
	@Override
	public boolean Creat_user(String name, String pass) {
		
		boolean status=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
			String query="Insert into user_tabel(USER_NAME,PASSWORD) values(?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, name);
			pst.setString(2, pass);
			pst.execute();
			status=true;
			
		}catch(Exception ex) {
			alert.showAlert("E",ex.toString());
		}
		
		
		return true;
	}

	@Override
	public boolean loginUser(String name, String password) {
		int count=0; 
		try {
			
			 Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
			 String query="Select count(*) from user_tabel where USER_NAME=? and PASSWORD=?";
			 PreparedStatement pst= con.prepareStatement(query);
			 pst.setString(1, name);
			 pst.setString(2, password);
			 ResultSet result= pst.executeQuery();
			 
			 while(result.next()) {
				 count=result.getInt(1);
			 }
			 
			 
		 }catch(Exception ex) {
			 alert.showAlert("E",ex.toString());
			
		 }
		
		if (count==1)return true;
		else return false;
		
	}

}
