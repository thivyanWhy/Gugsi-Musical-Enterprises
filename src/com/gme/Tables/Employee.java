/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gme.Tables;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
    
    private final String USERNAME = "root";
    private final String PASSWORD = "";
    private final String CONN_STRING = "jdbc:mysql://localhost/gme";
    
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    private String firstName = null;
    private String lastName = null;
    private String nicNumber = null;
    private String username = null;
    private String password = null;
    private String title = null;
    private String office = null;    
   
    public Employee(String firstName, String lastName, String nicNumber, String username, String password, String title, String office){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nicNumber = nicNumber;
        this.username = username;
        this.password = password;
        this.title = title;
        this.office = office;
    }
    
    public Employee(){
        
    }
    
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
    
    public void addNewEmployee() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        openConnection();
        
        String query = "INSERT INTO `gme`.`employees` (`NIC_No`, `first_name`, `last_name`, `job_title`, `office`, `username`, `password`) "
                + " VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement ps = null;
        ps = conn.prepareStatement(query);
        ps.setString(1, nicNumber);
        ps.setString(2, firstName);
        ps.setString(3, lastName);
        ps.setString(4, title);
        ps.setString(5, office);
        ps.setString(6, username);
        ps.setString(7, password);
        ps.executeUpdate();
        
        if (ps != null){
            ps.close();
        }
        
        closeConnection();
    }
    
    public String getTitle(){
        
        return title;
    }
    
    public String getOffice(){
        
        return office;
    }
}
