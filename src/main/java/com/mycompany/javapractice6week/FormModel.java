/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapractice6week;

/**
 *
 * @author ASUS
 */
public class FormModel {
    private int id;
    private String name;
        private String email;
            private String contactNo;
                private String password;


    public FormModel(int id, String name, String email, String contactNo, String password) {
        this.id = id;
        this.name = name;
        this.email =email;
        this.contactNo = contactNo;
        this.password = password;
    }
    
    int getid(){
    return id;
    }
    
    String getName(){
    return name;
    }
      String getEmail(){
    return email;
    }
        String getContact(){
    return contactNo;
    }
          String getPassword(){
    return password;
    }
    
}
