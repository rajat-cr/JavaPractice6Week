/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapractice6week;

import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class JavaPractice6Week {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //jdbc:mysql://localhost:3306/6weekbatch?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]
        SingletonClass conn =  SingletonClass.getInstance();
        
        PracticeFrame screen = new PracticeFrame();
        screen.setVisible(true);
    }
}
