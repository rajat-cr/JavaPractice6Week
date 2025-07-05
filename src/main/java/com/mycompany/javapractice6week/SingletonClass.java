/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice6week;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class SingletonClass {
    Connection connection = null;
    
    private static SingletonClass singletonClass = null;
    
    private SingletonClass(){
        //jdbc:mysql://localhost:3306/6weekbatch?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
      try{
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/6weekbatch","root","");
      System.out.println("Database Connectec!");
      if(connection!=null){
          
          String registered  = "CREATE TABLE IF NOT EXISTS registered(id INT AUTO_INCREMENT, name varchar(225), email varchar(225), contactNo varchar(225), password varchar(225), PRIMARY KEY(id))";
         PreparedStatement ps = connection.prepareStatement(registered);
         ps.execute();
         
            String login  = "CREATE TABLE IF NOT EXISTS login(id INT AUTO_INCREMENT, name varchar(225), email varchar(225), PRIMARY KEY(id))";
         PreparedStatement ps1 = connection.prepareStatement(login);
         ps1.execute();
         
         
         
          
      }
      }catch(SQLException exception){
          System.out.println("SQLException :"+exception);
      }
    
    }
    
    public static SingletonClass getInstance(){
    if(singletonClass == null){
        singletonClass = new SingletonClass();
    }
    return singletonClass;
        
    }
    
    
    
}
