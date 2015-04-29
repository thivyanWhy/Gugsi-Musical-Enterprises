/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gme.Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employees {
    
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String CONN_STRING = "jdbc:mysql://localhost/gme";
    
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    private String title = null;
    private String office = null;    
   
    private void openConnection() throws SQLException{
        
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
    }
    
    private void closeConnection() throws SQLException{
        
        if (conn != null){
            
            conn.close();
        }
    }
    
    private void openStatement() throws SQLException{
        
        stmt = conn.createStatement();
    }
    
    private void closeStatement()throws SQLException{
        
        if(stmt != null){
            
            stmt.close(); 
        }
    }
    
    private void executeQuery() throws SQLException{
        
        rs = stmt.executeQuery("SELECT * FROM `employees`");
    }
    
    private void closeResultSet() throws SQLException{
        
        if(rs != null){
            rs.close();
        }
    }
    
    public boolean validateLogin(String username, String password) throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        openConnection();
        openStatement();
        executeQuery();
        
        while(rs.next()){
            
            if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
                
                title = rs.getString("job_title");
                office = rs.getString("office");
               return true; 
            }
        }
        
        closeResultSet();
        closeStatement();
        closeConnection();
        return false;
    } 
    
    public String getTitle(){
        
        return title;
    }
    
    public String getOffice(){
        
        return office;
    }
}
